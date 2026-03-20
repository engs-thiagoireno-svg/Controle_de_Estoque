package Att_05;

public class Produto {
    
    String nome;
    double precoCusto;
    double precoVenda;
    int qtdEstoque;

    public Produto(String nome, double precoCusto, double precoVenda, int qtdEstoque) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.qtdEstoque = qtdEstoque;
    }

    public double lucroPresumido() {
        return (precoVenda - precoCusto) * qtdEstoque;
    }

    public void vender(int qtd) {

        if (qtd <= qtdEstoque) {
            qtdEstoque -= qtd;
            System.out.println("Venda realizada");
        } else {
            System.out.println("Estoque insuficiente");
        }
    }

    public void mostrarProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Estoque: " + qtdEstoque);
    }
}