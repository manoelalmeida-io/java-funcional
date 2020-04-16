package com.mycompany.java.funcional;

import java.util.function.Supplier;

public class Supridores {
    
    public static void main(String[] args) {
        Supplier<Pessoa> novaPessoa = Pessoa::new;
        System.out.println(novaPessoa.get());
    }
}

class Pessoa {
    private String nome;
    private Integer idade;
    
    public Pessoa() {
        this.nome = "João";
        this.idade = 23;
    }

    @Override
    public String toString() {
        return String.format("nome: %s, idade %d", nome, idade);
    }
}
