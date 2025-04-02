import java.util.Scanner;

public class Comprando {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos comprados: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha pendente

        String[] nomes = new String[n];
        double[] precos = new double[n];
        int[] quantidades = new int[n];
        double[] totais = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite o preço do produto " + (i + 1) + " (R$): ");
            precos[i] = scanner.nextDouble();

            System.out.print("Digite a quantidade do produto " + (i + 1) + ": ");
            quantidades[i] = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha pendente

            // Calculando o preço total de cada produto
            totais[i] = precos[i] * quantidades[i];
        }

        double valorTotal = 0;
        System.out.println("\n------------------ Nota Fiscal ------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("Produto: %-20s | Preço: R$ %.2f | Quantidade: %d | Total: R$ %.2f\n",
                    nomes[i], precos[i], quantidades[i], totais[i]);
            valorTotal += totais[i];
        }

        System.out.printf("\nValor total da compra: R$ %.2f\n", valorTotal);

        scanner.close();
    }
}