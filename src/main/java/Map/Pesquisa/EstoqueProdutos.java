package main.java.Map.Pesquisa;

import java.util.Map;

public class EstoqueProdutos {
    private Map< Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = estoqueProdutosMap;
    }
    public void adicionarProduto(long cod, String nome, int quantidade, double preco ){
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));

    }

    public void exibirProduto(){
        System.out.println(estoqueProdutosMap);
    }

    public Double calcularValorTotalEstoque(){
        double valorTotalEstoque =0;
        if(estoqueProdutosMap.isEmpty()){
            for(Produto p:estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
            if(estoqueProdutosMap.isEmpty()){
                for(Produto p:estoqueProdutosMap.values()){
                    if(p.getPreco() > maiorPreco){
                        produtoMaisCaro = p;
                        maiorPreco = p.getPreco();
                    }
                }
            }

        return produtoMaisCaro;
    }
    public Produto obterProdutomaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(estoqueProdutosMap.isEmpty()){
            for(Produto  p : estoqueProdutosMap.values()){
                if(p.getPreco() < menorPreco){
                    produtoMaisBarato =p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }


    public static void main(String[] args) {

        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1L,"produto A", 10, 5.0);
        estoque.adicionarProduto(2L,"produto B", 5, 10.0);
        estoque.adicionarProduto(3L,"produto C", 2, 15.0);
        estoque.adicionarProduto(4L,"produto D", 2, 25.0);
        estoque.adicionarProduto(5L,"produto E", 7, 10.0);

        estoque.exibirProduto();

        System.out.println("Valor total do estoque : R$"+estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: "+estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: "+estoque.obterProdutomaisBarato());

    }


}
