package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CustomUtils {
    public static boolean isPrime(int num) {
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
    private static void createFile() {
        try {
            File file = new File(".\\calcs.txt");
            if(file.createNewFile()) {
                System.out.println("File created:" + file.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void writeFile(String text) {
        try {
            FileWriter fileWriter = new FileWriter(".\\calcs.txt");
            fileWriter.write(text);
            fileWriter.close();
            System.out.println("Successfully wrote into the file");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
