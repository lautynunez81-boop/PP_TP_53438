import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // ==========================
        // ESTUDIANTES
        // ==========================

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


        // ==========================
        // SALA
        // ==========================

        Sala sala =
                new Sala(
                        1,
                        "Aula Magna"
                );


        // ==========================
        // EVENTO
        // ==========================

        EventoUniversitario evento =
                new EventoUniversitario(
                        "EV001",
                        "Jornada de Tecnología",
                        10000,
                        false
                );


        // ==========================
        // ASIGNAR SALA
        // ==========================

        evento.asignarSala(sala);


        // ==========================
        // CHARLA
        // ==========================

        evento.crearCharla(
                1,
                "Introducción a Java",
                30,
                "Carlos Gomez"
        );


        // ==========================
        // TALLER
        // ==========================

        evento.crearTaller(
                2,
                "Programación Orientada a Objetos",
                20,
                true
        );


        // ==========================
        // OBTENER ACTIVIDADES
        // ==========================

        Actividad charla =
                evento.getActividades().get(0);

        Actividad taller =
                evento.getActividades().get(1);


        // ==========================
        // INSCRIPCIONES CHARLA
        // ==========================

        charla.inscribir(estudiante1);
        charla.inscribir(estudiante2);


        // ==========================
        // INSCRIPCIONES TALLER
        // ==========================

        taller.inscribir(estudiante2);
        taller.inscribir(estudiante3);


        // ==========================
        // MOSTRAR EVENTO
        // ==========================

        evento.mostrarDatos();


        // ==========================
        // MOSTRAR INSCRIPCIONES
        // ==========================

        charla.mostrarInscripciones();

        System.out.println();

        taller.mostrarInscripciones();


        // ==========================
        // TOTAL EVENTOS
        // ==========================

        System.out.println();

        System.out.println(
                "Cantidad total de eventos: "
                        + EventoUniversitario.getCantidadEventos()
        );
    }
}