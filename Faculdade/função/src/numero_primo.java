import java.util.Scanner;

public class numero_primo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int[] numeros = new int[10];
        int cont = 0;
        System.out.println("Digite 10 numeros inteiros: ");

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o numero " + (i+1) +": ");
            numeros[i] = sc.nextInt();
            if(ehPrimo(numeros[i]) == true) {
                System.out.println("O numero " + numeros[i] + " é primo.");
                cont ++;
            }else {
                System.out.println("O numero " + numeros[i] + " não é primo.");
            }
        }

        System.out.println("A quantidade de numeros primos digitados é: " + cont);

        sc.close();
    }

    public static boolean ehPrimo(int numero) {
        if (numero < 1) {
            return false; 
        }
        for (int i = 2; i <= numero - 1; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}
