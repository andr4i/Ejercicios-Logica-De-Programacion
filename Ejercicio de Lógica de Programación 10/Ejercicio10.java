import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) throws Exception{
        // Se declara el diccionario con un mapa hash
        Map<String,String> dictionary = new HashMap<String,String>();
        // Agregamos 20 palabras al diccionario
        dictionary.put("alma", "soul");
        dictionary.put("familia", "family");
        dictionary.put("disminuir", "abate");
        dictionary.put("abdicar", "abdicate");
        dictionary.put("aberración", "aberration");
        dictionary.put("abstenerse", "abstain");
        dictionary.put("estético", "aesthetic");
        dictionary.put("exuberante", "boisterous");
        dictionary.put("divergente", "divergent");
        dictionary.put("empatía", "empathy");
        dictionary.put("evanescente", "evanescent");
        dictionary.put("fortuito", "fortuitous");
        dictionary.put("inevitable", "inevitable");
        dictionary.put("orador", "orator");
        dictionary.put("pérfido", "perfidious");
        dictionary.put("pragmático", "pragmatic");
        dictionary.put("prosperidad", "prosperity");
        dictionary.put("contenido", "restrained");
        dictionary.put("venerable", "venerable");
        dictionary.put("fugaz", "transient");
        // Declaramos un buffer reader para leer la entrada desde la consola
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        // creamos una lista con las keys de el diccionario
        ArrayList<String> lista = new ArrayList<String>(dictionary.keySet());

        int contadorAciertos = 0;
        for(int i = 0; i < 5; i++) {
            // Generar un índice aleatorio
            Random random = new Random();
            int randomIndex = random.nextInt(lista.size());
            // Obtener una llave de la lista
            String randomWord = lista.get(randomIndex);
            // Pedir al usuario el significado de la llave
            System.out.println("Sabes cual es la traducción al ingles de : "+randomWord);
            String numbersW = bfn.readLine();
            // Comparar su respuesta con el diccionario
            if(numbersW.equals(dictionary.get(randomWord))){
                System.out.println("Acertaste");
                contadorAciertos += 1;
            }
        }
        // Se le informa al usuario el numero de aciertos
        System.out.println("Acertaste "+contadorAciertos+" de 5 palabras.");
    }
}


