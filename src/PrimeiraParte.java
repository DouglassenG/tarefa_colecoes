import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenaNomes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Lê os nomes separados por vírgula
        System.out.print("Digite os nomes separados por vírgula: ");
        String entrada = scanner.nextLine();

        // 2. Usa o split para separar e guarda num ArrayList
        String[] partes = entrada.split(",");

        ArrayList<String> nomes = new ArrayList<>();

        for (String nome : partes) {
            nomes.add(nome.trim()); // .trim() remove os espaços
        }

        // 3. Ordena em ordem alfabética
        Collections.sort(nomes);

        // 4. Imprime no console
        System.out.println("\nNomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println("  - " + nome);
        }

        scanner.close();
    }
}