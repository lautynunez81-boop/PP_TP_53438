public class Main {

    public static void main(String[] args) {

        // Crear primer evento
        EventoUniversitario evento1 =
                new EventoUniversitario(
                        "EV001",
                        "Jornada de Programación",
                        10000,
                        false
                );

        // Crear copia del primer evento
        EventoUniversitario copiaEvento1 =
                new EventoUniversitario(evento1);


        // Crear segundo evento
        EventoUniversitario evento2 =
                new EventoUniversitario(
                        "EV002",
                        "Charla de Inteligencia Artificial",
                        5000,
                        true
                );

        // Crear copia del segundo evento
        EventoUniversitario copiaEvento2 =
                new EventoUniversitario(evento2);


        System.out.println("EVENTO 1");
        evento1.mostrarDatos();

        System.out.println("COPIA EVENTO 1");
        copiaEvento1.mostrarDatos();

        System.out.println("EVENTO 2");
        evento2.mostrarDatos();

        System.out.println("COPIA EVENTO 2");
        copiaEvento2.mostrarDatos();


        System.out.println(
                "Cantidad total de eventos creados: "
                        + EventoUniversitario.getCantidadEventos()
        );
    }
}