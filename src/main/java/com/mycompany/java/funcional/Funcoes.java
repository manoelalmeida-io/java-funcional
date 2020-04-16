package com.mycompany.java.funcional;

import java.util.function.Function;

public class Funcoes {

    public static void main(String[] args) {
        Function<String, String> contrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> dobro = texto -> Integer.valueOf(texto) * 2;
        
        System.out.println(contrario.apply("ephaminondas"));
        System.out.println(dobro.apply("20"));
    }
}
