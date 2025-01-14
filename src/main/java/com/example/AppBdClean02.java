package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppBdClean02 {
    // parametros drive:banco://endereço/nome do banco, usuario , senha 
    private static final String PASSWORD = "";
    private static final String USERNAME = "gitpod";
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";
    public static void main(String[] args) {
        new AppBdClean02();
    }

    // criando um construtor pois tirou o static dos metodos
    public AppBdClean02(){
        try (var conn = getConnection()){
             carregarDriverJDBC(); 
            
            // listarEstados(conn); 
            // localizarEstado(conn, "TO");
            // listarDadosTabela(conn, "cliente");
            listarDadosTabela(conn, "produto");
        } catch (SQLException e) {
                System.err.println("Não foi possível conectar ao banco de dados:  " + e.getMessage());
        }
    }

    private void listarDadosTabela(Connection conn, String tabela) {
        // neste caso o usuario não vai digitar o nome da tabela = variavel 
        // se for em campo digitado, vc dentro da aplicação tem que limpar os caracteres que não quer 
        var sql = "select * from "  + tabela;    
        System.out.println(sql);
        try {
            var statement = conn.createStatement();
            var result = statement.executeQuery(sql);

            var metadada = result.getMetaData();
            int cols = metadada.getColumnCount();

            for (int i = 1; i <= cols; i++) {
                System.out.printf("%-30s ! ", metadada.getColumnName(i));
            }
            System.out.println();
            
            while(result.next()) {
                for (int i = 1; i <= cols; i++) {
                    System.out.printf("%-30s ! ", result.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException e) {
            System.err.println("Erro na execução da consulta " + e.getMessage());
        }

    }

    private void localizarEstado(Connection conn, String uf) {
        try{
            var sql = "select * from estado where uf = ?";
            var statement = conn.prepareStatement(sql);
            System.out.println(sql);
            statement.setString(1, uf);
            var result = statement.executeQuery();
            if (result.next()){
                System.out.printf("Id: %d Nome: %s UF: %s \n ", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            } 
        } catch (SQLException e) {
            System.err.println("Não foi possível executar a consulta no banco de dados:  " + e.getMessage());
        }
    }

    private void listarEstados(Connection conn) {
        try {
            System.out.println("COnexão com o banco realizada com sucesso!");
            
            var statement = conn.createStatement();
            var result = statement.executeQuery(" select * from estado");
            while(result.next()){
                System.out.printf("Id: %d Nome: %s UF: %s \n ", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }
        } catch (SQLException e) {
            System.err.println("Não foi possível executar a consulta no banco de dados:  " + e.getMessage());
        }
    }

    private Connection getConnection () throws SQLException{
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }
    private void carregarDriverJDBC() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possível carregar a biblioteca para acesso ao banco de dados"  + e.getMessage());
        }
    }
}
