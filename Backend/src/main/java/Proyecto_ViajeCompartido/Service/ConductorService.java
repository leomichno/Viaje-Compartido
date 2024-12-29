package Proyecto_ViajeCompartido.Service;


import Proyecto_ViajeCompartido.Entity.Usuario.Conductor;
import Proyecto_ViajeCompartido.Repository.ConductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConductorService {
    @Autowired
    private ConductorRepository conductorRepository;

    public Conductor crearConductor(Conductor conductor){
        return conductorRepository.save(conductor);
    }

    public List<Conductor> getConductores(){
        return conductorRepository.findAll();
    }
}
