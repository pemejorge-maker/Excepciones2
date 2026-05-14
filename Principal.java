import java.util.List;

public class Principal {
    public static void main(String[] args) {
        AlumnosDAO alumnoDAO = new AlumnosDAO("Alumnos.txt");
        List<Alumno> alumnos = alumnoDAO.leerTodos();
        System.out.println(alumnos);
    }
}
