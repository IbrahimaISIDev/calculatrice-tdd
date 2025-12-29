package sn.unchk.ibrahima.calculatrice;
/**
 * Classe Calculatrice - TDD
 * On écrit JUSTE ce qu'il faut pour faire passer le test
 */
public class Calculatrice {

    /**
     * Additionne deux nombres
     */
    public double addition(double a, double b) {
        return a + b;
    }

    /**
     * Soustrait deux nombres
     */
    public double soustraction(double a, double b) {
        return a - b;
    }

    /**
     * Multiplie deux nombres
     */
    public double multiplication(double a, double b) {
        return a * b;
    }

    /**
     * Divise deux nombres
     */
    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro non autorisée.");
        }
        return a / b;
    }
}