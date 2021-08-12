package br.com.digitalInovationOne.Aula1.ParadgmaFuncionalJava.FatorialRecursivo;

public class Aula2 {

    public static void main(String[] args) {
        Funcao1 funcao1 = valor -> {
            System.out.println(valor);
            System.out.println(valor);
        //System.out.println(funcao1.gerar("Joao Paulo"));
        };
    funcao1.gerar("João");
    }
}

interface Funcao1{
    void gerar(String valor);
}