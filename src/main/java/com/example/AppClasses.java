package com.example;

class Cliente{
    double renda;
    char sexo;
    int anoNascimento;

    double getRenda(){
        return renda;
    }

    void SetRenda(double renda){
        this.renda = renda ;


        // identificando o valor dentro do metodo 
        // renda = renda ;
        //System.out.println("Renda Metodo: " + renda);
    }
}

public class AppClasses {
    public static void main(String[] args) {
        System.out.println(" Criando uma Classe - Inicio ");

        Cliente cliente = new Cliente();
        cliente.SetRenda(-10000);
        cliente.sexo = 'M';
        cliente.anoNascimento = 1980;

        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo : " + cliente.sexo);
        System.out.println("Ano .: " + cliente.anoNascimento);

        Cliente cliente2 = new Cliente();
        cliente2.SetRenda(2000);
        cliente2.sexo = 'F';
        cliente2.anoNascimento = 1970;

        System.out.println("-------------");

        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo : " + cliente2.sexo);
        System.out.println("Ano .: " + cliente2.anoNascimento);

    }
}
