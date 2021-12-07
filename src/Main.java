import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello \nRahela");
        System.out.println("2 + 3 =" + " " +(2 + 3));
        System.out.println("2 / 3 =" + " " +(2.0 / 3.0));

        System.out.println("-5 + 8 * 6=" + " " +(-5 + 8 * 6));
        System.out.println("(55+9) % 9 =" + " " +((55+9) % 9 ));
        System.out.println("20 + -3*5 / 8  =" + " " +(20 + (-3*5 )/ 8 ));
        System.out.println(" 5 + 15 / 3 * 2 - 8 % 3  =" + " " +( 5 + 15 / 3 * 2 - 8 % 3 ));

        LogicalOperators op = new LogicalOperators();
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);

        System.out.print("Numar a:");
        int numberA = scan.nextInt();
        System.out.print("Numar b:");
        int numberB = scan.nextInt();
        System.out.print("Numar c:");
        int numberC = scan.nextInt();

        System.out.println("Numarul mai mare este: " + op.CompareNumbers(numberA, numberB, numberC));

        System.out.print("Varsta:");
        int varsta = scan1.nextInt();
        op.isEligibleToVote(varsta);

        Calculator calcCelsius = new Calculator();

        System.out.println("Temperatura in grade C este = " + calcCelsius.CalculCelsius(100));
    }
/*

    }*/
}
