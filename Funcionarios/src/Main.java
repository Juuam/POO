
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        FuncController controller = new FuncController();
        try (Scanner scan = new Scanner(System.in)) {
            String text;
            while (true) {
                System.out.println("-----------Menu-----------");
                System.out.println("\n(C)riar | (E)xibir | (R)emover | (A)tualizar | (S)air");
                text = scan.nextLine().toUpperCase();

                if (text.isEmpty()) continue;
                char opc = text.charAt(0);

                switch (opc) {
                    case 'C':
                        controller.criar();
                        break;
                    case 'E':
                        System.out.println("Digite a matricula do funcionario que deseja exibir");
                        System.out.println(controller.pesquisar(scan.nextLine()));
                        break;
                    case 'R':
                        System.out.println("Digite a matricula do funcionario que remover");
                        controller.remover(scan.nextLine());
                        break;
                    case 'A':
                        System.out.println("Digite a matricula do funcionario que deseja atualizar");
                        controller.att(scan.nextLine());
                        break;
                    case 'S':
                        System.exit(0);
                        break;
                    default: System.out.println("Opção inválida.");
                }
            }
        }
    }
}
