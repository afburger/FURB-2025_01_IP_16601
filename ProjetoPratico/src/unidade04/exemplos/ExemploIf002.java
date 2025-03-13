package unidade04.exemplos;

public class ExemploIf002 {

    public static void main(String[] args) {
        String um = new String("Teste");
        String dois = new String("Teste");

        // Comparação de Strings que não funciona.
        if (um == dois) {
            System.out.println("São iguais");
        }

        // Comparação de Strings que funciona.
        if (um.equals(dois)) {
            System.out.println("Comparação correta, são iguais");
        }

        System.out.println("Fim da aplicação.");
    }

}
