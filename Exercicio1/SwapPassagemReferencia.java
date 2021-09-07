package Exercicio1;

import java.util.Arrays;

public class SwapPassagemReferencia {
    /**
    * É impossível fazer um método swap simples passando valores por referência em Java, já que esta
    * linguagem só aceita passagem por valor para tipos primitivos.
    *
    * Uma possibilidade de se efetuar uma troca simples em Java é fazer a passagem do primeiro parâmetro
    * para o swap antes do segundo parâmetro ser atribuído ao primeiro e, em seguida, retornar
    * o primeiro parâmetro que será atribuído ao segundo.
    * @param
    */
    public int swap(int a, int b){
        return a;
    }

    public static void main(String[] args){
        int value = 2;
        int[] list = {1, 3, 5, 7, 9};
        SwapPassagemReferencia teste = new SwapPassagemReferencia();

        System.out.println("Valores originais:\n"+ "value = " + value + "\nlist = " + Arrays.toString(list));

        System.out.println("Passagem 1 (swap de value = " +  value + " com list[0] = " +  list[0] + ")");
        list[0] = teste.swap(value, value = list[0]);
        System.out.println("value = " +  value + "\nlist = " + Arrays.toString(list));

        System.out.println("Passagem 2:(swap de list[0] = " +  list[0] + " com list[1] = " +  list[1] +")");
        list[1] = teste.swap(list[0], list[0] = list[1]);
        System.out.println("value = " +  value + "\nlist = " + Arrays.toString(list));

        System.out.println("Passagem 3:(swap de value = " +  value + " com list[value] = list["+  value +"] = " + list[value] + ")");
        list[value] = teste.swap(value, value = list[value]);
        System.out.println("value = " + value + "\nlist = " + Arrays.toString(list));
    }
}
