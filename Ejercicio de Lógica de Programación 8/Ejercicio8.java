import java.io.*;
import java.util.ArrayList;

public class Ejercicio8 {

    public static boolean isPrime(int n) {
        if (n <= 1)
        return false;
 
        // Check from 2 to square root of n
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
    
        return true;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Ingresa un diez numeros seguidos de una coma");
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String numbersW = bfn.readLine();
        String numbers[] = numbersW.split(", ");
        ArrayList<String> primes = new ArrayList<String>();
        ArrayList<String> peaks = new ArrayList<String>();
        for(String number:numbers){
            if(isPrime(Integer.parseInt(number))){
                primes.add(number);
            }
            else{
                peaks.add(number);
            }
        }
        primes.addAll(peaks);
        for(String number:numbers){
            System.out.println("pos["+number.indexOf(number)+"] = "+number);
        }
        System.out.println("\n");
        for(String prime:primes){
            System.out.println("pos["+primes.indexOf(prime)+"] = "+prime);
        }
    }
}
