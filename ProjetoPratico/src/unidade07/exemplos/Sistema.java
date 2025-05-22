package unidade07.exemplos;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        Turma turma = new Turma();

        Scanner teclado = new Scanner(System.in);

        int opcaoMenu;

        do {
            System.out.println("===== SISTEMA DE ANÁLISE DE NOTAS =====");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Exibir dados de todos os alunos");
            System.out.println("3. Calcular estatísticas da turma");
            System.out.println("4. Verificar situação de um aluno específico");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção: _");
            opcaoMenu = teclado.nextInt();

            switch (opcaoMenu) {
                case 1:
                    System.out.println("Informe o código de matricula");
                    int matricula = teclado.nextInt();
                    System.out.println("Informe a nota");
                    double nota = teclado.nextDouble();
                    System.out.println("Informe a frequência do aluno:");
                    int frequencia = teclado.nextInt();
                    boolean cadastrou = turma.cadastrarAluno(matricula, nota, frequencia);
                    if (cadastrou) {
                        System.out.println("Aluno cadastrado com sucesso!");
                    } else {
                        System.out.println("Cadastro não realizado");
                    }
                    break;
                case 2:
                    turma.exibirDadosAlunos();
                    break;
                case 3:
                    turma.exibeEstatisticas();
                    break;
                case 4:
                    System.out.println("Informe a matrícula do aluno que deseja listar:");
                    int matriculaPesquisar = teclado.nextInt();
                    Aluno aluno = turma.exibirAluno(matriculaPesquisar);
                    if (aluno != null) {
                        aluno.imprimeAluno();
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    break;
            }

        } while (opcaoMenu != 5);
        teclado.close();
    }

}
