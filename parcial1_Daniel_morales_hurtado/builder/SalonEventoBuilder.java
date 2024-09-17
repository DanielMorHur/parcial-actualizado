package co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.builder;

import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.model.SalonEvento;
import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.services.ISalonEventoBuilder;

public class SalonEventoBuilder implements ISalonEventoBuilder {
    protected String idSalon;
    protected int capacidad;
    protected String estado;
    protected String descripcion;


    @Override
    public ISalonEventoBuilder setIdSalon(String idSalon) {
        this.idSalon = idSalon;
        return this;
    }

    @Override
    public ISalonEventoBuilder setCapacidad(int capacidad) {
        this.capacidad = capacidad;
        return this;
    }

    @Override
    public ISalonEventoBuilder setEstado(String estado) {
        this.estado = estado;
        return this;
    }

    @Override
    public ISalonEventoBuilder setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    @Override
    public SalonEvento build() {
        return new SalonEvento(idSalon, capacidad, estado, descripcion);
    }
}
