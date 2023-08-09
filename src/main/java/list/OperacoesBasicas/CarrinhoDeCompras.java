package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();

    }
    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome,preco,quantidade));

    }
    public void removerItem(String nome){
        List<Item> itemRemover = new ArrayList<>();

        if(!itemList.isEmpty()){
            for(Item i : itemList){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itemRemover.add(i);
                }
            }
            itemList.removeAll(itemRemover);
        }
        else{
            System.out.println("Lista Vazia");
        }
    }
    public  double calcularValorTotal(){
        double valorTotal = 0;
        for(Item i : itemList){
            valorTotal += i.getPreco()*i.getQuantidade();
        }
        return valorTotal;

    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("teste",200.1,3);
        System.out.println(carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();


    }


}

