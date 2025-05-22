package unidade07.exemplos;

public class Turma {

    Aluno[] alunos;
    int qtdAlunos;

    public Turma() {
        qtdAlunos = 0;
        alunos = new Aluno[20];
    }

    public Turma(int capacidade) {
        qtdAlunos = 0;
        alunos = new Aluno[capacidade];
    }

    boolean cadastrarAluno(int matr, double nota, int frequencia) {
        if (qtdAlunos < alunos.length) {

            if (nota < 0.0 || nota > 10.0) {
                return false;
            }

            if (frequencia < 0 || frequencia > 20) {
                return false;
            }

            for (int idx = 0; idx < qtdAlunos; idx++) {
                if (alunos[idx].matricula == matr) {
                    return false;
                }
            }

            Aluno novoAluno = new Aluno(matr, nota, frequencia);
            alunos[qtdAlunos] = novoAluno;
            qtdAlunos++;
            return true;
        }
        return false;
    }

    void exibirDadosAlunos() {
        for (int idx = 0; idx < qtdAlunos; idx++) {
            Aluno aluno = alunos[idx];
            aluno.imprimeAluno();
        }
    }

    void exibeEstatisticas() {
        double maiorNota = 0.0;
        double menorNota = 10.0;
        double somaMedia = 0;
        double qtdAprovados = 0.0;
        double qtdRecuperacao = 0.0;
        double qtdReprovados = 0.0;

        for (int idx = 0; idx < qtdAlunos; idx++) {
            Aluno aluno = alunos[idx];

            somaMedia += aluno.nota;

            if (aluno.nota > maiorNota) {
                maiorNota = aluno.nota;
            }

            if (aluno.nota < menorNota) {
                menorNota = aluno.nota;
            }

            switch (aluno.processaSituacao()) {
                case "Aprovado":
                    qtdAprovados++;
                    break;
                case "Recuperação":
                    qtdRecuperacao++;
                    break;
                case "Reprovado por nota":
                case "Reprovado por frequência":
                    qtdReprovados++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("A menor nota é: " + menorNota);
        System.out.println("Média é: " + somaMedia / qtdAlunos);
        System.out.println("Aprovados: " + qtdAprovados);
        System.out.println("Em recuperação: " + qtdRecuperacao);
        System.out.println("Reprovados: " + qtdReprovados);
        double percentual = qtdAprovados / qtdAlunos;
        System.out.println("% de aprovados: " + (percentual * 100));
    }

    Aluno exibirAluno(int matricula) {
        for (int idx = 0; idx < qtdAlunos; idx++) {
            Aluno aluno = alunos[idx];
            if (aluno.matricula == matricula) {
                return aluno;
            }
        }
        return null;
    }
}
