import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FuncController {
    private Funcionario[] vetor = new Funcionario[50];
    private int indice = 0;
    private Scanner scan = new Scanner(System.in);
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void criar() {
        if (indice >= vetor.length) {
            System.out.println("Limite de funcionários atingido.");
            return;
        }

        System.out.println("=== Cadastro de Funcionário ===");
        long id = Long.parseLong(ler("ID:"));
        String nome = ler("Nome:");
        String matricula = ler("Matrícula:");
        LocalDate admissao = lerData("Data de admissão (dd/MM/yyyy):");
        LocalDate demissao = lerData("Data de demissão (dd/MM/yyyy):");
        float salario = Float.parseFloat(ler("Salário:"));
        String horario = ler("Horário:");

        vetor[indice] = new Funcionario(id, nome, matricula, admissao, demissao, salario, horario);
        indice++;
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public String pesquisar(String matricula) {
        for (Funcionario func : vetor) {
            if (func != null && func.getMatricula().equals(matricula)) {
                return func.toString();
            }
        }
        return "Funcionário não encontrado.";
    }

    public void att(String matricula) {
        for (Funcionario func : vetor) {
            if (func != null && func.getMatricula().equals(matricula)) {
                System.out.println("=== Atualização de Funcionário ===");
                String nome = ler("Novo nome:");
                LocalDate admissao = lerData("Nova data de admissão:");
                LocalDate demissao = lerData("Nova data de demissão:");
                float salario = Float.parseFloat(ler("Novo salário:"));
                String horario = ler("Novo horário:");

                func.atualizarFuncionario(nome, admissao, demissao, salario, horario);
                System.out.println("Dados atualizados com sucesso.");
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }

    public void remover(String matricula) {
        for (int i = 0; i < indice; i++) {
            if (vetor[i] != null && vetor[i].getMatricula().equals(matricula)) {
                vetor[i] = null;
                System.out.println("Funcionário removido.");
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }

    // Métodos auxiliares para evitar repetição
    private String ler(String mensagem) {
        System.out.println(mensagem);
        return scan.nextLine();
    }

    private LocalDate lerData(String mensagem) {
        System.out.println(mensagem);
        return LocalDate.parse(scan.nextLine(), formatter);
    }
}
