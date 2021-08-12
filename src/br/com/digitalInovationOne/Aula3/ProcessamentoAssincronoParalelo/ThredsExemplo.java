package br.com.digitalInovationOne.Aula3.ProcessamentoAssincronoParalelo;

public class ThredsExemplo {

    public static void main(String[] args) {
        Thread thread = new Thread(new BarraDeCarregamento2());
        Thread thread2 = new Thread(new BarraDeCarregamento2());

        thread.start();
        thread2.start();
        System.out.println("Nome da thred :" +thread.getName());
        System.out.println("Nome da thred :" +thread2.getName());
    }
}

class GerarPdf implements Runnable{
    @Override
    public void run(){
        System.out.println("Gerar PDF");
    }
}

class  BarraDeCarregamento implements Runnable{
    @Override
    public void run(){
        System.out.println("loading ...");
    }
}

class BarraDeCarregamento2 extends Thread {
    @Override
    public void run(){
        super.run();

        try {
            Thread.sleep(1000);
            System.out.println("rodei BarraDeCarregamento2 " +this.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class BarraDeCarregamento3 extends Thread {
    @Override
    public void run(){
        super.run();

        try {
            Thread.sleep(3000);
            System.out.println("rodei BarraDeCarregamento3 " +this.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}