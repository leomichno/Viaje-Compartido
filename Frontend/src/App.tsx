import MenuConductor from './Componentes/Conductor/MenuConductor.tsx';
import './App.css';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import CrearViaje from './Componentes/Conductor/CrearViaje.tsx';
import AceptarPasajero from './Componentes/Conductor/AceptarPasajero.tsx'
import MisViajes from './Componentes/MisViajes.tsx'
import IniciarSesion from './Componentes/IniciarSesion/IniciarSesion.tsx';


function App() {

  return (
      <BrowserRouter>
          <div>
                <MenuConductor/>
                <Routes>
                    <Route path="/CrearViaje" element={<CrearViaje/>} />
                    <Route path="/AceptarPasajero" element={<AceptarPasajero/>} />
                    <Route path="/MisViajes" element={<MisViajes/>} />
                    <Route path="/IniciarSesion" element={<IniciarSesion/>} />
                </Routes>
          </div>
      </BrowserRouter>
  );
}

export default App
