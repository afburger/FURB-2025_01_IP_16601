package provas.prova02B;

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a capacidade de itens do armário:");
        int capacidadeItens = teclado.nextInt();
        int totalItens = 0;

        System.out.println("Informe a capacidade de volume do armário:");
        int capacidadeVolume = teclado.nextInt();
        int totalVolume = 0;

        int[] itensVolume = new int[capacidadeItens];
        String[] itensNomes = new String[capacidadeItens];

        int menu;

        do {
            System.out.println("1 - Inserir um item \n" +
                               "2 - Imprimir itens do armário \n" +
                               "3 - Listar o item mais pesado \n" +
                               "4 - Ordenar do mais volumoso para o menor \n" +
                               "5 - Excluir um item do armário \n" +
                               "6 - Sair do sistema"
            );
            System.out.println("Escolha a opção desejada:");
            menu = teclado.nextInt();

            switch (menu) {
                case 1: // Incluir
                    System.out.println("Informe o nome do item");
                    String nome = teclado.next();
                    System.out.println("Informe o volume do item");
                    int volume = teclado.nextInt();

                    if ((totalVolume + volume) > capacidadeVolume || totalItens >= capacidadeItens) {
                        System.out.println("O item não pode ser adicionado, pois excede a capacidade do armário");
                    } else {
                        totalVolume += volume;
                        itensNomes[totalItens] = nome;
                        itensVolume[totalItens] = volume;
                        totalItens++;
                        System.out.println("Item foi adicionado com sucesso");
                    }
                    break;
                case 2: // Imprimir os itens na ordem inversa.
                    for (int idx = totalItens - 1; idx >= 0; idx--) {
                        System.out.println("Item: " + itensNomes[idx] +
                                           " Volume: " + itensVolume[idx]);
                    }
                    break;
                case 3: // Listar o item mais pesado
                    int pesoMaisPesado = 0;
                    int idItemMaisPessado = -1;
                    for (int idx = 0; idx < totalItens; idx++) {
                        if (itensVolume[idx] > pesoMaisPesado) {
                            idItemMaisPessado = idx;
                            pesoMaisPesado = itensVolume[idx];
                        }
                    }

                    if (idItemMaisPessado >= 0) {
                        System.out.println("Item: " + itensNomes[idItemMaisPessado] +
                                           " Volume: " + itensVolume[idItemMaisPessado]);
                    } else {
                        System.out.println("Nenhum item encontrado");
                    }
                    break;

                case 4: // Ordenar do maior para o menor.
                    // Loop externo para controlar as passagens pelo array
                    for (int idx = 0; idx < totalItens - 1; idx++) {
                        // Loop interno para comparações e trocas
                        for (int j = 0; j < totalItens - idx - 1; j++) {
                            // Se o elemento atual for menor que o próximo elemento
                            if (itensVolume[j] < itensVolume[j + 1]) {
                                // Troca os elementos
                                int tempVolume = itensVolume[j];
                                itensVolume[j] = itensVolume[j + 1];
                                itensVolume[j + 1] = tempVolume;

                                String tempNome = itensNomes[j];
                                itensNomes[j] = itensNomes[j + 1];
                                itensNomes[j + 1] = tempNome;
                            }
                        }
                    }
                    break;

                case 5: // Excluir
                    System.out.println("Digite o nome do item que deseja excluir");
                    String nomeExcluir = teclado.next();

                    int idExcluir = -1;

                    for (int i = 0; i < totalItens; i++) {
                        if (nomeExcluir.equals(itensNomes[i])) {
                            idExcluir = i;
                            break;
                        }
                    }

                    if (idExcluir >= 0) {
                        totalVolume -= itensVolume[idExcluir];

                        for (int idx = idExcluir; idx < (totalItens - 1); idx++) {
                            itensNomes[idx] = itensNomes[idx + 1];
                            itensVolume[idx] = itensVolume[idx + 1];
                        }

                        itensNomes[totalItens] = null;
                        itensVolume[totalItens] = 0;

                        totalItens--;
                        System.out.println("Item excluído com sucesso");
                    } else {
                        System.out.println("Item não foi encontrado");
                    }
                    break;

                case 6: // Sair
                    System.out.println("Encerrando o sistema");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (menu != 6);
        teclado.close();
    }
}
