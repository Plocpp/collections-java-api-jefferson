package main.java.list.Ordenacao;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibiProdutoPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto>exibirPorPreco(){
        Set<Produto>produtoPorPreco = new TreeSet<>(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastrarProduto = new CadastroProdutos();

        cadastrarProduto.adicionarProduto(1l , "leite", 15d, 5);
        cadastrarProduto.adicionarProduto(2l , "manteiga", 17d, 10);
        cadastrarProduto.adicionarProduto(3l , "creme de leite", 20d, 2);
        cadastrarProduto.adicionarProduto(4l , "margarina", 10d, 3);
        cadastrarProduto.adicionarProduto(5l , "requeijão", 2d, 8);

        System.out.println(cadastrarProduto.produtoSet);

        System.out.println("Exibindo Produtos por Nome: "+ cadastrarProduto.exibiProdutoPorNome());

        System.out.println("Exbindo Produtos por Codigo:" +cadastrarProduto.exibirPorPreco());

    }

}
