package problem10_Summation_of_primes;

import utils.CustomUtils;

public class SummationOfPrimes {
    public static long getSummationOfPrimes() {
        long sum = 0;
        for(int i = 1296826; i <= 2000000; i++) {
            if (i != 0 && i != 1)
                if (CustomUtils.isPrime(i))
                    sum += i;
        }
        return sum;
    }
}
