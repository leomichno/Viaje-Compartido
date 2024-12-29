package Proyecto_ViajeCompartido.Controller;


import Proyecto_ViajeCompartido.DTO.ViajeDTO;
import Proyecto_ViajeCompartido.Entity.Viaje;
import Proyecto_ViajeCompartido.Service.ViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/viaje")
public class ViajeController {
    @Autowired
    private ViajeService viajeService;


    @PostMapping()
    public Viaje crearViaje(@RequestBody ViajeDTO dto){
        return viajeService.crearViaje(dto);
    }
}
