import java.io.*;
import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        String listdays[] = {"lunes", "martes", "miercoles", "jueves", "viernes"};
        ArrayList<String> dias = new ArrayList<String>();
        for(String day :listdays){
            dias.add(day);
        }
        
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String dia = bfn.readLine();
        System.out.println("Ingresa el dia (Lunes-Viernes)");
        dia.toLowerCase();
        System.out.println("Ingresa la hora en formato de 24hrs");
        String hora = bfn.readLine();
        System.out.println("Ingresa los minutos del dia");


        String minutos = bfn.readLine();
        int totalminutos = 0;
        // Calculamos los minutos para que pase una hora
        for(int j = Integer.parseInt(minutos); j < 60; j++){
            totalminutos += 1;
        }
        // Despues calculamos los minutos para que pase un dia
        for(int j = Integer.parseInt(hora)+1; j < 24; j++){
            for(int k = 0; k < 60; k++){
                totalminutos += 1;
            }
        }
        for(int i = dias.indexOf(dia)+1; i <5; i++){
                for(int j = 0; j < 24; j++){
                    for(int k = 0; k < 60; k++){
                        totalminutos += 1;
                    }
                    // Aqui ponemos la condición en catorce porque empezamos en 0
                    if(dias.get(i)=="viernes"&&j==14){
                        System.out.println("Faltan "+totalminutos+" minutos para el fin de semana");
                        break;
                    }
                }
        }
    }
}
