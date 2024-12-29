package Proyecto_ViajeCompartido.Repository;

import Proyecto_ViajeCompartido.Entity.Usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
