package Proyecto_ViajeCompartido.Service;


import Proyecto_ViajeCompartido.DTO.PasajeroDTO;
import Proyecto_ViajeCompartido.DTO.UnirseViajeDTO;
import Proyecto_ViajeCompartido.Entity.Usuario.Pasajero;
import Proyecto_ViajeCompartido.Entity.Viaje;
import Proyecto_ViajeCompartido.Repository.PasajeroRepository;
import jakarta.transaction.Transactional;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasajeroService {

    private PasajeroRepository pasajeroRepository;
    private ViajeService viajeService;

    @Autowired
    public PasajeroService(PasajeroRepository pasajeroRepository,ViajeService viajeService){
        this.pasajeroRepository=pasajeroRepository;
        this.viajeService=viajeService;
    }

    public Pasajero crearPasajero(PasajeroDTO dto){
        Pasajero pasajero = new Pasajero(dto.getNombre(),dto.getSaldo(), dto.getTipoUsuario());
        return pasajeroRepository.save(pasajero);
    }

    @Transactional
    public boolean unirseAViiaje(UnirseViajeDTO dto){
        Viaje viaje= viajeService.buscarViaje(dto.getIdViaje());
        Pasajero pasajero = pasajeroRepository.findById(dto.getIdPasajero()).orElseThrow(()-> new RuntimeException("Pasajero no encontrado"));
        if(viaje.getCapacidadDisponible()>0){
            pasajero.unirmeAViaje(viaje);
            viaje.agregarPersona(pasajero);
            return true;
        }
        return false;
    }

}
