import java.util.Random;

public class ordenar {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] num = new int[20];

        int i, j, aux;

        for (i = 0; i < 20; i++) {
            num[i] = rd.nextInt(100);
        }

        System.out.println("Vetor desordenado: ");
        for (i = 0; i < 20; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println("\nVetor ordenado: ");
        for (i = 0; i < 20; i++) {
            for (j = i + 1; j < 20; j++) {
                if (num[i] > num[j]) {
                    aux = num[i];
                    num[i] = num[j];
                    num[j] = aux;
                }
            }
        }
        for (i = 0; i < 20; i++) {
            System.out.print(num[i] + " ");
        }

    }

}
