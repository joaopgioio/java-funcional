package br.com.digitalInovationOne.Aula1.ParadgmaFuncionalJava.FatorialRecursivo;

import java.util.function.UnaryOperator;

public class Aula {
    public static void main(String[] args) {
        UnaryOperator<Integer> calcularValorVezesTres = valor -> valor*3;
        int valor = 10;
        System.out.println("O Resultado é :: "+calcularValorVezesTres.apply(valor));
    }
}
