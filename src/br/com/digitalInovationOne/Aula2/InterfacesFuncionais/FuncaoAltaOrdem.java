package br.com.digitalInovationOne.Aula2.InterfacesFuncionais;

public class FuncaoAltaOrdem {

        public static void main(String[] args) {
                Calculo soma = (a,b) -> a+b;
                Calculo subtracao = (a,b) -> a-b;
                Calculo divisao = (a,b) -> a/b;
                Calculo mult = (a,b) -> a*b;
                System.out.println(exectarOperacao(soma, 1, 3)); // 4
                System.out.println(exectarOperacao(subtracao, 4, 3)); // 1
                System.out.println(exectarOperacao(divisao, 6, 3)); // 2
                System.out.println(exectarOperacao(mult, 4, 3)); //12
        }

        public static int exectarOperacao(Calculo calculo, int a, int b){
                return calculo.calcular(a,b);
        }
}
@FunctionalInterface
interface Calculo{
        public int calcular(int a, int b);
}