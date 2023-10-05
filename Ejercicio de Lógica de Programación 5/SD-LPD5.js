// Funcion de numero secreto 

const numeresecreto = () =>{
    condicion = true;
    while (condicion) {
        let numero = prompt("Ingresa un numero:");
        let secreto = 32;
        if(!isNaN(Number(numero))){
            if(numero==secreto){
                let infodiv = document.querySelector(".resultado");
                infodiv.innerHTML = "";
                let p = document.createElement("p");
                p.textContent = "El numero "+numero+" es el numero secreto";
                infodiv.append(p);
                condicion = false;
            }
            else if(numero!==secreto){
                if(numero>secreto){
                    alert(numero+" no es el numero secreto, de hecho es mayor");
                }
                if(numero<secreto){
                    alert(numero+" no es el numero secreto, de hecho es menor");
                }
            }
        }
    }
}
