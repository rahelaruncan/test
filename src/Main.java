public class Main {
    public static void main(String[] args) {
//
//        System.out.println("Hello \nRahela");
//        System.out.println("2 + 3 =" + " " + (2 + 3));
//        System.out.println("2 / 3 =" + " " + (2.0 / 3.0));
//
//        System.out.println("-5 + 8 * 6=" + " " + (-5 + 8 * 6));
//        System.out.println("(55+9) % 9 =" + " " + ((55 + 9) % 9));
//        System.out.println("20 + -3*5 / 8  =" + " " + (20 + (-3 * 5) / 8));
//        System.out.println(" 5 + 15 / 3 * 2 - 8 % 3  =" + " " + (5 + 15 / 3 * 2 - 8 % 3));
//
//        LogicalOperators op = new LogicalOperators();
//        Scanner scan = new Scanner(System.in);
//        Scanner scan1 = new Scanner(System.in);
//
//
//        System.out.print("Numar a:");
//        int numberA = scan.nextInt();
//        System.out.print("Numar b:");
//        int numberB = scan.nextInt();
//        System.out.print("Numar c:");
//        int numberC = scan.nextInt();
//
//        System.out.println("Numarul mai mare este: " + op.CompareNumbers(numberA, numberB, numberC));
//
//        System.out.print("Varsta:");
//        int varsta = scan1.nextInt();
//        op.isEligibleToVote(varsta);
//        Calculator calcCelsius = new Calculator();
//
//        System.out.println(restulImpartirii(5, 4));
//        System.out.println(distantaInMetrii(40));
//        afiseazaViteza();

//        calcCelsius.checkStringInArray("are");
//        calcCelsius.fibonaciSeries(10);
//        calcCelsius.CozaLozaWoza();
//        System.out.println("Temperatura in grade C este = " + calcCelsius.CalculCelsius(100));
//
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(15);
//        list.add(12);
//        list.add(31);
//        list.add(4);
//        list.add(7);
//        list.add(34);
//        list.add(198);
//        list.add(3);
//        list.add(2);
//        list.add(10);
//        list.add(0);
//        System.out.println(list);

        LogicalOperators op = new LogicalOperators();
//        op.maxNumber(list);
//        op.numaratoarePanaLaOSuta(50);
//        op.numaratoarePanaLaOSuta(500);
//        op.numaratoarePanaLaMinusOSuta(-550);
//        op.numaratoarePanaLaMinusOSuta(-50);
//        op.numaratoareDelaPanaLa(12, 7);
//        op.numaratoareDelaPanaLa(12, 7);
//        op.numereImpare(1, 20);
//        op.numerePare(1, 100);
//        op.numaratoarePanaLaOSutaWhile(20);
//        op.numaratoareDelaPanaLaWhile(1, 100);
//        op.numerePare(1, 100);
//        op.numerePare(1, 100);


    }

    public static int restulImpartirii(int a, int b) {
        return a % b;
    }

    public static float distantaInMetrii(int inch) {
        float result = inch / 39.37f;
        return result;
    }

    public static void afiseazaViteza() {
        int metri = 5000;
        int ore = 1;
        int minute = 30;
        int secunde = 60;
        int timpTotalInSecunde = secunde + (minute * 60) + (ore * 360);
        double vitezaInMetriPerSecunda = metri / timpTotalInSecunde;
        double vitezaInKMperH = vitezaInMetriPerSecunda * 3.6;
        double vitezaInMph = vitezaInKMperH * 0.621371;
        System.out.println(vitezaInMetriPerSecunda);
        System.out.println(vitezaInKMperH);
        System.out.println(vitezaInMph);

    }

}
