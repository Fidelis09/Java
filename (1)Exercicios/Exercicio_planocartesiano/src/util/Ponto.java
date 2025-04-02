package util;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calcularDistancia(Ponto outro) {
        return Math.sqrt(Math.pow(outro.getX() - this.x, 2) + Math.pow(outro.getY() - this.y, 2));
    }

    // Metodo para calcular o ângulo da reta em relação ao eixo x
    public double calcularAngulo(Ponto outro) {
        double deltaY = outro.getY() - this.y;
        double deltaX = outro.getX() - this.x;
        double anguloRad = Math.atan2(deltaY, deltaX); // ângulo em radianos
        // Convertendo para graus
        return Math.toDegrees(anguloRad);
    }
    public String determinarQuadrante() {
        if (x == 0 && y == 0) {
            return "Origem";
        } else if (x == 0) {
            return (y > 0) ? "Ordenada Positiva" : "Ordenada Negativa";
        } else if (y == 0) {
            return (x > 0) ? "Abcissa Positiva" : "Abcissa Negativa";
        } else {
            String quadrante;
            if (x > 0) {
                quadrante = (y > 0) ? "Quadrante I" : "Quadrante IV";
            } else {
                quadrante = (y > 0) ? "Quadrante II" : "Quadrante III";
            }
            return quadrante;
}
}
}