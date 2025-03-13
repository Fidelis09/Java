package application;

import java.util.Random;
import java.util.Scanner;

public class jogo {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        
        int randomNumber = r.nextInt(50);
        
        int tentativa =  1;
        for(int i = 0; i < 10; i++){
            System.out.println("Tentativa " + (i+1));
            System.out.println("Digite um número: ");
            int n = sc.nextInt();
            if (n == randomNumber){
                System.out.println("Parabéns, você acertou!");
                break;
            } else{
                System.out.println("Você errou!");
                
                
                
            }
            
        }

        System.out.println("Tentativas " + tentativa);
        
        sc.close();
    }

}
