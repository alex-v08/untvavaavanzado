public class Main {
    public static void main(String[] args) {
        Alumnos alumno = new Alumnos();
        alumno.setNombre("Juan");
        alumno.setLegajo(1234);
        Materia materia = new Materia();
        materia.setNombre("Algoritmos");
        materia.setAprobada(true);
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno);
        inscripcion.setMateria(materia);
        System.out.println("Inscripcion aprobada: " + inscripcion.aprobada());
    }
}