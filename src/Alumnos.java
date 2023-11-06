import java.util.List;

public class Alumnos {

    private String nombre;
    private int legajo;
    private List<Inscripcion> inscripciones;

    public Alumnos() {
    }
    public Alumnos(String nombre, int legajo, List<Inscripcion> inscripciones) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.inscripciones = inscripciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(List<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }
}
