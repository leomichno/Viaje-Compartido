package Proyecto_ViajeCompartido.Controller;

import Proyecto_ViajeCompartido.Entity.Vehiculo;
import Proyecto_ViajeCompartido.Repository.VehiculoRepository;
import Proyecto_ViajeCompartido.Service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    @PostMapping()
    public Vehiculo crearVehiculo(@RequestBody Vehiculo vehiculo){
        return vehiculoService.crearVehiculo(vehiculo);
    }


    @GetMapping()
    public List<Vehiculo> getAll(){
        return vehiculoService.getAll();
    }

}
