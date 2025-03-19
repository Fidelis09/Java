import java.util.Scanner;

public class PlanoCartesiano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar as coordenadas para o usuário

        System.out.println("Informe as coordenadas do primeiro ponto (x1, y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Informe as coordenadas do segundo ponto (x2, y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Determinar a relação entre os pontos

        if ( x1 == x2 && y1 == y2) {
            System.out.println("Os pontos formam um único ponto");
        } else if ( x1 == x2) {
            System.out.println("Os pontos formam uma reta vertical");
        } else if ( y1 == y2) {
            System.out.println("Os pontos formam uma reta horizontal");
        } else {
            System.out.println("Os pontos formam uma reta inclinada");
        }

        // Determinar o quadrante de cada ponto

        System.out.println("Quadrante do ponto 1 (" + x1 + "," + y1 + "):" + determinarQuadrante (x1,y1));
        System.out.println("Quadrante do ponto 2 (" + x2 + "," + y2 + "): " + determinarQuadrante (x2,y2));

        sc.close();
    }

    public static String determinarQuadrante(double x, double y) {
        if (x > 0 && y > 0) {
            return "Quadrante I";
        } else if (x < 0 && y > 0) {
            return "Quadrante II";
        } else if (x < 0 && y < 0) {
            return "Quadrante III";
        } else if (x > 0 && y < 0) {
            return "Quadrante IV";
        } else if (x == 0 && y > 0) {
            return "Ordenada Positiva";
        } else if (x == 0 && y < 0) {
            return "Ordenada Negativa";
        } else if (x > 0 && y == 0) {
            return "Abcissa Positiva";
        } else if (x < 0 && y == 0) {
            return "Abcissa Negativa";
        } else {
            return "Origem";
        }
    }
}