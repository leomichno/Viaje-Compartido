package Proyecto_ViajeCompartido.Service;


import Proyecto_ViajeCompartido.DTO.ViajeDTO;
import Proyecto_ViajeCompartido.Entity.Usuario.Conductor;
import Proyecto_ViajeCompartido.Entity.Viaje;
import Proyecto_ViajeCompartido.Repository.ConductorRepository;
import Proyecto_ViajeCompartido.Repository.VehiculoRepository;
import Proyecto_ViajeCompartido.Repository.ViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViajeService {

    @Autowired
    private ViajeRepository viajeRepository;
    @Autowired
    private ConductorRepository conductorRepository;


    public Viaje crearViaje(ViajeDTO dto){
        System.out.println(dto.getId());
        Conductor usuario = conductorRepository.findById(dto.getId())
                .orElseThrow(()-> new RuntimeException("CONDUCTOR no encontrado"));
        System.out.println(usuario.getTipoDeUsuario());
        Viaje viaje = new Viaje(dto.getOrigen(), dto.getDestino(), dto.getCostoTotal(), dto.getFechaDeViaje());
        System.out.println(viaje);
        System.out.println(viaje.getFechaDeViaje());
        if((usuario.getTipoDeUsuario().equals("CONDUCTOR"))&&(usuario.buscarViaje(viaje.getFechaDeViaje()))){
            usuario.crearViaje(viaje);
            viaje.ocupantes().add(usuario);
            viaje.setCapacidadTotal(usuario.getVehiculo().getCapacidadDePasajeros()-1);
            return viajeRepository.save(viaje);
        }

        throw new RuntimeException("El usuario deber ser conductor para crear un viaje");
    }





}
