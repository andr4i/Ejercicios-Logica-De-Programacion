//Funcino que recibe un numero, calcula su factorial y modifica el dom.

const factorial = () => {
    let numero = prompt("Ingresa un numero:");
    if(!isNaN(Number(numero))){
        let factorial = 1;
        for(let i = 1;i<=numero;i++){ 
            factorial *= i;
        }
        let infodiv = document.querySelector(".resultado");
        let p = document.createElement("p");
        p.textContent = "El numero "+numero+" tiene el factorial de "+factorial;
        infodiv.append(p);
    }
    else{
        alert("Error, eso no es un número");
        convertirTemperatura();
    }
}
