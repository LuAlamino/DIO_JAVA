package Main.java.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    //Atributo

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProduto() {
        this.estoqueProdutosMap = new HashMap<>();
    }
     public void adicionarProduto(long cod, String nome, int quantidade, double preco ) {

        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));

     }

     public void exibirProduto() {

        System.out.println(estoqueProdutosMap);

     }

     public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();

            }

        }
         return valorTotalEstoque;
     }

public Produto obterProdutoMaisCaro() {
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    if (!estoqueProdutosMap.isEmpty()) {

        for (Produto p : estoqueProdutosMap.values()) {
            if(p.getPreco() > maiorPreco) {
                produtoMaisCaro = p;
            }
        }
    }
    return produtoMaisCaro;

    }

    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();
        estoque.exibirProduto();

        estoque.adicionarProduto(1L, "produto A", 10, 2.3);
        estoque.adicionarProduto(2L, "produto B", 8, 5.9);
        estoque.adicionarProduto(3L, "produto C", 15, 5.7);
        estoque.adicionarProduto(4L, "produto D", 2, 3.5);
        estoque.adicionarProduto(5L, "produto E", 5, 4.9);

        estoque.exibirProduto();

        System.out.println("Valor total do estoque: R$ " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais Caro: " + estoque.obterProdutoMaisCaro());


    }

}
