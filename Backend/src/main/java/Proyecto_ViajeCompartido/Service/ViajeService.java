package Proyecto_ViajeCompartido.Service;


import Proyecto_ViajeCompartido.DTO.ViajeDTO;
import Proyecto_ViajeCompartido.Entity.Usuario.Conductor;
import Proyecto_ViajeCompartido.Entity.Viaje;
import Proyecto_ViajeCompartido.Repository.ViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViajeService {

    private ViajeRepository viajeRepository;
    private ConductorService conductorService;

    @Autowired
    public ViajeService(ViajeRepository viajeRepository,ConductorService conductorService){
        this.viajeRepository=viajeRepository;
        this.conductorService=conductorService;
    }

    public Viaje buscarViaje(Long id){
        return viajeRepository.findById(id).orElseThrow(()->new RuntimeException("Viaje no encontrado"));
    }


    public Viaje crearViaje(ViajeDTO dto){
        Conductor usuario=conductorService.getConductor(dto.getId());
        Viaje viaje = new Viaje(dto.getOrigen(), dto.getDestino(), dto.getCostoTotal(), dto.getFechaDeViaje());
        if((usuario.getTipoDeUsuario().equals("CONDUCTOR"))&&(usuario.tieneViajeEnFecha(viaje.getFechaDeViaje()))){
            usuario.crearViaje(viaje);
            viaje.setCapacidadTotal(usuario.getVehiculo().getCapacidadDePasajeros());
            viaje.agregarPersona(usuario);
            return viajeRepository.save(viaje);
        }

        throw new RuntimeException("El usuario deber ser conductor para crear un viaje");
    }


}
