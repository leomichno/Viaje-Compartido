package Proyecto_ViajeCompartido.Service;


import Proyecto_ViajeCompartido.Entity.Usuario.Conductor;
import Proyecto_ViajeCompartido.Repository.ConductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConductorService {

    private ConductorRepository conductorRepository;

    @Autowired
    public ConductorService(ConductorRepository conductorRepository){
        this.conductorRepository=conductorRepository;
    }

    public Conductor crearConductor(Conductor conductor){
        return conductorRepository.save(conductor);
    }

    public List<Conductor> getConductores(){
        return conductorRepository.findAll();
    }

    public Conductor getConductor(Long id){
        return conductorRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("CONDUCTOR no encontrado"));
    }


}
