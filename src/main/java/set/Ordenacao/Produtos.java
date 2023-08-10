package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produtos implements Comparable<Produtos>{
    private String nome;
    private long cod;
    private double preco;
    private int quantidade;

    public Produtos(String nome, long cod, double preco, int quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produtos p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produtos produtos)) return false;
        return getCod() == produtos.getCod();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod());
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", cod=" + cod +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}

class ComparatorPorPreco implements Comparator<Produtos> {

    @Override
    public int compare(Produtos p1, Produtos p2) {
        return Double.compare(p1.getPreco(),p2.getPreco());
    }
}
