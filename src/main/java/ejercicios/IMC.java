
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class IMC {
    public static String evaluar(int peso, double estatura, int edad) {
        // TODO: Coloca aquí el código del ejercicio 8: Índice de masa corporal
     
  
        double imc = peso / (estatura * estatura);
        String respuesta = "";

        if (edad <= 0 || peso <= 0 || estatura <= 0) {
            respuesta = "invalido";
        } else {
            if (edad < 45) {
                if (imc < 22.0) {
                    respuesta = "bajo";
                } else if (imc >= 22.0) {
                    respuesta = "promedio";
                }
            } else if (edad >= 45) {
                if (imc < 22.0) {
                    respuesta = "promedio";
                } else if (imc >= 22.0) {
                    respuesta = "alto";
                }
            }
        }
        

        return respuesta;
    
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
            System.out.print("Peso:");
        int peso = lector.nextInt();
        System.out.print("Estatura:");
        double estatura = lector.nextDouble();
        System.out.print("Edad:");
        int edad = lector.nextInt();
        
        String res = evaluar(peso, estatura, edad);
        System.out.println(res);
    }
}