package com.mycompany.java.funcional;

public class FuncaoComClasseAnonima {
    
    public static void main(String[] args) {
        Funcao colocarPrefixo = new Funcao() {
            @Override
            public String gerar(String valor) {
                return "Sr. " + valor;
            }
        };
        
        System.out.println(colocarPrefixo.gerar("Ephaminondas"));
    }
}
