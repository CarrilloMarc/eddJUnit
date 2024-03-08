import org.testng.Assert;
import static org.testng.Assert.*;
import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import proves.Calculadora;

/**
 * Aquesta classe conté proves per a les operacions de la Calculadora.
 */

public class CalculadoraTest {
    private Calculadora calculadora;
    
    /**
     * Configuració inicial abans de l'execució de totes les proves.
     */
    
    @BeforeClass
    public void setUp() {
    calculadora = new Calculadora();
    }
    
    /**
     * Prova per a la funció de suma de la calculadora.
     */
    @Test
    public void testSuma (){
        float resultat = calculadora.suma(7, 2);
        assertEquals(9, resultat,0);
        assertEquals("Suma", calculadora.getLastOp());
    }    
    /**
     * Prova per a la funció de resta de la calculadora.
     */
    @Test
    public void testResta (){
        float resultat = calculadora.resta(7, 2);
        assertEquals(5, resultat,0);
        assertEquals("Resta", calculadora.getLastOp());
    }
    
    /**
     * Prova per a la funció de multiplicació de la calculadora.
     */
    
    @Test
    public void testMultiplica (){
        float resultat = calculadora.multiplica(7, 2);
        assertEquals(14, resultat, 0);
        assertEquals("Multiplica", calculadora.getLastOp());
    }
    
    /**
     * Prova per a la funció de divisió de la calculadora.
     */
    @Test
    public void testDividir (){
        float resultat = calculadora.divideix(8, 2);
        assertEquals(4, resultat, 0);
        assertEquals("Divideix", calculadora.getLastOp());
    }
    /**
     * Prova per a la funció de comprovar si es major de la calculadora.
     */
    
    @Test
    public void testMajorQue() {
        boolean resultat = calculadora.majorQue(8, 2);
        assertTrue(resultat); 
        assertEquals(8, calculadora.getLastResult(), 0); 
        assertEquals("MajorQue", calculadora.getLastOp());
    }
    /**
     * ALliberem els recursos després de l'execució de totes les proves.
     */
    
    @AfterClass
    public void tearDown() {
        calculadora.restablecer();
    }
}
