package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AppLista {
    public static void main(String[] args) {
        // Retrocompatibilidade - versoes anteriores do JAVA
        // List lista = new LinkedList();
        // lista.add(new Cliente());
        // lista.add(new Cidadao());
        // lista.add("Isto é uma String");
        // lista.add(123);
        // System.out.println(lista);


        //List<Cliente> listaClientes = new ArrayList<>(11) ; // para este exemplo 
        List<Cliente> listaClientes = new LinkedList<>() ;

        var cliente1 = new Cliente();
        cliente1.setNome("Manoel");
        // adicionado a cidade pois esta listando null 
        cliente1.setCidade("Uberlandia");

        var cliente2 = new Cliente();
        cliente2.setNome("Breno");
        cliente2.setCidade("Uberaba");

        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente2);
        listaClientes.add(cliente2);

        // remover cliente da lista 

        listaClientes.remove(0);
        listaClientes.remove(0);
        listaClientes.remove(0);

        listaClientes.remove(cliente1);
        int i = listaClientes.size() -1 ;

        listaClientes.remove(i);

        //System.out.println(listaClientes);
        
        for (Cliente cliente : listaClientes) {
           //System.err.println(cliente); 
           System.out.println(cliente);
        }
    }
}
