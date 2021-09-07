package Exercicio1;

import java.util.Arrays;

/**
 * A passagem por valor-resultado é um modelo de implementação para parâmetros
 * de entrada e saída no qual são copiados os valores reais.
 *
 * Java não permite este tipo de implementação.
 */
public class SwapPassagemValorResultado {
    public void swapPassagemValorResultado(int a, int b){
        int temp = a;

        a = b;
        b = temp;
    }

    public static void main(String[] args){
        int value = 2;
        int[] list = {1, 3, 5, 7, 9};
        SwapPassagemValorResultado teste1 = new SwapPassagemValorResultado();

        System.out.println("Passagem por valor ------------------------------------------");
        System.out.println("Valores originais:\n"+ "value = " + value + "\nlist = " + Arrays.toString(list));



    }
}
