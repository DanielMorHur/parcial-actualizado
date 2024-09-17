package co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.services;

public interface ISalonEventosCrud {
    boolean crearSalonEventos(String idSalon, int capacidad, String estado, String descripcion);
    String obtenerDatosSalonEventos(String idSalon);
    boolean actualizarSalonEventos(String idSalon, int capacidad, String estado,String estadoNuevo, String descripcion);
    boolean eliminarSalonEventos(String idSalon);
}
