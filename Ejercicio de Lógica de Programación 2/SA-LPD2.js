// Ejercicio 2
const convertirTemperatura = () =>{
    let celcius = prompt("Ingresa la temperatura en grados:");
    if(!isNaN(Number(celcius))){ // Si lo que se leyo en el prompt no es un Nan(not a number)
        let number = Number(celcius);
        let fahrenheit = number*1.8 + 32; // Reliza los calculos
        let kelvin = number + 273.15;
        let infodiv = document.querySelector(".cambios"); //Selecciona la clase cambios de mi html
        let p = document.createElement("p");    // Se crea un elemento p
        p.textContent = "La temperatura en Fahrenheit es: "+fahrenheit;    // Se Agregan los datos a nuestor elemento p
        p.textContent += "\nLa temperatura en Kelvin es: "+kelvin;  
        infodiv.append(p);  //  Se añade a nuestro DOM
    }
    else{
        let infodiv = document.querySelector(".cambios");
        let p = document.createElement("p");
        p.textContent = "Ingrese un numero adeacuado";
        infodiv.append(p)
    }
}