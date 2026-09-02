import java.util.ArrayList;
import java.util.List;

public class Actividad {

    private int id;
    private String titulo;
    private int cupoMaximo;

    private static final int CUPO_MINIMO = 1;

    private List<Inscripcion> inscripciones;

    public Actividad(int id, String titulo, int cupoMaximo) {

        this.id = id;
        this.titulo = titulo;

        if (cupoMaximo >= CUPO_MINIMO) {
            this.cupoMaximo = cupoMaximo;
        } else {
            this.cupoMaximo = CUPO_MINIMO;
        }

        this.inscripciones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public Inscripcion inscribir(Estudiante estudiante) {

        if (inscripciones.size() < cupoMaximo) {

            Inscripcion nuevaInscripcion =
                    new Inscripcion(estudiante);

            inscripciones.add(nuevaInscripcion);

            return nuevaInscripcion;
        }

        System.out.println(
                "No hay cupo disponible en la actividad: "
                        + titulo
        );

        return null;
    }

    public void mostrarInscripciones() {

        System.out.println("Inscripciones de: " + titulo);

        if (inscripciones.isEmpty()) {
            System.out.println("No hay estudiantes inscriptos.");
        } else {

            for (Inscripcion inscripcion : inscripciones) {
                inscripcion.mostrarDatos();
            }
        }
    }
}
