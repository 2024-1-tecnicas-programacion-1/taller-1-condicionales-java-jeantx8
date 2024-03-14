package test;

import ejercicios.AnnosBisiestos;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielsanchez
 */
public class AnnosBisiestosTest {
    @Test
    public void test1988() {
        String valorEsperado = "1988 es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(1988);
        assertEquals(valorEsperado, valorActual);
    }
    
    // TODO: Agrega tus otros casos de prueba aquí
 public void test2011() {
        String valorEsperado = " no es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(2011);
        assertEquals(valorEsperado, valorActual);
    }
    public void test1500() {
        String valorEsperado = " no es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(1500);
        assertEquals(valorEsperado, valorActual);
         
    }
    public void test2030() {
        String valorEsperado = " no es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(1500);
        assertEquals(valorEsperado, valorActual);
         }
}
