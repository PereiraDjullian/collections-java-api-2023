package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public Set<String> getPalavrasSet() {
        return palavrasSet;
    }

    public void adicionarPalavra(String palavra) {
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(!palavrasSet.isEmpty()){
            palavrasSet.remove(palavra);
        }
        else{
            System.out.println("O conjunto está vazio");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 3");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 4");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Palavra 2");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Palavra 5");
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Palavra 2"));

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }

}
