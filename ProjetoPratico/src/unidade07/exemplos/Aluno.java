package unidade07.exemplos;

public class Aluno {

    int matricula;
    double nota;
    int frequencia;

    public Aluno(int matricula, double nota, int frequencia) {
        this.matricula = matricula;
        this.nota = nota;
        this.frequencia = frequencia;
    }

    String processaSituacao() {
        String situacao = "Não definido";
        if (nota >= 7.0 && frequencia >= 15) {
            situacao = "Aprovado";
        } else {
            if (nota >= 5.0 && nota < 7.0 && frequencia >= 15) {
                situacao = "Recuperação";
            } else {
                if (nota < 5.0 && frequencia >= 15) {
                    situacao = "Reprovado por nota";
                } else {
                    if (frequencia < 15) {
                        situacao = "Reprovado por frequência";
                    }
                }
            }
        }
        return situacao;
    }

    void imprimeAluno() {
        System.out.println("Matrícula: " + matricula
                                + " nota: " + nota
                                + " frequencia: " + frequencia
                                + " situação: " + processaSituacao());
    }

}
