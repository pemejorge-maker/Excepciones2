import java.util.List;

public class Principal {
    public static void main(String[] args) {
        AlumnosDAO alumnoDAO = new AlumnosDAO("Alumnos.txt");
        try {
            //List<Alumno> alumnos = alumnoDAO.leerTodos();
            //System.out.println(alumnos);
            alumnoDAO.agregaAlumno(new Alumno(123456, "Tia Paola", 7));
       }
       // catch(FormatoArchivoException | ArrayIndexOutOfBoundsException e){
           // System.err.println(e.getMessage());
           // e.printStackTrace();
       // }
        catch(EstudianteDuplicadoException e){
            System.out.println(e.getMessage());
        }


        
    }
}
