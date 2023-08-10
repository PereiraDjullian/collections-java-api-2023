package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produtos> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long cod, double preco, int quantidade) {
        produtosSet.add(new Produtos(nome, cod, preco, quantidade));
    }

    public Set<Produtos> exibirProdutosPorNome() {
        Set<Produtos> produtosPorNome = new TreeSet<>(produtosSet);//treeset deixa organizado comparable
        return produtosPorNome;
    }

    public Set<Produtos> exibirProdutosPorPreco(){
        Set<Produtos> produtosPorPreco = new TreeSet<>();
        produtosSet.addAll(produtosSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("Produto 5",1L , 15, 5);
        cadastroProdutos.adicionarProduto("Produto 0", 2L, 20, 10);
        cadastroProdutos.adicionarProduto("Produto 3",3L , 10, 2);
        cadastroProdutos.adicionarProduto("Produto 9",4L , 2, 2);

        System.out.println(cadastroProdutos.produtosSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }



}
