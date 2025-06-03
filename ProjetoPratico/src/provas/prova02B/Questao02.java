package provas.prova02B;

public class Questao02 {
    public static void main(String[] args) {
        int aux = 0;
        int vetor[] = {10, 5, 3, 8, 9}; 
        int numero = vetor.length;
        int tamanho = numero;

        int execucaoJ = 0;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < i; j++) {
                aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
                execucaoJ++;
            }
            numero++;
        }

        // Código adicionado
        for (int i : vetor) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println("Número: " + numero);
        System.out.println("Exeução J: " + execucaoJ);

        // A) O que está acontecendo no método acima?
        // Resposta: A troca dos valores no vetor (inversão do vetor).

        // B) Quantas vezes o laço “for” com índice “j” irá executar? Justifique:
        // Resposta: 10x pois ele executa de acordo com o indice do for I.

        // C) Qual o conteúdo interno (valor) da variável “vetor” após a chamada do método teste? Justifique:
        // Resposta: 9,8,3,5,10. Pois o código está invertendo o conteúdo do vetor.

        // D) Qual o conteúdo valor da variável “numero” ao fim da execução do código: Justifique:
        // Resposta: 10. Pois é inicializado com 5 e depois incrementa mais 5 vezes no for.

    }
}

