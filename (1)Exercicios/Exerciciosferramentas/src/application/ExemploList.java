package application;

import java.util.ArrayList;

public class ExemploList {
    public static void main(String[] args) {
        // Criando uma lista de ferramentas
        ArrayList<String> ferramentas = new ArrayList<>();

        // Usando o método add() para adicionar elementos na 
        
        ferramentas.add("Martelo");
        ferramentas.add("Chave de Fenda");
        ferramentas.add("Alicate");
        ferramentas.add("Serra");
        ferramentas.add("Furadeira");

        // Exibindo a lista original
        System.out.println("Lista original de ferramentas:");
        for (String ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }

        // Usando o método set() para alterar um valor na lista
        ferramentas.set(2, "Chave Inglesa");  // No índice 2, substituímos "Alicate" por "Chave Inglesa"

        // Exibindo a lista após a alteração
        System.out.println("\nLista após a alteração:");
        for (String ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }

        // Usando o método remove() para remover um item da lista
        ferramentas.remove(1);  // Removendo o item do índice 1 (Chave de Fenda)

        // Exibindo a lista após a remoção
        System.out.println("\nLista após a remoção:");
        for (String ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }

        // Usando o método add() novamente para adicionar outro item
        ferramentas.add("Parafusadeira");

        // Exibindo a lista final
        System.out.println("\nLista final de ferramentas:");
        for (String ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }
    }
}