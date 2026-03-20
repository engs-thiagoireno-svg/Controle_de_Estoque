package Att_05;

public class Main {

    public static void main(String[] args) {

        Produto p = new Produto("Mouse", 20, 50, 10);

        p.mostrarProduto();

        System.out.println("Lucro presumido: " + p.lucroPresumido());

        p.vender(5);
        p.mostrarProduto();

        p.vender(10);
    }
}