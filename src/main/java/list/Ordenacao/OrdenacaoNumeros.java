package main.java.list.Ordenacao;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class OrdenacaoNumeros {
    private List<Integer> integerList;

    public OrdenacaoNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        integerList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscencente = new ArrayList<>(this.integerList);
        if(!integerList.isEmpty()){
            Collections.sort(numerosAscencente);
        }
        else{
            System.out.println("Lista vazia!");
        }
        return numerosAscencente;


    }
    public List<Integer> ordenarDescendente(){
        List<Integer> numerosAscencente = new ArrayList<>(this.integerList);
        if(!integerList.isEmpty()){
            numerosAscencente.sort(Collections.reverseOrder());
        }
        else{
            System.out.println("Lista vazia!");
        }
        return numerosAscencente;

    }

    public void exibirNumeros(){
        System.out.println(this.integerList);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());
        numeros.exibirNumeros();

        System.out.println(numeros.ordenarDescendente());
        numeros.exibirNumeros();
    }


}
