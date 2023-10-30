import java.io.*;

public class Ejercicio6 {
    public static void main(String[] args) throws Exception {

        System.out.println("Ingresa una palabra o frase");
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String line = bfn.readLine();
        String reverseline = "";
        char actual;
        for(int i = 0; i < line.length(); i++) {
            actual = line.charAt(i);
            reverseline = actual+reverseline;
        }
        System.out.println(reverseline);

    }

}
