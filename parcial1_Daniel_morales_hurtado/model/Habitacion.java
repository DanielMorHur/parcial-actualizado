package co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.model;

import java.util.List;

public class Habitacion {
    public String numero;
    public int precio;
    public String tipo;
    public List<Habitacion> ListaHabitaciones;
    public Habitacion(String numero, int precio, String tipo) {
        this.numero = numero;
        this.precio = precio;
        this.tipo = tipo;
    }

    public Habitacion() {

    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Habitacion> getListaHabitaciones() {
        return ListaHabitaciones;
    }
    public void setListaHabitaciones(List<Habitacion> listaHabitaciones) {
        this.ListaHabitaciones = listaHabitaciones;

    }
    public String toString(){
        return "Numero: " +numero+ ", Precio: " +precio+ ", Tipo: " +tipo;
    }

}