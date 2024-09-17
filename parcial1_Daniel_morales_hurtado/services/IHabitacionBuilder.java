package co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.services;

import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.model.Habitacion;

public interface IHabitacionBuilder {
    IHabitacionBuilder setNumero(String numero);
    IHabitacionBuilder setTipo(String tipo);
    IHabitacionBuilder setPrecio(int precio);
    Habitacion build();
}
