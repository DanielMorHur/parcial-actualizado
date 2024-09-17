package co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.model;

import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.services.IClientesCrud;
import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.services.IConsultaServices;
import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.services.IHabitacionCrud;
import co.edu.uniquindio.hotel.parcial1_Daniel_morales_hurtado.services.ISalonEventosCrud;

import java.util.List;

public class Hotel implements IClientesCrud, IHabitacionCrud, IConsultaServices, ISalonEventosCrud {
    private List<Cliente> listaClientes;
    private List<Habitacion> listaHabitaciones;
    private List<SalonEvento> listaSalonEventos;

    public Hotel() {
    }

    public List<SalonEvento> getListaSalonEventos() {
        return this.listaSalonEventos;
    }
    public List<Habitacion> getListaHabitaciones() {
        return this.listaHabitaciones;
    }
    public List<Cliente> getListaClientes() {
        return this.listaClientes;
    }

    public void SetListaSalonEventos(List<SalonEvento> listaSalonEventos) {
        this.listaSalonEventos = listaSalonEventos;
    }
    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    public void setListaHabitaciones(List<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    @Override
    public boolean crearHabitacion(String numero, String tipo, int precio) {
        Habitacion habitacionExistente = obtenerHabitacion(numero);
        if (habitacionExistente == null) {
            Habitacion habitacion = new Habitacion();
            habitacion.setNumero(numero);
            habitacion.setTipo(tipo);
            habitacion.setPrecio(precio);
            listaHabitaciones.add(habitacion);
            return true;
        }else{
            return false;
        }
    }
    public Habitacion obtenerHabitacion(String numero){
        Habitacion habitacionExistente = null;
        for (Habitacion habitacion : getListaHabitaciones()) {
            if(habitacion.getNumero().equals(numero)){
                habitacionExistente = habitacion ;
                break;
            }
        }
        return habitacionExistente;
    }
    @Override
    public String obtenerDatosHabitacion(String numero) {
        Habitacion habitacionExistente = obtenerHabitacion(numero);
        if (habitacionExistente != null) {
            return habitacionExistente.toString();
        }
        return "";
    }
    @Override
    public boolean actualizarHabitacion(String numero,String tipoNuevo, int precio) {
        Habitacion habitacionExistente = obtenerHabitacion(numero);
        if (habitacionExistente == null) {
            habitacionExistente.setNumero(numero);
            habitacionExistente.setTipo(tipoNuevo);
            habitacionExistente.setPrecio(precio);
            return true;
        }else{
            return false;
        }
    }
    @Override
    public boolean eliminarHabitacion(String numero) {
        Habitacion habitacionExistente = obtenerHabitacion(numero);
        if (habitacionExistente != null){
            getListaHabitaciones().remove(habitacionExistente);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean crearCliente(String nombre, String Dni, int numeroHabitacion) {
        Cliente clienteExistente = obtenerCliente(Dni);
        if (clienteExistente == null) {
            Cliente cliente = new Cliente();
            cliente.setNombre(nombre);
            cliente.setDni(Dni);
            cliente.setNumeroHabitacion(numeroHabitacion);
            listaClientes.add(cliente);
            return true;
        }else{
            return false;
        }
    }
    public Cliente obtenerCliente(String Dni){
        Cliente clienteExstente = null;
        for (Cliente cliente : getListaClientes()) {
            if (cliente.getDni().equals(Dni)) {
                clienteExstente = cliente;
                break;
            }
        }
        return clienteExstente;
    }
    public String obtenerDatosCliente(String Dni){
        Cliente clienteExstente = obtenerCliente(Dni);
        if (clienteExstente != null) {
            return clienteExstente.toString();
        }
        return "";
    }
    @Override
    public boolean actualizarCliente(String nombre,String Dni, String DniNuevo, int numeroHabitacion) {
        Cliente clienteExistente = obtenerCliente(Dni);
        if (clienteExistente == null) {
            clienteExistente.setNombre(nombre);
            clienteExistente.setDni(DniNuevo);
            clienteExistente.setNumeroHabitacion(numeroHabitacion);
            return true;
        }else{
            return false;
        }
    }
    public boolean eliminarCliente(String Dni){
        Cliente clienteExstente = obtenerCliente(Dni);
        if (clienteExstente != null) {
            getListaClientes().remove(clienteExstente);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean crearSalonEventos(String idSalon, int capacidad, String estado, String descripcion) {
        SalonEvento salonEventoExistente = obtenerSalonEvento(idSalon);
        if (salonEventoExistente == null) {
            SalonEvento salonEvento = new SalonEvento();
            salonEvento.setIdSalon(idSalon);
            salonEvento.setCapacidad(capacidad);
            salonEvento.setEstado(estado);
            salonEvento.setDescripcion(descripcion);
            listaSalonEventos.add(salonEvento);
            return true;
        }
        return false;
    }
    public SalonEvento obtenerSalonEvento(String idSalon){
        SalonEvento salonEventoExistente = null;
        for (SalonEvento salonesEvento: getListaSalonEventos()){
            if(salonesEvento.getIdSalon().equals(idSalon)){
                salonEventoExistente = salonesEvento;
                break;
            }
        }
        return salonEventoExistente;
    }
    @Override
    public String obtenerDatosSalonEventos(String idSalon) {
        SalonEvento salonEventosExistente = obtenerSalonEvento(idSalon);
        if (salonEventosExistente != null) {
            return salonEventosExistente.toString();
        }else{
            return "";
        }
    }
    @Override
    public boolean actualizarSalonEventos(String idSalon, int capacidad, String estado, String estadoNuevo, String descripcion) {
        SalonEvento salonEventoExistente = obtenerSalonEvento(idSalon);
        if (salonEventoExistente == null) {
            salonEventoExistente.setIdSalon(idSalon);
            salonEventoExistente.setCapacidad(capacidad);
            salonEventoExistente.setEstado(estadoNuevo);
            salonEventoExistente.setDescripcion(descripcion);
            return true;
        }else{
            return false;
        }
    }
    @Override
    public boolean eliminarSalonEventos(String idSalon) {
        SalonEvento salonEventosExistente = obtenerSalonEvento(idSalon);
        if (salonEventosExistente != null) {
            getListaSalonEventos().remove(salonEventosExistente);
            return true;
        }else{
        return false;
        }
    }

    public int clientesSuperanPeso(int sumatotal){
        for (Cliente cliente: getListaClientes()){
            if (Cliente.getPeso() == "80"){
                sumatotal += 1;
            }
        }
        return sumatotal;
    }

    public int cantidadDineroHabitaciones(){
        int sumatotal = 0;
        for (Habitacion habitacion : getListaHabitaciones()) {
            sumatotal += habitacion.getPrecio();
        }
        return sumatotal;
    }
}


