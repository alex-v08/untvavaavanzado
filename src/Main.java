import java.util.Collections;

public class Main {
    public static void main(String[] args) {



        Alumnos alumno1 = new Alumnos("Juan", 1, null);
        Alumnos alumno2 = new Alumnos("Pedro", 2, null);
        Alumnos alumno3 = new Alumnos("Maria", 3, null);

        Materia materia1 = new Materia("Algoritmos y Estructuras de Datos", null, false);
        Materia materia2 = new Materia("Paradigmas de Programación", null, false);
        Materia materia3 = new Materia("Diseño de Sistemas", null, false);
        Materia materia4 = new Materia("Base de Datos", null, false);

        materia1.setCorrelativas(null);
        materia2.setCorrelativas(Collections.singletonList(materia1));
        materia3.setCorrelativas(Collections.singletonList(materia2));
        materia4.setCorrelativas(Collections.singletonList(materia3));

        Inscripcion inscripcion1 = new Inscripcion(alumno1, materia1);

        System.out.println("Inscripcion 1: " + inscripcion1.aprobada());

        Inscripcion inscripcion2 = new Inscripcion(alumno2, materia2);

        System.out.println("Inscripcion 2: " + inscripcion2.aprobada());

        Inscripcion inscripcion3 = new Inscripcion(alumno3, materia3);

System.out.println("Inscripcion 3: " + inscripcion3.aprobada());




    }

}