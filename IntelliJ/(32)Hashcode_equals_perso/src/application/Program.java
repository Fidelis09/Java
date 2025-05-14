package application;

import entities.Client;

public class Program {
    public static void main(String[] args) {


        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("alex", "alex@gmail,com");
        Client c3 = new Client("Maria", "maria@gmail.com");

        System.out.println(c1.hashCode()); // hash code of c1
        System.out.println(c2.hashCode()); // hash code of c2   
        System.out.println(c1.equals(c3)); // false

    }
}
