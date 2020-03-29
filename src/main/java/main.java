import problem5_smallest_multiple.SmallestMultiple;

public class main {
    public static void main(String[] args) {
        SmallestMultiple smallestMultipleClass = new SmallestMultiple();
        int smallestmultiple = smallestMultipleClass.getSmallestMultiple();
        System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is " + smallestmultiple);
    }
}
