import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejercicio1 {

    public static void main(String[] args) {

        File archivo = new File("entrada.txt");

        int a , b;
        Scanner teclado= null;

        try 
        {
            teclado = new Scanner(archivo);
            System.out.println("Escribe el 1er numero");  
            a = teclado.nextInt(); 
            System.out.println("Escribe el 2do numero");  
            b = teclado.nextInt(); 
            System.out.println("La divicion es: "+ a/b);
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
            System.out.println("archivo no encontrado");
        }

        finally
        {
            if(teclado != null){
                teclado.close();
            }
        }
        
    }
}