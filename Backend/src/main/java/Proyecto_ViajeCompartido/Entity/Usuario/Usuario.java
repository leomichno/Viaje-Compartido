package Proyecto_ViajeCompartido.Entity.Usuario;


import Proyecto_ViajeCompartido.Entity.Viaje;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_usuario", discriminatorType = DiscriminatorType.STRING)


public abstract class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;


    public Usuario() {
    }

    public Usuario(String nombre,double saldo,String tipoUsuario){
        this.nombre=nombre;
        this.saldo=saldo;
        this.tipoUsuario=tipoUsuario;
    }


    private String nombre;


    private double saldo;

    @ManyToMany(mappedBy = "usuarios")
    private List<Viaje> viajes = new ArrayList<>();


    @Column(name = "tipo_usuario", insertable = false, updatable = false)
    private String tipoUsuario;



    public String getTipoDeUsuario() {
        return tipoUsuario;
    }

    protected void agregarViaje(Viaje viaje){
        viajes.add(viaje);
    }

    protected List<Viaje> getViajes(){
        return viajes;
    }

}
