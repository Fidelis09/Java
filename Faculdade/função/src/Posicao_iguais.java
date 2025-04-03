import java.util.Random;

public class Posicao_iguais {
    public static void main(String[] args) {

        Random rd = new Random();


        int[] vetor1 = new int[100];
        int[] vetor2 = new int[100];

        
        for(int i= 0; i < 100; i++){
            vetor1[i] = rd.nextInt(100);
            vetor2[i] = rd.nextInt(100);
        }
/* 
        System.out.println("Vetor 1: ");
        for(int i= 0; i < 100; i++){
            System.out.print(vetor1[i] + " ");
        }
        System.out.println("\nVetor 2: ");
        
        for(int i= 0; i < 100; i++){
            System.out.print(vetor2[i] + " ");
        }
*/

        for(int i= 0; i < 100; i++){
            if(vetor1[i] == vetor2[i]){
                System.out.println("Os valores são iguais na posição " + i + " e o valor é: " + vetor1[i]);
            }
        }
    }

}
