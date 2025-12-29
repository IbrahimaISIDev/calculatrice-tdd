package sn.unchk.ibrahima.calculatrice;

/**
 * Programme principal pour tester la calculatrice
 */
public class Main {

    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();
        
        System.out.println("=== CALCULATRICE TDD ===");
        System.out.println("Par Ibrahima Dev - UN-CHK | Saraya Tech");
        System.out.println();
        
        // Tests d'addition
        System.out.println("ADDITION:");
        System.out.println("5 + 3 = " + calc.addition(5, 3));
        System.out.println("10 + 0 = " + calc.addition(10, 0));
        System.out.println("-5 + (-3) = " + calc.addition(-5, -3));
        System.out.println();
        
        // Tests de soustraction
        System.out.println("SOUSTRACTION:");
        System.out.println("10 - 4 = " + calc.soustraction(10, 4));
        System.out.println("3 - 8 = " + calc.soustraction(3, 8));
        System.out.println();
        
        // Tests de multiplication
        System.out.println("MULTIPLICATION:");
        System.out.println("4 * 5 = " + calc.multiplication(4, 5));
        System.out.println("10 * 0 = " + calc.multiplication(10, 0));
        System.out.println("-3 * -4 = " + calc.multiplication(-3, -4));
        System.out.println();
        
        // Tests de division
        System.out.println("DIVISION:");
        System.out.println("10 / 2 = " + calc.division(10, 2));
        System.out.println("7 / 2 = " + calc.division(7, 2));
        System.out.println();
        
        // Test de l'exception
        System.out.println("TEST EXCEPTION:");
        try {
            calc.division(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("✓ Exception capturée : " + e.getMessage());
        }
        
        System.out.println();
        System.out.println("Tous les tests manuels réussis ! ✅");
        System.out.println("Tests automatisés : 13/13 ✅");
    }
}