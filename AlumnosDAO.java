import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AlumnosDAO {
    private String nombreArchivo;

    public AlumnosDAO(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }

    public List<Alumno> leerTodos() throws FormatoArchivoException{
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        Scanner entrada = null;
        try{
            entrada = new Scanner(new File(nombreArchivo));
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                String[] arreglo = linea.splitWithDelimiters(",", 3);
                int clave = Integer.parseInt(arreglo[0]);
                double calificacion = Double.parseDouble(arreglo[4]);
                Alumno alumno = new Alumno(clave, arreglo [2], calificacion);
                listaAlumnos.add(alumno);
            }
        }
        catch(NumberFormatException e){
            throw new FormatoArchivoException("Se esperaba un numero en la entrada.");
        }
        catch(FileNotFoundException e){
            System.err.println("Archivo no encontrado " + nombreArchivo);
        }
        finally{
            if (entrada != null) {
                entrada.close();
            }
        }

        return listaAlumnos;

    }

    public void agregaAlumno(Alumno alumno){
        PrintWriter salida = null;
        FileWriter archivo = null; //new FileWriter(nombreArchivo);
        try{
            List<Alumno> alumnos = this.leerTodos();
            if (alumnos.contains(alumno)) {
                throw new EstudianteDuplicadoException("No se puede agregar al alumno con clave " + alumno.getClave());
            }
            archivo = new FileWriter(nombreArchivo, true);
            salida = new PrintWriter(archivo);
            salida.println(alumno.toString());
        }
        catch(IOException e){
            System.out.println("Error del archivo " + nombreArchivo);
        }
        catch(FormatoArchivoException e){
            System.out.println(e.getMessage());
        }
        finally{
            if (salida != null) {
                salida.close();
            }
        }
        
    }
}
