package com.example;

public class AppOperadoresRelacionais {
    public static void main(String[] args) {
        // operadores aritimeticos 
        // soma             +
        // subtração        -
        // divisão          /   
        // multiplicação    *

        // Operadores Relacionais 
        // 1. Igualdade        ==
        // 2. Diferença        != 
        // 3. Maior            >
        // 4. Menor            <
        // 5. Maior ou igual   >=
        // 6. Menor ou igual   <=


        var cliente1 = new Cliente();
        cliente1.setAnoNascimento(1980);        

        var cliente2 = new Cliente();
        cliente2.setAnoNascimento(1970);        

        if (cliente1.getAnoNascimento() == cliente2.getAnoNascimento())
            System.out.println("Os clientes nasceram no mesmo ANO");

            if(cliente1.getAnoNascimento() > cliente2.getAnoNascimento()) {
                System. out. println("Cliente 1 é mais jovem que o cliente 2");
            }
            else if(cliente1.getAnoNascimento() < cliente2.getAnoNascimento()){
                System. out. println("0 cliente 1 é mais velho que o cliente 2");
            }
            else System.out.println("0s clientes têm a mesma idade");
    }

    // Operadores Lógicos 
    //Negação: não (not)    !
    //Conjunção: e (and)    &&
    //Disjunção: ou (or)    ||


}
