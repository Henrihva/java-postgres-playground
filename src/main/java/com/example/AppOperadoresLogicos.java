package com.example;


public class AppOperadoresLogicos {
    boolean a(boolean valor){
        System.out.println("a=" + valor);
        return valor;
    }
    boolean b(boolean valor){
        System.out.println("b=" + valor);
        return valor;
    }
    boolean c(boolean valor){
        System.out.println("C=" + valor);
        return valor;
    }

    AppOperadoresLogicos(){
        System.out.println("AVALIAR O  SHORT CIRCUIT ");        
        System.out.println("------------&&------------");
        System.out.println(a(true) && b(true) && c(true));
        System.out.println("------------1-------------");
        System.out.println(a(true) && b(true) && c(false));
        System.out.println("------------2-------------");
        System.out.println(a(true) && b(false) && c(true));
        System.out.println("------------3-------------");
        System.out.println(a(true) && b(false) && c(false));
        System.out.println("------------4-------------");
        System.out.println(a(false) && b(true) && c(true));
        System.out.println("------------5-------------");
        System.out.println(a(false) && b(true) && c(false));
        System.out.println("------------6-------------");
        System.out.println(a(false) && b(false) && c(true));
        System.out.println("------------7-------------");
        System.out.println(a(false) && b(false) && c(false));
        System.out.println("------------8-------------");

        System.out.println("------------||------------");
        System.out.println(a(true) || b(true) || c(true));
        System.out.println("------------1-------------");
        System.out.println(a(true) || b(true) || c(false));
        System.out.println("------------2-------------");
        System.out.println(a(true) || b(false) || c(true));
        System.out.println("------------3-------------");
        System.out.println(a(true) || b(false) || c(false));
        System.out.println("------------4-------------");
        System.out.println(a(false) || b(true) || c(true));
        System.out.println("------------5-------------");
        System.out.println(a(false) || b(true) || c(false));
        System.out.println("------------6-------------");
        System.out.println(a(false) || b(false) || c(true));
        System.out.println("------------7-------------");
        System.out.println(a(false) || b(false) || c(false));
        System.out.println("------------8-------------");
    }
    public static void main(String[] args) {
        //boolean a=true, b=false, c=true ;
        //System.out.println(a && b && c);
        //System.out.println(a || b || c);
        //System.out.println(a && b || c);

        // agora esta dando erro por cvausa do metodo static 
        // dentro de um metodo statica vc não consegue chamar um metodo que não seja static

        new AppOperadoresLogicos();

        // precedencia em operadores aritimeticos 
        // essa expressão da resultado 2 
        // x++ * y/x
        // 1 * 4/2       -> 1a etapa 
        // 1 * 2  = 2    - final

        // agora invertendo o sinal ++
        // ++x * y/x
        // 2 * 4/2
        // * * 2 = 4
        //
    }
}
