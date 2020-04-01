package problem7_10001st_prime;

import java.util.ArrayList;
import java.util.HashMap;

public class ThousandFirstPrime {
    public static void thousandFirstPrime(ArrayList<Integer> primes) {
        for(int i = 2; i < 1000; i++) {
            if (isPrime(i))
                primes.add(i);
        }
        for(int i = 0; i < primes.size(); i++) {
            if(i == 154) {
                System.out.println(String.format("Die Zahl %s; Sein Index: %s; Und ist die %s. Zahl", primes.get(i), primes.indexOf(i), primes.indexOf(i) + 1));
            }
        }
    }
    public static Boolean isPrime(int number) {
        int counter = 0;
        boolean result = true;
        for(int i = number; i >= 1; i--) {
            if(number % i == 0) {
              counter++;
            }
            if(counter > 2) {
                result = false;
                break;
            }
        }
        return result;
    }
}
