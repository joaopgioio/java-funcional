package br.com.digitalInovationOne.Aula2.InterfacesFuncionais;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(retornarNomeAoContrario.apply( "joao"));
        Function<String, Integer> converteParaInteiroECalculaODobro = string -> Integer.valueOf(string)*2;
        System.out.println(converteParaInteiroECalculaODobro.apply("20"));
    }
}
