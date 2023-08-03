package com.example;

import java.time.LocalDate;

public class Cidadao {
    private LocalDate dataNascimento;

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int idade(){
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }

    public String eleitor(){
        int idade = idade();
        // Clean Code
        // if (idade < 16)
        //     return "Não é Eleitor";
        // else if (idade >15 && idade < 18 || idade > 10) 
        //     return "Eleitor facultativo" ;
        // else return "Eleitor obrigatório";

        if (idade < 16)
        return "Não é Eleitor";

        if (idade >15 && idade < 18 || idade > 70) 
        return "Eleitor facultativo" ;
     
        return "Eleitor obrigatório";
    }
}