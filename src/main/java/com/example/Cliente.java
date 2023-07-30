package com.example;

public class Cliente{
    // incluir o public  na calss Cliente
    // Nessa etapa foi movida a classe para "fora" da classe main  --- siga os passos na IDE VSCODE
    //  Selecione a classe Cliente e botão direiot do maouse - escolha opção Refector -- depois MOVE ... e new file 
    // Obs. O nome do arquivo tem que ser o mesmo da classe 

    // somente a classe pode alterar o atributo  = private
    private String nome ;
    private double renda; 
    private char sexo;
    private int anoNascimento;
    private boolean especial; //  = false;  por feault todo boolean é false 
    private String cpf;
    private String cidade;
    

   public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

 // public void Cliente() -->> definido desta forma não é um construtor não pode ter void ("retorno")
    public Cliente(){
        // exemplo de como definir atributos pelo construtor 
        System.out.println("Criando um Objeto CLiente usando o construtor sem parâmetros");
        double aleatorio = Math.random();
        if (aleatorio > 0.5)
            especial = true;
    }

    public Cliente(double renda, char sexo ){
        this(); // chamando o construtor default do objeto  , se informar parametros vc chama o construtor que temha aqueles parametros 
        // exemplo de como definir atributos pelo construtor 
        System.out.println("Criando um Objeto CLiente usando o construtor com parâmetros");
//        double aleatorio = Math.random();
//        if (aleatorio > 0.5)
//            especial = true;
        // this.renda = renda; troca pela linha abaixo pois se chamar o contrutor e passar valor negativo ele criar
        // então neste caso eu tenho que chamar o setter da renda aqui no construtor 
        setRenda(renda);
        this.sexo = sexo; 

    }

  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        //this.nome = nome;
        //this.nome = nome.toUpperCase();
        if (nome.isEmpty()){
            System.out.println("Nome não pode ser Vazio ");
            nome = "Vazio";
        }
        this.nome = nome.toLowerCase();
        this.nome = nome.toLowerCase().trim();            
    
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
     

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}