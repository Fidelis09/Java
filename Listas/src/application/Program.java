package application;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) { 

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println(list.size());

        //Remove baseado no nome
        //list.remove("Anna");
        
        
        for(String x : list){
            System.out.println(x);
        }
        
        System.out.println("---------------------------");
        //Remove baseado no index
        //list.remove(1);

        //Remove baseado no predicado
        list.removeIf(x -> x.charAt(0) == 'M');

        for(String x : list){
            System.out.println(x);
        }
        
        System.out.println("---------------------------");
        //Encontrar a posição de um elemento
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Bob: " + list.indexOf("Marco"));

        System.out.println("---------------------------");
        //Filtrar elementos
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String x : result){
            System.out.println(x);
        }

        System.out.println("---------------------------");
        //Encontrar o primeiro elemento que satisfaça o predicado
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

    }
}