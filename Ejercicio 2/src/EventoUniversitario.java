import java.util.ArrayList;
import java.util.List;

public class EventoUniversitario {

    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;

    private static int cantidadEventos = 0;

    private Sala sala;
    private List<Actividad> actividades;

    // Constructor principal
    public EventoUniversitario(
            String id,
            String titulo,
            double costoBase,
            boolean gratuito) {

        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;

        this.sala = null;
        this.actividades = new ArrayList<>();

        cantidadEventos++;
    }

    // Constructor de copia
    public EventoUniversitario(EventoUniversitario otro) {

        this.id = otro.id;
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;

        this.sala = otro.sala;

        this.actividades =
                new ArrayList<>(otro.actividades);

        cantidadEventos++;
    }

    public double calcularCostoEstimado() {

        if (gratuito) {
            return 0;
        }

        return costoBase * 1.21;
    }

    public void asignarSala(Sala sala) {
        this.sala = sala;
    }

    public void crearActividad(
            int id,
            String titulo,
            int cupo) {

        Actividad nuevaActividad =
                new Actividad(id, titulo, cupo);

        actividades.add(nuevaActividad);
    }

    public void mostrarDatos() {

        System.out.println("==============================");
        System.out.println("EVENTO UNIVERSITARIO");
        System.out.println("==============================");

        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Costo base: $" + costoBase);
        System.out.println("Gratuito: " + gratuito);
        System.out.println(
                "Costo estimado: $" + calcularCostoEstimado()
        );

        if (sala != null) {
            sala.mostrarDatos();
        } else {
            System.out.println("Sala: Sin asignar");
        }

        System.out.println("Actividades:");

        if (actividades.isEmpty()) {

            System.out.println("No hay actividades.");

        } else {

            for (Actividad actividad : actividades) {

                System.out.println(
                        "- " + actividad.getTitulo()
                                + " | ID: " + actividad.getId()
                                + " | Cupo: "
                                + actividad.getCupoMaximo()
                );
            }
        }

        System.out.println("==============================");
    }

    public static int getCantidadEventos() {
        return cantidadEventos;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }
}