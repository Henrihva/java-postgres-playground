package com.example;

class Cliente{
    double renda;
    char sexo;
    int anoNascimento;
}

public class AppClasses {
    public static void main(String[] args) {
        System.out.println(" Criando uma Classe - Inicio ");

        Cliente cliente = new Cliente();
        cliente.renda = 1000;
        cliente.sexo = 'M';
        cliente.anoNascimento = 1980;

        System.out.println("Renda: " + cliente.renda);
        System.out.println("Sexo : " + cliente.sexo);
        System.out.println("Ano .: " + cliente.anoNascimento);


    }
}
