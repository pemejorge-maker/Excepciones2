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

    @Override
    public boolean equals(Object obj){
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Alumno otroAlumno = (Alumno)obj;
        if (this.clave == otroAlumno.getClave()) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getClave(){
        return clave;
    }

    public void setCalificacion(double calificacion){
        if (calificacion < 0 || calificacion > 10) {
            throw new CalificacionInvalidaException("Calificacion fuera de rango");
        }
        this.calificacion = calificacion;
    }
}
