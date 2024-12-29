package Proyecto_ViajeCompartido.DTO;

import Proyecto_ViajeCompartido.Entity.Vehiculo;

public class ConductorDTO {
    private String nombre;
    private double saldo;
    private Vehiculo vehiculo;
    private String tipoUsuario;


    public String getNombre(){
        return nombre;
    }

    public double getSaldo(){
        return saldo;
    }

    public Vehiculo getVehiculo(){
        return vehiculo;
    }

    public String getTipoUsuario(){
        return tipoUsuario;
    }
}
