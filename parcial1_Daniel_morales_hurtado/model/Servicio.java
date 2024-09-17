package co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.model;

import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.services.IConsumible;

public class Servicio implements IConsumible {
    public String servicionOfrecidos;
    @Override
    public void consumir(){
        servicionOfrecidos = "Spa ,restaurante y lipieza.";
    }
}