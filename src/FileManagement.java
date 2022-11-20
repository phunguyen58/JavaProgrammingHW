import java.io.*;
import java.util.Scanner;

public class FileManagement {
    public void CountNumOfLines(String inputFileName){
        int count = 0;

        try {
            // create a new file object
            File file = new File(inputFileName);

            // create an object of Scanner
            // associated with the file
            Scanner sc = new Scanner(file);

            // read each line and
            // count number of lines
            while(sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }
            System.out.println("Total Number of Lines: " + count);

            // close scanner
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void CountNumOfWords(String inputFileName) {
        try{
            // create a new file object
            File file = new File(inputFileName);

            // create an object of Scanner
            // associated with the file
            Scanner sc = new Scanner(file);
            int count=0;
            while(sc.hasNext()){
                sc.next();
                count++;
            }
            System.out.println("Number of words: " + count);
        } catch (Exception e){
            System.out.println(e);
        }

    }

    public static void main(String []args){
        FileManagement thisObj = new FileManagement();
        thisObj.CountNumOfLines("input.txt");
        thisObj.CountNumOfWords("input.txt");
    }


}
