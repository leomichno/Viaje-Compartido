package Proyecto_ViajeCompartido.Service;

import Proyecto_ViajeCompartido.Entity.Vehiculo;
import Proyecto_ViajeCompartido.Repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VehiculoService {
    @Autowired
    private VehiculoRepository vehiculoRepository;

    public Vehiculo crearVehiculo(Vehiculo vehiculo){
        return vehiculoRepository.save(vehiculo);
    }
    public List<Vehiculo> getAll(){
        return vehiculoRepository.findAll();
    }
}
