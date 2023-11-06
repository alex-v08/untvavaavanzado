import java.util.HashSet;
import java.util.List;
import java.util.Set;




public class Materia {
    private String nombre;
    private Set<Materia> correlativas = new HashSet<>();
    private boolean aprobada;

    public Materia() {
    }

    public Materia(String algoritmosYEstructurasDeDatos, Object o, boolean b) {



    }

    public Materia(String nombre, Set<Materia> correlativas, boolean aprobada) {
        this.nombre = nombre;
        this.correlativas = correlativas;
        this.aprobada = aprobada;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Materia> getCorrelativas() {
        return correlativas;
    }

    public boolean isAprobada() {
        return aprobada;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorrelativas(List<Materia> correlativas) {

        this.correlativas.addAll(correlativas);

    }

    public void setAprobada(boolean aprobada) {
        this.aprobada = aprobada;
    }


}


