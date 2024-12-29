package Proyecto_ViajeCompartido.Entity;

import Proyecto_ViajeCompartido.Entity.Usuario.Usuario;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToMany
    @JoinTable(
            name = "viaje_usuarios",
            joinColumns = @JoinColumn(name = "viaje_id"),
            inverseJoinColumns = @JoinColumn(name = "usuario_id")
    )
    private List<Usuario> usuarios = new ArrayList<>();

    @Column(nullable = false)
    private String origen;

    @Column(nullable = false)
    private String destino;

    @Column(nullable = false)
    private double costoTotal;

    @Column(nullable = false)
    private LocalDate fechaDeViaje;

    private Integer capacidadTotal;

    public Viaje(String origen,String destino,double costoTotal,LocalDate fechaDeViaje){
        this.origen=origen;
        this.destino=destino;
        this.costoTotal=costoTotal;
        this.fechaDeViaje=fechaDeViaje;
        capacidadTotal=0;
    }


    public List<Usuario> ocupantes(){
        return usuarios;
    }

    public void setCapacidadTotal(Integer capacidad){
        capacidadTotal=capacidad;
    }

    public LocalDate getFechaDeViaje(){
        return fechaDeViaje;
    }
}
