# JavaMetodosPassagemParametros

# IMPLEMENTAÇÃO EM JAVA
 * Métodos de passagem de parâmetros
 * Enunciado:
    1. Codifique e execute, em sua linguagem escolhida, o programa escrito em sintaxe C
 a seguir. Na sequência responda:
        Obs.: Em Java, com exceção dos parâmetros de objeto que são passados por referência,
        os parâmetros são passados por valor. Não há tipo ponteiro em Java.

        1.1 - para cada um dos seguintes métodos de passagem de parâmetros, quais são todos
 os valores das variáveis value e list após cada uma das três chamadas a swap?
            a. Passados por valor;
                Com a passagem por valor, nenhum dos argumentos reais é alterado, então
                as variáveis retêm os valores com os quais foram inicializadas.
                Valores originais:
                    value = 2
                    list = [1, 3, 5, 7, 9]
                Passagem 1 (swap de value = 2 com list[0] = 1):
                    value = 2
                    list = [1, 3, 5, 7, 9]
                Passagem 2:(swap de list[0] = 1 com list[1] = 3):
                    value = 2
                    list = [1, 3, 5, 7, 9]
                Passagem 3:(swap de value = 2 com list[value] = list[2] = 5):
                    value = 2
                    list = [1, 3, 5, 7, 9]
            b. Passados por referência;
                    Em Java, com exceção dos parâmetros de objeto que são passados por
                referência, os parâmetros são passados por valor.
                    Essa operação de troca simples não é possível em Java, pois essa
                linguagem não tem ponteiros nem o tipo de referências como o de C++.
                    Em Java, uma variável de referência pode apontar apenas para um objeto,
                não para um valor escalar.

 c. Passados por valor-resultado.

void swap(int a, int b) {
    int temp;
    temp = a;

    a = b;
    b = temp;
}

void main() {
    int value = 2, list[5] = {1, 3, 5, 7, 9};

    swap(value, list[0]);
    swap(list[0], list[1]);
    swap(value, list[value]);
}
