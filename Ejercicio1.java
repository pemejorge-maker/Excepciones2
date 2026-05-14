import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ejercicio1 {
    public static void main(String[] args) {

        File archivo = new File("entrada.txt");
        PrintWriter salida = null;
        int a , b;
        Scanner teclado= null;

        try 
        {
            teclado = new Scanner(archivo);
            salida = new PrintWriter("salida.txt");
            //System.out.println("Escribe el 1er numero");  
            a = teclado.nextInt(); 
            //System.out.println("Escribe el 2do numero");  
            b = teclado.nextInt(); 
            salida.println("La division es: " + a/b);
            //System.out.println("La divicion es: "+ a/b);
        } 

        catch (ArithmeticException e) 
        {
            System.out.println("Division por 0");
        }

        catch (InputMismatchException e) 
        {
            System.out.println("Entrada no valida");

        }

        catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado");
        }

        finally
        {
            if(teclado != null){
                teclado.close();
            }
            if (salida != null) {
                salida.close();
            }
        }
        
    }
}