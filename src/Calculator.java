public class Calculator {
    public double CalculCelsius(int fahrenheit) {
        double result = (5.0 / 9.0) * (fahrenheit - 32);
        return result;
    }

    public void twoLoops(int number) {
        for (int j = 1; j <= 7; j++)
            for (int i = 1; i <= 7; i--) {
                System.out.println("*");
            }
    }

    public void fibonaciSeries(int n) {
        int i = 1;
        int j = 0;
        int a = 1;
        while (a <= 20) {
            int z = i + j;
            j = i;
            i = z;
            System.out.println(z);
            a++;
        }
    }

    public void CozaLozaWoza() {
        int i = 1;
        while (i <= 100) {
            if (i % 3 == 0) {
                System.out.print(" Coza ");
            } else if (i % 5 == 0) {
                System.out.print(" Loza ");
            } else if (i % 7 == 0) {
                System.out.print(" Woza ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" CozaLoza ");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print(" CozaWoza ");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print(" WozaLoza ");
            } else if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print(" CozaLozaWoza ");
            } else {
                System.out.print(" " + i + " ");
            }
            i++;
            if (i % 11 == 0) {
                System.out.println("");
            }
        }
    }

    public void checkStringInArray(String text) {
        String[] array = {"ana", "are", "mere"};

        for (int i = 0; i < array.length; i++)
            if (array[i] == text) {
                System.out.println("Array-ul contine textul: " + text);
            }
    }


}
