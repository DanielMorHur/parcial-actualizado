package co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado;
import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.factory.ModelFactory;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        crudHabitacion(modelFactory);
        crudCliete(modelFactory);
        crudSalonEvento(modelFactory);
        cantidadDineroHabitaciones(modelFactory);

    }
    private static void crudHabitacion(ModelFactory modelFactory) {
        crearHabitacion(modelFactory);
        obtenerHabitacion(modelFactory);
        actualizarHabitacion(modelFactory);
        eliminarHabitacion(modelFactory);
    }
    private static void crudCliete(ModelFactory modelFactory) {
        crearCliente(modelFactory);
        obtenerCliente(modelFactory);
        actualizarCliente(modelFactory);
        eliminarCliente(modelFactory);
    }
    private static void crudSalonEvento(ModelFactory modelFactory) {
        crearSalonEvento(modelFactory);
        obtenerSalonEvento(modelFactory);
        actualizarSalonEvento(modelFactory);
        eliminarSalonEvento(modelFactory);
    }

    private static void crearHabitacion(ModelFactory modelFactory) {
        String numero = "102";
        int precio = 70000;
        String tipo = "doble";
        boolean resultado = modelFactory.crearHabitacion(numero,tipo,precio);
        notificacion(resultado, "Habitacion CREADADA: ");
    }
    private static void obtenerHabitacion(ModelFactory modelFactory) {
        String numero = "101";
        String resultado = "";
        resultado = modelFactory.obtenerHabitacion(numero);
        System.out.println("Habitacion: " + resultado);
    }
    private static void actualizarHabitacion(ModelFactory modelFactory) {
        String numero = "103";
        int precio = 70000;
        String tipo = "Suit";
        boolean resultado = modelFactory.actualizarHabitacion(numero,tipo,precio);
        notificacion(resultado, "Habitacion ACTUALIZADA: ");
    }
    private static void eliminarHabitacion(ModelFactory modelFactory) {
        String numero = "103";
        boolean resultado = modelFactory.eliminarHabitacion(numero);
        notificacion(resultado, " Habitacion ELIMINADA: ");
    }

    private static void crearCliente(ModelFactory modelFactory) {
        String Dni = "526456789";
        String nombre = "Daniel";
        int numeroHabitacion = 0;
        boolean resultado = modelFactory.crearCliente(Dni,nombre,numeroHabitacion);
        notificacion(resultado, "Cliente CREADADO: ");
    }
    private static void obtenerCliente(ModelFactory modelFactory) {
        String Dni = "526456789";
        String resultado = "";
        resultado = modelFactory.obtenerCliente(Dni);
        System.out.println("Cliente con el Dni: " + resultado);
    }
    private static void actualizarCliente(ModelFactory modelFactory) {
        String nombre = "Alfredo Vargas";
        String Dni = "12348525";
        String DniNuevo = "147852369";
        int numeroHabitacion = 102;
        boolean resultado = modelFactory.actualizarCliente(nombre,Dni,DniNuevo,numeroHabitacion);
        notificacion(resultado, "Cliente ACTUALIZADO: ");
    }
    private static void eliminarCliente(ModelFactory modelFactory) {
        String Dni = "526456789";
        boolean resultado = modelFactory.eliminarCliente(Dni);
        notificacion(resultado, " Cliente ELIMINADO: ");
    }

    private static void crearSalonEvento(ModelFactory modelFactory) {
        String idSalon = "130";
        int capacidad = 30;
        String estado = "Disponible";
        String descripcion = "Salon para comidas elegantes";
        boolean resultado = modelFactory.crearSalonEventos(idSalon, capacidad, estado, descripcion);
        notificacion(resultado, "Salon evento CREADO: ");
    }
    private static void obtenerSalonEvento(ModelFactory modelFactory) {
        String idSalon = "123456789";
        String resultado = "";
        resultado = modelFactory.obtenerSalonEventos(idSalon);
        System.out.println("Salon de eventos con el id: " + resultado);
    }
    private static void actualizarSalonEvento(ModelFactory modelFactory){
        String idSalon = "123456789";
        int capacidad = 30;
        String estado = "Disponible";
        String estadoNuevo = "Ocupado";
        String descripcion = "Salon para comidas elegantes";
        boolean resultado = modelFactory.actualizarSalonEventos(idSalon,capacidad,estado,estadoNuevo,descripcion);
        notificacion(resultado, "Salon evento ACTUALIZADO: ");
    }
    private static void eliminarSalonEvento(ModelFactory modelFactory){
        String idSalon = "123456789";
        boolean resultado = modelFactory.eliminarSalonEventos(idSalon);
        notificacion(resultado, " Salon evento ELIMINADO: ");
    }


    private static void notificacion(boolean resultado, String mensaje) {
        if (resultado)
            System.out.println(mensaje + " CORRECTAMENTE "  );
        else
            System.out.println(mensaje + " INCORRECTAMENTE");
    }

    private static void clientesSuperanPeso(ModelFactory modelFactory) {
        int sumatotal = 0;
        int resultado = modelFactory.clientesSuperanPeso(sumatotal);
        System.out.println("Clientes que superan peso: " + resultado);
    }

    private static void cantidadDineroHabitaciones(ModelFactory modelFactory){
        int resultado = modelFactory.cantidadDineroHabitaciones();
        System.out.println("Cantidad de dinero de las habitaciones: " + resultado);
    }
 //en cada metodo se evidencia la responsabilidad unica y vemos la segregacion de interfaces en cada una
}
