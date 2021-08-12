package br.com.digitalInovationOne.Aula2.InterfacesFuncionais;

import java.util.function.Supplier;

public class Supridores {

    public static void main(String[] args) {
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
        Supplier<Pessoa> instanciaPessoa2 = Pessoa::new;
        System.out.println(instanciaPessoa);  /// retorna hash
        System.out.println(instanciaPessoa.get());
        System.out.println(instanciaPessoa2.get());

    }
}

class Pessoa{
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "joao";
        idade = 23;
    }

    @Override
    public String toString(){
        return String.format("nome: %s, idade: %d", nome, idade);
    }
}
