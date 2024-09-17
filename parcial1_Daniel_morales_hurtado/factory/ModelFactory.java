package co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.factory;

import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.builder.ClienteBuilder;
import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.builder.HabitacionBuilder;
import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.model.Cliente;
import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.model.Habitacion;
import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.model.Hotel;
import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.model.SalonEvento;
import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.services.IClientesCrud;
import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.services.IConsultaServices;
import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.services.IHabitacionCrud;
import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.services.ISalonEventosCrud;

import java.util.ArrayList;

public class ModelFactory implements IClientesCrud, IHabitacionCrud, IConsultaServices, ISalonEventosCrud {

    private static ModelFactory modelFactory;
    private static Hotel hotel;

    private ModelFactory() {
        inicializarDatos();
    }

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private void inicializarDatos() {
        hotel = new Hotel();
        Habitacion habitacion1 = new HabitacionBuilder()
                .setNumero("101")
                .setTipo("Simple")
                .setPrecio(60000)
                .build();
        Habitacion habitacion2 = new HabitacionBuilder()
                .setNumero("102")
                .setTipo("Doble")
                .setPrecio(90000)
                .build();
        Habitacion habitacion3 = new HabitacionBuilder()
                .setNumero("103")
                .setTipo("Suit")
                .setPrecio(120000)
                .build();
        Cliente cliente1 = new ClienteBuilder()
                .setDni("123456789")
                .setNombre("Daniel Morales")
                .setNumeroHabitacion(101)
                .setPeso("60")
                .build();
        Cliente cliente2 = new ClienteBuilder()
                .setDni("12348525")
                .setNombre("Alfredo")
                .setNumeroHabitacion(102)
                .setPeso("80")
                .build();
        Cliente cliente3 = new ClienteBuilder()
                .setDni("526456789")
                .setNombre("Miguel")
                .setPeso("80")
                .setNumeroHabitacion(103)
                .build();
        SalonEvento salon1 = new SalonEvento("123456789",20,"disponible","Salon para bailes")
                .build();
        SalonEvento salon2 = new SalonEvento("123456789",50,"ocupado","Salon para bodas")
                .build();
        SalonEvento salon3 = new SalonEvento("1238520789",80,"disponible","Salon para cocinar")
                .build();
        hotel.SetListaSalonEventos(new ArrayList<>());
        hotel.setListaClientes(new ArrayList<>());
        hotel.setListaHabitaciones(new ArrayList<>());
        hotel.getListaClientes().add(cliente1);
        hotel.getListaClientes().add(cliente2);
        hotel.getListaClientes().add(cliente3);
        hotel.getListaHabitaciones().add(habitacion1);
        hotel.getListaHabitaciones().add(habitacion2);
        hotel.getListaHabitaciones().add(habitacion3);
        hotel.getListaSalonEventos().add(salon1);
        hotel.getListaSalonEventos().add(salon2);
        hotel.getListaSalonEventos().add(salon3);
    }

    @Override
    public boolean crearHabitacion(String numero, String tipo, int precio) {
        return hotel.crearHabitacion(numero, tipo, precio);
    }

    @Override
    public String obtenerDatosHabitacion(String numero) {
        return hotel.obtenerDatosHabitacion(numero);
    }

    public String obtenerHabitacion(String numero){
        return hotel.obtenerDatosHabitacion(numero);
    }

    @Override
    public boolean actualizarHabitacion(String numero, String tipoNuevo, int precio) {
        return hotel.actualizarHabitacion(numero, tipoNuevo, precio);
    }

    @Override
    public boolean eliminarHabitacion(String numero) {
        return hotel.eliminarHabitacion(numero);
    }

    @Override
    public boolean crearCliente(String nombre, String dni, int numeroHabitacion) {
        return hotel.crearCliente(nombre, dni, numeroHabitacion);
    }

    @Override
    public String obtenerDatosCliente(String dni) {
        return hotel.obtenerDatosCliente(dni);
    }

    public String obtenerCliente(String Dni){
        return hotel.obtenerDatosCliente(Dni);
    }

    @Override
    public boolean actualizarCliente(String nombre, String dni, String dniNuevo, int numeroHabitacion) {
        return hotel.actualizarCliente(nombre, dni, dniNuevo, numeroHabitacion);
    }

    @Override
    public boolean eliminarCliente(String dni) {
        return hotel.eliminarCliente(dni);
    }

    @Override
    public boolean crearSalonEventos(String idSalon, int capacidad, String estado, String descripcion){
        return hotel.crearSalonEventos(idSalon, capacidad, estado, descripcion);
    }
    @Override
    public String obtenerDatosSalonEventos(String idSalon) {
        return hotel.obtenerDatosSalonEventos(idSalon);
    }
    public String obtenerSalonEventos(String idSalon){
        return hotel.obtenerDatosSalonEventos(idSalon);
    }
    @Override
    public boolean actualizarSalonEventos(String idSalon, int capacidad, String estado, String estadoNuevo, String descripcion) {
        return hotel.actualizarSalonEventos(idSalon, capacidad, estado, estadoNuevo, descripcion);
    }
    @Override
    public boolean eliminarSalonEventos(String idSalon) {
        return hotel.eliminarSalonEventos(idSalon);
    }

    public int clientesSuperanPeso(int sumatotal){
        return hotel.clientesSuperanPeso(sumatotal);
    }

    public int cantidadDineroHabitaciones(){
        return hotel.cantidadDineroHabitaciones();
    }

}
