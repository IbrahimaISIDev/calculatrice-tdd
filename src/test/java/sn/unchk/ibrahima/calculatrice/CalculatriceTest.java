package sn.unchk.ibrahima.calculatrice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

@DisplayName("Tests de la Calculatrice")
class CalculatriceTest {

    private Calculatrice calculatrice;

    @BeforeEach
    void setUp() {
        calculatrice = new Calculatrice();
    }

    // ========== TESTS POUR L'ADDITION ==========
    
    @Test
    @DisplayName("Addition de deux nombres positifs")
    void testAdditionDeuxNombresPositifs() {
        // ARRANGE
        double nombre1 = 5;
        double nombre2 = 3;
        
        // ACT
        double resultat = calculatrice.addition(nombre1, nombre2);
        
        // ASSERT
        assertEquals(8, resultat, "5 + 3 devrait égaler 8");
    }

    // 🆕 NOUVEAU TEST 1 : Addition avec zéro
    @Test
    @DisplayName("Addition avec zéro")
    void testAdditionAvecZero() {
        double resultat = calculatrice.addition(10, 0);
        assertEquals(10, resultat, "10 + 0 devrait égaler 10");
    }

    // 🆕 NOUVEAU TEST 2 : Addition de nombres négatifs
    @Test
    @DisplayName("Addition de nombres négatifs")
    void testAdditionNombresNegatifs() {
        double resultat = calculatrice.addition(-5, -3);
        assertEquals(-8, resultat, "-5 + (-3) devrait égaler -8");
    }

    // 🆕 NOUVEAU TEST 3 : Addition de nombres décimaux
    @Test
    @DisplayName("Addition de nombres décimaux")
    void testAdditionNombresDecimaux() {
        double resultat = calculatrice.addition(2.5, 3.7);
        assertEquals(6.2, resultat, 0.001, "2.5 + 3.7 devrait égaler 6.2");
    }

// ========== TESTS POUR LA SOUSTRACTION ==========

    @Test
    @DisplayName("Soustraction de deux nombres positifs")
    void testSoustractionDeuxNombresPositifs() {
        double resultat = calculatrice.soustraction(10, 4);
        assertEquals(6, resultat, "10 - 4 devrait égaler 6");
    }

    @Test
    @DisplayName("Soustraction avec résultat négatif")
    void testSoustractionResultatNegatif() {
        double resultat = calculatrice.soustraction(3, 8);
        assertEquals(-5, resultat, "3 - 8 devrait égaler -5");
    }

    @Test
    @DisplayName("Soustraction avec zéro")
    void testSoustractionAvecZero() {
        double resultat = calculatrice.soustraction(15, 0);
        assertEquals(15, resultat, "15 - 0 devrait égaler 15");
    }   
    

// ========== TESTS POUR LA MULTIPLICATION ==========

    @Test
    @DisplayName("Multiplication de deux nombres positifs")
    void testMultiplicationDeuxNombresPositifs() {
        double resultat = calculatrice.multiplication(4, 5);
        assertEquals(20, resultat, "4 * 5 devrait égaler 20");
    }

    @Test
    @DisplayName("Multiplication par zéro")
    void testMultiplicationParZero() {
        double resultat = calculatrice.multiplication(10, 0);
        assertEquals(0, resultat, "10 * 0 devrait égaler 0");
    }

    @Test
    @DisplayName("Multiplication de nombres négatifs")
    void testMultiplicationNombresNegatifs() {
        double resultat = calculatrice.multiplication(-3, -4);
        assertEquals(12, resultat, "-3 * -4 devrait égaler 12");
    }

    // ========== TESTS POUR LA DIVISION ==========

    @Test
    @DisplayName("Division de deux nombres positifs")
    void testDivisionDeuxNombresPositifs() {
        double resultat = calculatrice.division(10, 2);
        assertEquals(5, resultat, "10 / 2 devrait égaler 5");
    }

    @Test
    @DisplayName("Division avec résultat décimal")
    void testDivisionResultatDecimal() {
        double resultat = calculatrice.division(7, 2);
        assertEquals(3.5, resultat, 0.001, "7 / 2 devrait égaler 3.5");
    }

    @Test
    @DisplayName("Division par zéro doit lever une exception")
    void testDivisionParZeroLeveException() {
        // assertThrows vérifie qu'une exception est levée
        Exception exception = assertThrows(
            ArithmeticException.class,
            () -> calculatrice.division(10, 0),
            "Division par zéro devrait lever une ArithmeticException"
        );
        
        // On vérifie aussi le message d'erreur
        assertTrue(exception.getMessage().contains("zéro"),
            "Le message d'erreur devrait mentionner 'zéro'");
    }

}