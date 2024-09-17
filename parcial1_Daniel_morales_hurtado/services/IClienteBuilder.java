package co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.services;

import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.model.Cliente;

public interface IClienteBuilder {
    IClienteBuilder setPeso(String peso);
    IClienteBuilder setNombre(String nombre);
    IClienteBuilder setDni(String dni);
    IClienteBuilder setNumeroHabitacion(int numeroHabitacion);
    Cliente build();
}
