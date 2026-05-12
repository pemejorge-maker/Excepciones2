import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1{

    public static void main(String[] args){
        int a, b;
        Scanner teclado = new Scanner (System.in);

        try{
            System.out.println("Escribe el primer numero");
            a = teclado.nextInt();
            System.out.println("Escribe el segundo numero");
            b = teclado.nextInt();
            System.out.println("La division es: " + a/b);
        }
        catch (ArithmeticException e){
            System.out.println("Division por 0");
        }
        catch (InputMismatchException e){
            System.out.println("Entrada no valida");
        }
        finally{
            teclado.close();
        }

    }
}