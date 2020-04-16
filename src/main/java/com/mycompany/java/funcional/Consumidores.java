package com.mycompany.java.funcional;

import java.util.function.Consumer;

public class Consumidores {
    
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;
        Consumer<String> imprimir = texto -> System.out.println(texto);
        
        print.accept("Hello World");
        imprimir.accept("Olá Mundo");
    }
}
