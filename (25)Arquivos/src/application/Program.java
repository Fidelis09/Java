package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Program {

    public static void main(String[] args) {
        
        // para ler o arquivo in.txt


        /* 
        File path = new File("src/resources/in.txt");
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        */

        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

        String path = "src\\resources\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { // usando o true no FileWriter ele não sobrescreve o arquivo
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
