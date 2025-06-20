import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario {
    private long id;
    private String nome;
    private String matricula;
    private LocalDate admissao;
    private LocalDate demissao;
    private float salario;
    private String horario;

    public Funcionario(long id, String nome, String matricula, LocalDate admissao, LocalDate demissao, float salario, String horario) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.admissao = admissao;
        this.demissao = demissao;
        this.salario = salario;
        this.horario = horario;
    }

    public void atualizarFuncionario(String nome, LocalDate admissao, LocalDate demissao, float salario, String horario) {
        this.nome = nome;
        this.admissao = admissao;
        this.demissao = demissao;
        this.salario = salario;
        this.horario = horario;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "ID: " + id + "\nNome: " + nome + "\nMatrícula: " + matricula +
               "\nAdmissão: " + admissao.format(fmt) +
               "\nDemissão: " + demissao.format(fmt) +
               "\nSalário: " + salario + "\nHorário: " + horario;
    }
}
