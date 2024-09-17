package co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.services;

import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.model.SalonEvento;

public interface ISalonEventoBuilder {
    ISalonEventoBuilder setIdSalon(String idSalon);
    ISalonEventoBuilder setCapacidad(int capacidad);
    ISalonEventoBuilder setEstado(String estado);
    ISalonEventoBuilder setDescripcion(String descripcion);
    SalonEvento build();
}
