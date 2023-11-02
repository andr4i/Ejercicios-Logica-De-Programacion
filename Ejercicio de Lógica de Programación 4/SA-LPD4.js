// Funcion que regrese un numero de elementos de la serie fibonacci
// Los datos se reciben por un prompt y se despliegan modificando el DOM

const fibonacci = () => {
    let numero = prompt("Ingresa un numero:");
    if(!isNaN(Number(numero))){
        if(numero==1){ // En caso de que el numero sea 1
            let infodiv = document.querySelector(".resultado");
            infodiv.innerHTML = "";
            let p = document.createElement("p");
            p.textContent = "El numero "+numero+" tiene la serie de Fibonacci: 0";
            infodiv.append(p);
        }
        if(numero==2){  // En caso de que el numero sea 2
            let infodiv = document.querySelector(".resultado");
            infodiv.innerHTML = "";
            let p = document.createElement("p");
            p.textContent = "El numero "+numero+" tiene la serie de Fibonacci: \n0,1";
            infodiv.append(p);
        }
        if(numero>2){   // Para el resto de casos positivos
            let arregloFibonacci = [0,1];
            let infodiv = document.querySelector(".resultado");
            infodiv.innerHTML = "";
            let p = document.createElement("p");
            p.textContent = "El numero "+numero+" tiene la serie de Fibonacci:";
            infodiv.append(p);
            let numero1 = arregloFibonacci[0];
            let numero2 = arregloFibonacci[1];
            for(let i = 1;i<=numero-2;i++){
                let suma = numero1 + numero2;
                numero1 = numero2;
                numero2 = suma;
                arregloFibonacci.push(suma);
            }
            p = document.createElement("p");
            p.textContent = String(arregloFibonacci);
            infodiv.append(p);
        }
        if(numero<=0){
            let infodiv = document.querySelector(".resultado");
            infodiv.innerHTML = "";
            let p = document.createElement("p");
            p.textContent = "Ingrese un numero mayor a 0";
            infodiv.append(p);
        }
    }
    else{
        alert("Error, eso no es un número");
        convertirTemperatura();
    }

}