package com.example;

class Cliente{
    // somente a classe pode alterar o atributo  = private
    private double renda; 
    private char sexo;
    private int anoNascimento;


    public double getRenda(){
        return renda;
    }

    public void setRenda(double renda){
        if(renda >= 0)
            this.renda = renda ;
        else System.out.println("A renda deve ser maior que Zero");

        // identificando o valor dentro do metodo 
        // renda = renda ;
        //System.out.println("Renda Metodo: " + renda);
    }
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

}

public class AppClasses {
    public static void main(String[] args) {
        System.out.println(" Criando uma Classe - Inicio ");

        Cliente cliente = new Cliente();
        cliente.setRenda(-10000);
        cliente.setSexo('M');
        cliente.setAnoNascimento(1980);

        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo : " + cliente.getSexo());
        System.out.println("Ano .: " + cliente.getAnoNascimento());

        Cliente cliente2 = new Cliente();
        cliente2.setRenda(2000);
        cliente2.setSexo('F');
        cliente2.setAnoNascimento(1970);

        System.out.println("-------------");

        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo : " + cliente2.getSexo());
        System.out.println("Ano .: " + cliente2.getAnoNascimento());

    }
}
