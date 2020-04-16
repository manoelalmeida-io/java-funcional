package com.mycompany.java.funcional;

import java.util.stream.Stream;

public class Iteracoes {
    
    public static void main(String[] args) {
        String[] nomes = { "João", "Ephaminondas", "Cesar", "Marcos" };
        Integer[] numeros = { 1, 2, 3, 4, 5 };
        
        imprimirTodos(nomes);
        System.out.println("-------------------");
        imprimirFiltrado(nomes);
        System.out.println("-------------------");
        imprimirDobro(numeros);
    }
    
    private static void imprimirTodos(String... nomes) {
        Stream.of(nomes)
                .forEach(System.out::println);
    }
    
    private static void imprimirFiltrado(String... nomes) {
        Stream.of(nomes)
                .filter(nome -> nome.toLowerCase().contains("m"))
                .forEach(System.out::println);
    }
    
    private static void imprimirDobro(Integer... numeros) {
        Stream.of(numeros)
                .map(numero -> numero * 2)
                .forEach(System.out::println);
    }
}
