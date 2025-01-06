import { useState } from "react";




const IniciarSesion = () =>{

    const [email,setEmail]=useState("");
    const [password,setPassword]=useState("");


   
    const handleSubmit = (e) =>{
        e.preventDefault();
        console.log(email);
        console.log(password);
    }



    return(
    <form onSubmit={handleSubmit}>
        <h2>Iniciar Sesion</h2>
        <div>
            <label htmlFor="email">Correo</label>
            <input type="email" id="email" value={email} onChange={(e)=>setEmail(e.target.value)}/>
        </div>
        <div>
            <label htmlFor="contraseña">contraseña</label>
            <input type="password" id="contraseña" value={password} onChange={(e)=>setPassword(e.target.value)}/>
        </div>
        <button type="submit">Iniciar Sesion</button>
    </form>)
}


export default IniciarSesion;