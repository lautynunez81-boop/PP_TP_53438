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

    public void asignarSala(Sala sala) {
        this.sala = sala;
    }

    public void crearActividad(
            int id,
            String titulo,
            int cupo,
            String tipo) {

        if (tipo.equalsIgnoreCase("Charla")) {

            Charla charla =
                    new Charla(
                            id,
                            titulo,
                            cupo,
                            "Disertante"
                    );

            actividades.add(charla);

        } else if (tipo.equalsIgnoreCase("Taller")) {

            Taller taller =
                    new Taller(
                            id,
                            titulo,
                            cupo,
                            false
                    );

            actividades.add(taller);

        } else {

            System.out.println(
                    "Tipo de actividad inválido."
            );
        }
    }

    /*
     * Estos métodos permiten cargar los datos
     * específicos de cada subclase.
     */

    public void crearCharla(
            int id,
            String titulo,
            int cupo,
            String disertante) {

        Charla charla =
                new Charla(
                        id,
                        titulo,
                        cupo,
                        disertante
                );

        actividades.add(charla);
    }

    public void crearTaller(
            int id,
            String titulo,
            int cupo,
            boolean requiereNotebook) {

        Taller taller =
                new Taller(
                        id,
                        titulo,
                        cupo,
                        requiereNotebook
                );

        actividades.add(taller);
    }

    public double calcularCostoEstimado() {

        if (gratuito) {
            return 0;
        }

        double costoActividades = 0;

        for (Actividad actividad : actividades) {

            costoActividades +=
                    actividad.calcularCostoMateriales();
        }

        return (costoBase + costoActividades) * 1.21;
    }

    public void mostrarDatos() {

        System.out.println("============================");
        System.out.println("EVENTO UNIVERSITARIO");
        System.out.println("============================");

        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Costo base: $" + costoBase);
        System.out.println("Gratuito: " + gratuito);

        if (sala != null) {

            System.out.println(
                    "Sala: " + sala.getNombre()
            );

        } else {

            System.out.println("Sala: sin asignar");
        }

        System.out.println(
                "Costo estimado: $"
                        + calcularCostoEstimado()
        );

        System.out.println("Actividades:");

        for (Actividad actividad : actividades) {

            actividad.mostrarIdentificacion();

            System.out.println(
                    "Costo materiales: $"
                            + actividad.calcularCostoMateriales()
            );
        }

        System.out.println("============================");
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public static int getCantidadEventos() {
        return cantidadEventos;
    }
}
