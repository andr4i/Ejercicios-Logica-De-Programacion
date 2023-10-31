import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio9 {
    public static void main(String[] args) throws Exception{
        Map<String,String> dictionary = new HashMap<String,String>();
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

        
        System.out.println("Ingresa una palabra:");
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String numbersW = bfn.readLine();
        if(dictionary.containsKey(numbersW)){
            System.out.println(dictionary.get(numbersW));
        }
        else{
            System.out.println("La palabra no se encuentra en el diccionario");
        }
    }
}
