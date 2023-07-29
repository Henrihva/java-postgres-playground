package com.example;

public class AppClasses {
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

        System.out.println("-------------");

//        Cliente cliente2 = new Cliente();
//        cliente2.setRenda(2000);
//        cliente2.setSexo('s');
//        cliente2.setAnoNascimento(1970);
        Cliente cliente2 = new Cliente(-2000, 'F');
        cliente2.setAnoNascimento(1960);
        cliente2.setNome("Zeila Alves");

        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo : " + cliente2.getSexo());
        System.out.println("Ano .: " + cliente2.getAnoNascimento());
        System.out.println("Nome: " + cliente2.getNome());
        System.err.println("Especial: " + cliente2.isEspecial());

    }
}
