package Proyecto_ViajeCompartido.Repository;


import Proyecto_ViajeCompartido.Entity.Viaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViajeRepository extends JpaRepository<Viaje,Long> {

}
