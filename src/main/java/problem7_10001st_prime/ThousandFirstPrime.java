package problem7_10001st_prime;

import utils.CustomUtils;

import java.util.ArrayList;

public class ThousandFirstPrime {
    public static Object thousandFirstPrime(ArrayList<Integer> primes, int searchedPosition) {
        Object result = 0;
        for(int i = 0; i <= 150000; i++) {
            if(CustomUtils.isPrime(i))
                primes.add(i);
        }
        for(int i = 0; i < primes.toArray().length; i++) {
            if(i + 1 == searchedPosition) {
                result = primes.toArray()[i];
            }
        }
        return result;
    }
}
