import java.util.Arrays;

/**
 * A passagem por valor-resultado é um modelo de implementação para parâmetros
 * de entrada e saída no qual são copiados os valores reais.
 */
public class SwapPassagemValorResultado {
    private int i;
    public void swap(int a, int b){
        i = b;
    }

    public static void main(String[] args){
        int value = 2;
        int[] list = {1, 3, 5, 7, 9};
        SwapPassagemValorResultado teste1 = new SwapPassagemValorResultado();

        System.out.println("Passagem por valor ------------------------------------------");
        System.out.println("Valores originais:\n"+ "value = " + value + "\nlist = " + Arrays.toString(list));


        System.out.println("Passagem 1 (swap de value = " + value + " com list[0] = " + list[0] + ")");
        teste1.i = value;
        list[teste1.i] = 5;
        teste1.swap(value, list[0]);
        System.out.println("value = " + value + "\nlist = " + Arrays.toString(list));
/*
        System.out.println("Passagem 2:(swap de list[0] = " + list[0] + " com list[1] = " + list[1] +")");
        teste1.SwapPassagemValorResultado(list[0], list[1]);
        System.out.println("value = " + value + "\nlist = " + Arrays.toString(list));

        System.out.println("Passagem 3:(swap de value = " + value + " com list[value] = list["+ value +"] = " + list[value] + ")");
        teste1.SwapPassagemValorResultado(value, list[value]);
        System.out.println("value = " + value + "\nlist = " + Arrays.toString(list));
        System.out.println("-------------------------------------------------------------");
*/

    }
}
