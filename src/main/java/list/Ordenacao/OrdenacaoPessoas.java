package main.java.list.Ordenacao;
import java.util.Collections;
import  java.util.List;
import java.util.ArrayList;
public class OrdenacaoPessoas {
    private List<Pessoa> pessoasList;

    public OrdenacaoPessoas() {
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoasList.add(new  Pessoa(nome, idade, altura));

    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;

    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoaPorAltura,new ComparatorPorAltura());
        return pessoaPorAltura;

    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoa = new OrdenacaoPessoas();
        ordenacaoPessoa.adicionarPessoa("nome1",18,2.1);
        ordenacaoPessoa.adicionarPessoa("nome2",19,2.2);
        ordenacaoPessoa.adicionarPessoa("nome3",17,2.9);

        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.pessoasList);
    }


}
