package co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.services;

public interface IHabitacionCrud {

    boolean actualizarHabitacion(String numero, String tipoNuevo, int precio);
    boolean eliminarHabitacion(String numero);
    boolean crearHabitacion(String numero, String tipo, int precio);
    String obtenerDatosHabitacion(String numero);
}
