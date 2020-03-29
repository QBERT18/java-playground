package schoolException;

public class SchoolException {
    public static void main(String[] args) {
        System.out.println(halbiere(10));
    }

    public static int halbiere(int zahl) {
        if(zahl % 2 == 0) {
            return zahl / 2;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
