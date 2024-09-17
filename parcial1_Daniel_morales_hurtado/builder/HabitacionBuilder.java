package co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.builder;

import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.model.Habitacion;
import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.services.IHabitacionBuilder;

public class HabitacionBuilder implements IHabitacionBuilder {
    protected String numero;
    protected String tipo;
    protected int precio;

    @Override
    public IHabitacionBuilder setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    @Override
    public IHabitacionBuilder setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    @Override
    public IHabitacionBuilder setPrecio(int precio) {
        this.precio = precio;
        return this;
    }

    @Override
    public Habitacion build() {
        return new Habitacion(numero, precio, tipo);
    }
}
