package projeto_lpo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Autor implements Valida {
    private String nome; // Nome do autor
    private String email; // Email do autor
    private String instituicao; // Instituição do autor

    // Padrão de expressão regular para validação de email
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    // Construtor que valida o email antes de atribuir
    public Autor(String nome, String email, String instituicao) {
        this.nome = nome;
        this.email = validarEmailConstrutor(email); // Chama o método para validar o email
        this.instituicao = instituicao;
    }

    // Implementação do método validarEmail
    @Override
    public boolean validarEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches(); // Retorna true se o email for válido
    }

    // Método para validar o email no construtor
    private String validarEmailConstrutor(String email) {
        Scanner scanner = new Scanner(System.in);
        while (!validarEmail(email)) {
            System.out.print("Email inválido. Digite um novo email: ");
            email = scanner.nextLine();
        }
        return email; // Retorna um email válido
    }

    // Método toString para representar o autor como uma String
    @Override
    public String toString() {
        return "Nome: " + nome + ", Email: " + email + ", Instituição: " + instituicao;
    }
}