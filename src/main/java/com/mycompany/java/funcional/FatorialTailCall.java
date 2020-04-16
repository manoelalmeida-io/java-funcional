package com.mycompany.java.funcional;

public class FatorialTailCall {
    
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }
    
    public static int fatorial(int valor) {
        return fatorialComTailCall(valor, 1);
    }
    
    public static int fatorialComTailCall(int valor, int numero) {
        if (valor == 0) {
            return numero;
        }
        return fatorialComTailCall(valor - 1, numero * valor);
    }
}
