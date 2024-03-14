
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Edad {
    public static String evaluar(int dia, int mes, int anno) {
        // TODO: Coloca aquí el código del ejercicio 6: Edad
        int respuesta=0;
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(anno, mes, dia);
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        respuesta = periodo.getYears();
        String res = "Usted tiene "+respuesta+" años";
        return res;
    }
    
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}
