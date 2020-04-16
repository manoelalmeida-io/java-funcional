package com.mycompany.java.funcional;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    
    public static void main(String[] args) {
        int valor = 20;
        
        UnaryOperator<Integer> retornarDobro = v -> v * 2;
        
        System.out.println(retornarDobro.apply(valor)); // Retorna o dobro do valor.
        System.out.println(valor); // Variável valor não é alterado.
    }
}
