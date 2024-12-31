package Proyecto_ViajeCompartido.Controller;


import Proyecto_ViajeCompartido.DTO.PasajeroDTO;
import Proyecto_ViajeCompartido.DTO.UnirseViajeDTO;
import Proyecto_ViajeCompartido.Entity.Usuario.Pasajero;
import Proyecto_ViajeCompartido.Service.PasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pasajero")
public class PasajeroController {
    @Autowired
    private PasajeroService pasajeroService;

    @PostMapping
    public Pasajero crearPasajero(@RequestBody PasajeroDTO dto){
        return pasajeroService.crearPasajero(dto);
    }

    @PostMapping("/unirse")
    public boolean unirseAViaje(@RequestBody UnirseViajeDTO dto){
        return pasajeroService.unirseAViiaje(dto);
    }
}
