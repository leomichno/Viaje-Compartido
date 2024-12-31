package Proyecto_ViajeCompartido.Repository;

import Proyecto_ViajeCompartido.Entity.Usuario.Pasajero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasajeroRepository extends JpaRepository<Pasajero,Long> {
}
