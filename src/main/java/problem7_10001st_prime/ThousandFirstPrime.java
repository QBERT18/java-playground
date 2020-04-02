package problem7_10001st_prime;

import java.util.ArrayList;

public class ThousandFirstPrime {
    public static Object thousandFirstPrime(ArrayList<Integer> primes, int searchedPosition) {
        Object result = 0;
        for(int i = 0; i <= 150000; i++) {
            if(isPrime(i))
                primes.add(i);
        }
        for(int i = 0; i < primes.toArray().length; i++) {
            if(i + 1 == searchedPosition) {
                result = primes.toArray()[i];
            }
        }
        return result;
    }
    private static boolean isPrime(int num) {
        boolean result = false;
        int divisor = 0;
        int counter = 0;
        if(num != 0 && num != 1) {
           divisor = num;
           while(divisor >= 1) {
               if(num % divisor == 0)
                   counter++;
                    if(counter > 2) {
                        result = false;
                        break;
                    }
                    else {
                        result = true;
                    }
               divisor--;
           }
        }
        return result;
    }
}
