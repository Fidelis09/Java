package application;

import java.util.Scanner;
import util.Ponto;

public class PlanoCartesiano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar as coordenadas para o usuário
        System.out.println("Informe as coordenadas do primeiro ponto (x1, y1): ");
        Ponto ponto1 = new Ponto(sc.nextDouble(), sc.nextDouble());

        System.out.println("Informe as coordenadas do segundo ponto (x2, y2): ");
        Ponto ponto2 = new Ponto(sc.nextDouble(), sc.nextDouble());

        // Determinar a relação entre os pontos
        if (ponto1.getX() == ponto2.getX() && ponto1.getY() == ponto2.getY()) {
            System.out.println("Os pontos formam um único ponto");
        } else if (ponto1.getX() == ponto2.getX()) {
            System.out.println("Os pontos formam uma reta vertical");
        } else if (ponto1.getY() == ponto2.getY()) {
            System.out.println("Os pontos formam uma reta horizontal");
        } else {
            System.out.println("Os pontos formam uma reta inclinada");
        }

        // Determinar o quadrante de cada ponto
        System.out.println("Quadrante do ponto 1 (" + ponto1.getX() + "," + ponto1.getY() + "): " + ponto1.determinarQuadrante());
        System.out.println("Quadrante do ponto 2 (" + ponto2.getX() + "," + ponto2.getY() + "): " + ponto2.determinarQuadrante());

        // Calcular e exibir a distância entre os pontos
        double distancia = ponto1.calcularDistancia(ponto2);
        System.out.printf("A distância entre os pontos é: %.2f%n", distancia);

        // Após calcular a distância e exibir os quadrantes
        double angulo = ponto1.calcularAngulo(ponto2);
        System.out.printf("O ângulo da reta formada entre os pontos é: %.2f graus%n", angulo);

        sc.close();
}
}