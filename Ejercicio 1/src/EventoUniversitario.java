
public class EventoUniversitario {

    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;

    private static int cantidadEventos = 0;

    // Constructor principal
    public EventoUniversitario(String id, String titulo,
                               double costoBase, boolean gratuito) {

        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;

        cantidadEventos++;
    }

    // Constructor de copia
    public EventoUniversitario(EventoUniversitario otro) {

        this.id = otro.id;
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;

        cantidadEventos++;
    }

    // Calcula el costo estimado
    public double calcularCostoEstimado() {

        if (gratuito) {
            return 0;
        }

        return costoBase * 1.21;
    }

    // Muestra los datos del evento
    public void mostrarDatos() {

        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Costo base: $" + costoBase);
        System.out.println("Gratuito: " + gratuito);
        System.out.println("Costo estimado: $" + calcularCostoEstimado());
        System.out.println("-----------------------------");
    }

    // Método de clase para consultar cantidad de eventos
    public static int getCantidadEventos() {
        return cantidadEventos;
    }
}