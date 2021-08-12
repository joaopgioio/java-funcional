package br.com.digitalInovationOne.Aula2.InterfacesFuncionais;

import java.util.function.Consumer;

public class Consumidores {

    public static void main(String[] args) {
        // metodo referente

        // apenas
        // utilizar o parametro de forma que ele foi recebido

        //onsumer<String> imprimirUmaFrase = System.out::println;
        Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello World!");

    }
}
