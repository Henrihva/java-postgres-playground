package com.example;

import java.util.Arrays;

public class AppArray {

    public static void main(String[] args) {
        int xVetor[] ={10,20,30,30,50};
        System.out.println("Valores do Array: " + Arrays.toString(xVetor));

        int vetor3 [] = new int[4];

        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = 100 * (i+1);
        }
        // vetor3[0]= 100;
        // vetor3[1]= 200;
        // vetor3[2]= 300;
        // vetor3[3]= 400;

        System.out.println(Arrays.toString(vetor3));

//        double matriz[] [] = {{10,20,30,}, {40,50,60}};
        double matriz[][] = new double[2][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz [i][j] = (i * matriz[i].length + j+1) * 10 ;
                
            }
        }

       // System.out.print("[ ");                
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.print(matriz[i][j] + " ");                
                System.out.printf("[%5.1f]", matriz[i][j] );                
            }
            System.out.println(" ");
        }


        System.out.println("---------------------");
        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));
    }
    
}
