public class Alumno {
    private int clave;
    private String nombre;
    private double calificacion;

    public Alumno(int clave, String nombre, double calificacion){
        this.clave = clave;
        this.calificacion = calificacion;
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return clave + ", " + nombre + ", " + calificacion;
    }
}
