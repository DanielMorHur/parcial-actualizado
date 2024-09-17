package co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.model;

import java.util.ArrayList;
import java.util.List;

public class SalonEvento {
    public String idSalon;
    public int capacidad;
    public String estado;
    public String descripcion;
    public List<SalonEvento> listaSalonEventos = new ArrayList<SalonEvento>();

    public SalonEvento(String idSalon, int capacidad, String estado, String descripcion) {
        this.idSalon = idSalon;
        this.capacidad = capacidad;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public SalonEvento() {

    }

    public String getIdSalon() {
        return idSalon;
    }

    public void setIdSalon(String idSalon) {
        this.idSalon = idSalon;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<SalonEvento> getListaSalonEventos() {
        return listaSalonEventos;
    }

    public void setListaSalonEventos(List<SalonEvento> listaSalonEventos) {
        this.listaSalonEventos = listaSalonEventos;
    }

    public String toString() {
        return "id del salon: " + idSalon + "capacidad: " + capacidad + "estado: " + estado + "descripcion: " + descripcion;
    }

    public SalonEvento build() {
        return new SalonEvento(idSalon, capacidad, estado, descripcion);
    }
}
