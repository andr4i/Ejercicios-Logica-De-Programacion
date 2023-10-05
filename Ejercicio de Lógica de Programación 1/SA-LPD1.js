// Comparación de numeros
const comparacionNumeros = () => {
    const numeros = prompt("Ingresa 3 numeros separados por una coma [,]");
    let elements = numeros.split(","); //Dividi la cadena por comas
    let elementsNumbers = elements.map((x)=>Number(x)); //Regrese un arreglo de enteros
    let elementTemp = 0; // Variable para guardar el valor del numero siguiente
    for(let i = 1;i<elementsNumbers.length;i++){    //Aqui use ordenamiento burbuja
        for(let x =0;x<(elementsNumbers.length-i);x++){
            if(elementsNumbers[x]>elementsNumbers[x+1]){
                elementTemp = elementsNumbers[x];
                elementsNumbers[x] = elementsNumbers[x+1];
                elementsNumbers[x+1] = elementTemp;
            }
        }
    }
    let infodiv = document.querySelector(".cambios");
    let p = document.createElement("p");
    p.textContent = "El arreglo ordenado es:\n"+elementsNumbers;
    // p.setAttribute("text","El arreglo ordenado es:\n"+elementsNumbers);
    infodiv.append(p);
    return 1;
}