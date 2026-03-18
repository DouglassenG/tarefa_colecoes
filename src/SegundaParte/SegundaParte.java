import java.util.ArrayList;
import java.util.Scanner;

public class SegundaParte {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> grupoMasculino = new ArrayList<>();
        ArrayList<String> grupoFeminino  = new ArrayList<>();

        // 1.Lê a entrada no formato: Rodrigo-M, Luana-F, Carlos-M
        System.out.print("Digite os nomes no formato (ex: Rodrigo-M, Luana-F): ");
        String entrada = scanner.nextLine();

        // 2. Primeiro split: separa cada pessoa pela vírgula
        String[] pessoas = entrada.split(",");

        for (String pessoa : pessoas) {

            // 3. Segundo split: separa o nome do sexo pelo traço  
            String[] partes = pessoa.trim().split("-");

            String nome = partes[0].trim();
            String sexo = partes[1].trim().toUpperCase();

            // 4. Separa nos grupos
            if (sexo.equals("M")) {
                grupoMasculino.add(nome);
            } else if (sexo.equals("F")) {
                grupoFeminino.add(nome);
            }
        }

        // 5. Imprime os grupos no console
        System.out.println("\n--- Grupo Masculino ---");
        for (String nome : grupoMasculino) {
            System.out.println("  - " + nome);
        }

        System.out.println("\n--- Grupo Feminino ---");
        for (String nome : grupoFeminino) {
            System.out.println("  - " + nome);
        }

        scanner.close();
    }
}