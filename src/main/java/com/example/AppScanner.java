package com.example;

public class AppScanner {
    public static void main(String[] args) {
        System.out.println(" Criando uma Classe - Inicio ");

        Cliente cliente = new Cliente();
        //System.out.println(cliente);
      
        System.out.println("-------------");

        cliente.setRenda(-10000);
        cliente.setSexo('M');
        cliente.setAnoNascimento(1980);
        cliente.setNome("Henri Alves");

        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo : " + cliente.getSexo());
        System.out.println("Ano .: " + cliente.getAnoNascimento());
        System.err.println("Especial: " + cliente.isEspecial());
        System.out.println("Nome: " + cliente.getNome());

        
    }
}
