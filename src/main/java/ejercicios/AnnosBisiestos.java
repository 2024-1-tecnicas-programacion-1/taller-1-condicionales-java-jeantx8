
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class AnnosBisiestos {
    public static String evaluar(int anno){
       
        // TODO: Coloca aquí el código del ejercicio 2: Años bisiestos
        if (anno<1582 && anno % 4 != 0 )
        {
            return(" no se considera  bisiesto ");
        }
        else if (anno<1582 && anno % 100 !=0)
        {
            return(" es bisiesto");
        }
        else if (anno>=1582 && anno % 400 ==0 )
        {
             return(" no se considera bisiesto");  
        }
        else
        {
            return (" es bisiesto");   
        }
        
        
 
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(anno);
        System.out.println(respuesta);
    }
            
}