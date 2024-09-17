package co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.services;

public interface IClientesCrud {

    boolean actualizarCliente(String nombre, String Dni, String DniNuevo, int numeroHabitacion);
    boolean eliminarCliente(String Dni);
    boolean crearCliente(String nombre, String Dni, int numeroHabitacion);
    String obtenerDatosCliente(String Dni);
}
