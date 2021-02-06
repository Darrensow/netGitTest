import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new FileInputStream("Files\\data.txt"));
            while (input.hasNextLine()) {
                String str = input.nextLine();
                System.out.println(str);
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
        System.out.println("Testing");

        System.out.println();
        System.out.println();
    }

    public static boolean test(){
        return false;
    }
}