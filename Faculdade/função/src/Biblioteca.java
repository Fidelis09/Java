import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de livros na biblioteca: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha pendente

        String[] titulos = new String[n];
        String[] autores = new String[n];

        // Entrada dos dados dos livros
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o título do livro " + (i + 1) + ": ");
            titulos[i] = scanner.nextLine();

            System.out.print("Digite o autor do livro " + (i + 1) + ": ");
            autores[i] = scanner.nextLine();
        }

        // Exibindo os livros cadastrados
        System.out.println("\nLivros cadastrados na biblioteca:");
        for (int i = 0; i < n; i++) {
            System.out.println("Título: " + titulos[i] + " | Autor: " + autores[i]);
        }

        // Exibindo a quantidade total de livros cadastrados
        System.out.println("\nTotal de livros cadastrados: " + n);

        scanner.close();
 }
}