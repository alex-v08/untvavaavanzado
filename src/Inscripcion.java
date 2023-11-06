public class Inscripcion {
    private Alumnos alumno;
    private Materia materia;

    public boolean aprobada() {
        for (Materia correlativa : materia.getCorrelativas()) {
            if (!correlativa.isAprobada()) {
                return false;
            }
        }
        return true;
    }


    public Alumnos getAlumno() {
        return alumno;
    }

    public Inscripcion() {
        this.alumno = alumno;
        this.materia = materia;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }

    public void setMateria(Materia materia) {
    }
}
