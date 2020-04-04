package problem9_Special_Pythagorean_triplet;

public class SpecialPythagoreanTriplet {
    public static int getPythagoreanTriple() {
        int result = 0;
        for (int a = 1; a < 1000; a++) {
            for (int b = 2; b < 1000; b++) {
                for (int c = 3; c < 1000; c++) {
                    if (a * a + b * b == c * c)
                        if ((a + b + c) == 1000)
                            result = a * b * c;
                }
            }
        }
        return result;
    }
}
