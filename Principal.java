import java.util.List;

public class Principal {
    public static void main(String[] args) {
        AlumnosDAO alumnoDAO = new AlumnosDAO("Alumnos.txt");
        try {
            List<Alumno> alumnos = alumnoDAO.leerTodos();
            System.out.println(alumnos);
        }
        catch(FormatoArchivoException | ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        
    }
}
