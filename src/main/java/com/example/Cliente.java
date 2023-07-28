package com.example;

public class Cliente{
    // incluir o public  na calss Cliente
    // Nessa etapa foi movida a classe para "fora" da classe main  --- siga os passos na IDE VSCODE
    //  Selecione a classe Cliente e botão direiot do maouse - escolha opção Refector -- depois MOVE ... e new file 
    // Obs. O nome do arquivo tem que ser o mesmo da classe 

    // somente a classe pode alterar o atributo  = private
    private double renda; 
    private char sexo;
    private int anoNascimento;
    private boolean especial = false; 

    public Cliente(){
        // exemplo de como definir atributos pelo construtor 
        System.out.println("Criando um Objeto CLiente");
        double aleatorio = Math.random();
        if (aleatorio > 0.5)
            especial = true;
    }

    public double getRenda(){
        return renda;
    }

    // metodo get para um boolean é =is e nao get ....
    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
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
        // if (sexo == 'M' || sexo =='F')
        if (sexo == 'M' || sexo =='F' || sexo == 'm' || sexo =='f')
            this.sexo = sexo;
        else System.out.println("Sexo inválido");
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

}