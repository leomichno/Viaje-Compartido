import '../../Estilos/Menu.css';
import {NavLink } from 'react-router-dom';

const MenuConductor = () =>{
    return(
        <div className="nav">
            <ul>
                <li><NavLink  to="/CrearViaje">Crear Viaje</NavLink ></li>
                <li><NavLink  to="/AceptarPasajero">Aceptar Pasajero</NavLink ></li>
                <li><NavLink  to="/MisViajes">Mis viajes</NavLink ></li>
                <li><NavLink  to="/IniciarSesion">Cerrar sesion</NavLink ></li>
            </ul>
        </div>
        )

    }

export default MenuConductor;