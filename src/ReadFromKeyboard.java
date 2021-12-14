import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromKeyboard {
    public int getInt() {
        Scanner scanner = new Scanner(System.in);
        boolean condition = false;
        int x = 0;
        do {
            try {
                 x = scanner.nextInt();
                condition = true;
            } catch (InputMismatchException e) {
                System.out.println("valoare introdusa este:" + scanner.nextLine());
                System.err.println("IncorectValue");
            }
        }
        while (!condition);
        return x;
    }
}
