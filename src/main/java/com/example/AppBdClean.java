package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppBdClean {
    private static final String PASSWORD = "";
    private static final String USERNAME = "gitpod";
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";
    // private Connection conn; 
    public static void main(String[] args) {
        new AppBdClean();

    }

    // criando um construtor pois tirou o static dos metodos
    public AppBdClean(){
        //CarregarDriverJDBC();
        try (var conn = getConnection()){
            listarEstados(conn); 
            localizarEstado(conn, "TO");
        } catch (SQLException e) {
                System.err.println("Não foi possível conectar ao banco de dados:  " + e.getMessage());
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
            
//        Statement statement = null;
//        try (var conn = getConnection()){
        try {
            // parametros 1o= o drive:banco://endereço/nomedo banco, usuario , senha 
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
    private void CarregarDriverJDBC() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possível carregar a biblioteca para acesso ao banco de dados"  + e.getMessage());
        }
    }
}
