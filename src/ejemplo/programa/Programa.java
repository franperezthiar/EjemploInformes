package ejemplo.programa;

import ejemplo.base.Alumno;
import ejemplo.base.Profesor;
import ejemplo.base.Asignatura;

import java.time.LocalDate;
import java.util.HashSet;

public class Programa {

    public static void main(String[] args) {
        Profesor profesor1 =new Profesor("Fernando","Veldon");
        Profesor profesor2 =new Profesor("Maria","Jimenez");

        Alumno alumno1 = new Alumno("1234", LocalDate.now());
        Alumno alumno2 = new Alumno("5678", LocalDate.now());

        Asignatura asignatura1 = new Asignatura("Biologia", profesor1);
        Asignatura asignatura2 = new Asignatura("Matematicas",profesor2);
        Asignatura asignatura3 = new Asignatura("Fisica", profesor2);

        asignatura1.getAlumnos().add(alumno1);
        asignatura1.getAlumnos().add(alumno2);
        asignatura2.getAlumnos().add(alumno2);
        asignatura3.getAlumnos().add(alumno1);

        HashSet<Asignatura> asignaturas = new HashSet<>();
        asignaturas.add(asignatura1);
        asignaturas.add(asignatura2);
        asignaturas.add(asignatura3);
    }
}
