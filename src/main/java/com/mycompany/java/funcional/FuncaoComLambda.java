package com.mycompany.java.funcional;

public class FuncaoComLambda {
    
    public static void main(String[] args) {
        Funcao colocarPrefixo = valor -> "Sr. " + valor;
        System.out.println(colocarPrefixo.gerar("Ephaminondas"));
    }
}
