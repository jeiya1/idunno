
import java.util.Scanner;

public class MulTable {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int u = 1; u <= number; u++) {
                System.out.print(i * u + "\t");
            }
            System.out.println();
        }
    }
    
}