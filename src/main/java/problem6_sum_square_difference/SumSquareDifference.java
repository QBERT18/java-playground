package problem6_sum_square_difference;

public class SumSquareDifference {
    public static int difference() {
        int sumOfSquers = 0;
        int sumSquers = 0;
        for(int i = 1; i <= 100; i++) {
            sumOfSquers += square(i);
            sumSquers += i;
        }
        sumSquers = square(sumSquers);
        return sumSquers - sumOfSquers;
    }
    public static int square(int number) {
        return number*number;
    }
}
