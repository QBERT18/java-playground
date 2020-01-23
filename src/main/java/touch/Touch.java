package touch;

import java.io.File;
import java.io.IOException;

public class Touch {
    public static void main(String[] args) {
        //createFile1();
        createFile2();
    }

    public static void createFile1() {
        File meinFileObj = new File("C:\\Users\\vmu\\Desktop\\Text.txt");
        try {
            if(meinFileObj.createNewFile()) {
                System.out.println("File Created: " + meinFileObj.getName());
            } else {
                System.out.println("File " + meinFileObj.getName() + " existiert schon");
            }
        } catch(IOException ioEx) {
            ioEx.printStackTrace();
        }
    }

    public static void createFile2() {
        File meinFile = new File("C:\\Users\\vmu\\Desktop\\Text.txt");
        try {
            if(meinFile.exists()) {
                System.out.print("File " + meinFile.getName() + " existiert schon");
            } else {
                meinFile.createNewFile();
            }
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
        }
    }
}
