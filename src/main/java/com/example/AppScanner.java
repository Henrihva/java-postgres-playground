package com.example;

import java.util.Scanner;

public class AppScanner {
    public static void main(String[] args) {
        System.out.println(" Criando uma Classe - Inicio ");

        Cliente cliente = new Cliente();
        //System.out.println(cliente);
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("-------------");

        System.out.println("Digite seu Nome: ");
        cliente.setNome(scanner.nextLine());
        System.out.println("Digite seu CPF: ");
        cliente.setCpf(scanner.nextLine());
        System.out.println("Digite a Cidade: ");
        cliente.setCidade(scanner.nextLine());
        System.out.println("Digite a Renda: ");
        cliente.setRenda(scanner.nextDouble());
        System.out.println("Digite o Ano Nascimento: ");
        cliente.setAnoNascimento(scanner.nextInt());
        System.out.println("Digite o Sexo: ");
        scanner.nextLine();
        String sexo = scanner.nextLine();
        cliente.setSexo(sexo.charAt(0));
       

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Nome: " + cliente.getCpf());
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo : " + cliente.getSexo());
        System.out.println("Ano .: " + cliente.getAnoNascimento());
        System.err.println("Especial: " + cliente.isEspecial());
        
        
    }
}
