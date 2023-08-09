package main.java.list.Pesquisa;
import java.util.List;
import java.util.ArrayList;


public class SomaNumeros {
    private List<Integer> integerList;

    public SomaNumeros() {
        this.integerList = new ArrayList();
    }

    public void adicionarNumero(int numero){
        integerList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if(!integerList.isEmpty()){
            for(Integer n:integerList){
                soma+=n;

            }
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!integerList.isEmpty()){
            for(Integer m:integerList){
                if(m>=maiorNumero){
                    maiorNumero =m;
                }

            }
        }
        return maiorNumero;
    }
    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!integerList.isEmpty()){
            for(Integer m:integerList){
                if(m<=menorNumero){
                    menorNumero= m;
                }

            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        System.out.println(integerList);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);
        somaNumeros.exibirNumeros();

        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
