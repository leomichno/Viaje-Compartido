package Proyecto_ViajeCompartido.DTO;

import java.time.LocalDate;

public class ViajeDTO {
    private Long id;
    private String origen;
    private String destino;
    private double costoTotal;
    private LocalDate fechaDeViaje;

    public Long getId(){
        return id;
    }

    public String getOrigen(){
        return origen;
    }

    public String getDestino(){
        return destino;
    }

    public double getCostoTotal(){
        return costoTotal;
    }

    public LocalDate getFechaDeViaje(){
        return fechaDeViaje;
    }


}
