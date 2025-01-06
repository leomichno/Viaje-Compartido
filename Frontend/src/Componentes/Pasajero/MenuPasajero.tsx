import '../../Estilos/Menu.css';
import {NavLink} from 'react-router-dom';

const MenuPasajero = () =>{
    return(
        <div className="nav">
            <ul>
                <li><NavLink to="/UnirseAViaje">Unirse A Viaje</NavLink></li>
                <li><NavLink to="/MisViajes">Ver Mis Viajes</NavLink></li>
                <li><NavLink to="/IniciarSesion">Cerrar Sesion</NavLink></li>
            </ul>
        </div>
        )
    }

export default MenuPasajero;