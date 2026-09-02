import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // ==============================
        // ESTUDIANTES
        // ==============================

        List<Estudiante> estudiantes =
                new ArrayList<>();

        Estudiante estudiante1 =
                new Estudiante(
                        "50123",
                        "Juan Perez"
                );

        Estudiante estudiante2 =
                new Estudiante(
                        "50456",
                        "Maria Gomez"
                );

        Estudiante estudiante3 =
                new Estudiante(
                        "50789",
                        "Pedro Lopez"
                );

        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);


        // ==============================
        // SALAS
        // ==============================

        Sala sala1 =
                new Sala(
                        1,
                        "Aula Magna"
                );

        Sala sala2 =
                new Sala(
                        2,
                        "Laboratorio 3"
                );


        // ==============================
        // EVENTOS
        // ==============================

        EventoUniversitario evento1 =
                new EventoUniversitario(
                        "EV001",
                        "Jornada de Programación",
                        10000,
                        false
                );

        EventoUniversitario evento2 =
                new EventoUniversitario(
                        "EV002",
                        "Encuentro Tecnológico",
                        15000,
                        false
                );


        // ==============================
        // ASIGNAR SALAS
        // ==============================

        evento1.asignarSala(sala1);

        evento2.asignarSala(sala2);


        // ==============================
        // CREAR ACTIVIDADES
        // ==============================

        evento1.crearActividad(
                1,
                "Introducción a Java",
                30
        );

        evento1.crearActividad(
                2,
                "Programación Orientada a Objetos",
                20
        );


        evento2.crearActividad(
                3,
                "Inteligencia Artificial",
                25
        );


        // ==============================
        // OBTENER ACTIVIDADES
        // ==============================

        Actividad actividad1 =
                evento1.getActividades().get(0);

        Actividad actividad2 =
                evento1.getActividades().get(1);

        Actividad actividad3 =
                evento2.getActividades().get(0);


        // ==============================
        // INSCRIPCIONES
        // ==============================

        actividad1.inscribir(estudiante1);
        actividad1.inscribir(estudiante2);

        actividad2.inscribir(estudiante2);
        actividad2.inscribir(estudiante3);

        actividad3.inscribir(estudiante1);
        actividad3.inscribir(estudiante3);


        // ==============================
        // MOSTRAR EVENTOS
        // ==============================

        evento1.mostrarDatos();

        actividad1.mostrarInscripciones();
        actividad2.mostrarInscripciones();


        evento2.mostrarDatos();

        actividad3.mostrarInscripciones();


        // ==============================
        // TOTAL DE EVENTOS
        // ==============================

        System.out.println();

        System.out.println(
                "Cantidad total de eventos: "
                        + EventoUniversitario.getCantidadEventos()
        );
    }
}
