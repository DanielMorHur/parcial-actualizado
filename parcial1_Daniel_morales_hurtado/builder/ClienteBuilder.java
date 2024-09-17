package co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.builder;

import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.model.Cliente;
import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.services.IClienteBuilder;

public class ClienteBuilder implements IClienteBuilder {
    protected String nombre;
    protected String dni;
    protected int numeroHabitacion;
    private String peso;

    @Override
    public IClienteBuilder setPeso(String peso) {
        this.peso = peso;
        return this;
    }

    @Override
    public IClienteBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public IClienteBuilder setDni(String dni) {
        this.dni = dni;
        return this;
    }

    @Override
    public IClienteBuilder setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        return this;
    }

    @Override
    public Cliente build() {
        return new Cliente(nombre, dni, numeroHabitacion,peso);
    }
}
