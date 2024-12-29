package Proyecto_ViajeCompartido.Entity.Usuario;

import Proyecto_ViajeCompartido.Entity.Vehiculo;
import Proyecto_ViajeCompartido.Entity.Viaje;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import org.springframework.data.annotation.PersistenceConstructor;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("CONDUCTOR")
public class Conductor extends Usuario{

    @OneToOne()
    @JoinColumn(name = "id_auto")
    private Vehiculo vehiculo;

    public Conductor(){};


    @PersistenceConstructor
    public Conductor(String nombre, double saldo,String tipoUsuario, Vehiculo vehiculo) {
        super(nombre, saldo,tipoUsuario);
        this.vehiculo = vehiculo;
    }

    public Vehiculo getVehiculo(){
        return vehiculo;
    }

    public void crearViaje(Viaje viaje){
        this.agregarViaje(viaje);
    }

    public boolean buscarViaje(LocalDate fechaDeViaje){
        return this.getViajes().stream().noneMatch(viaje -> viaje.getFechaDeViaje().isEqual(fechaDeViaje));
    }

}