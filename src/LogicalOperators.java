import java.util.List;

public class LogicalOperators {

    public int CompareNumbers(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public void isEligibleToVote(int varsta) {
        if (varsta >= 18) {
            System.out.println("AI DREPT DE VOT DAR ORICUM NU PREA CONTEAZA LA NOI IN TARA!");
        } else {
            System.out.println("Nu ai drept de vot, ne pare rau!");
        }

    }

    public void maxNumber(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println(max);
    }


//    Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
//    Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
//    pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
//    deoarece metoda afiseaza, nu returneaza.

    public void numaratoarePanaLaOSuta(int number) {
        if (number < 100) {
            for (int i = number; i <= 100; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("numarul trebuie sa fie <100");
        }
    }

    //   2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    //   Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana
    //   la -100, pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
    //   deoarece metoda afiseaza, nu returneaza.


    public void numaratoarePanaLaMinusOSuta(int number) {
        if (number > -100) {
            for (int i = number; i >= -100; i--) {
                System.out.println(i);
            }
        } else {
            System.out.println("numarul trebuie sa fie >-100");
        }
    }

    // . Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o
    // numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru
    // iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).


    public void numaratoareDelaPanaLa(int numberOne, int numberTwo) {
        if (numberOne > numberTwo) {
            for (int i = numberTwo; i <= numberOne; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = numberOne; i <= numberTwo; i++) {
                System.out.println(i);
            }
        }
    }

    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
//6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void numerePare(int numberOne, int numberTwo) {
        if (numberOne > numberTwo) {
            for (int i = numberTwo; i <= numberOne; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = numberOne; i <= numberTwo; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    public void numereImpare(int numberOne, int numberTwo) {
        if (numberOne > numberTwo) {
            for (int i = numberTwo; i <= numberOne; i++) {
                if (!(i % 2 == 0)) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = numberOne; i <= numberTwo; i++) {
                if (!(i % 2 == 0)) {
                    System.out.println(i);
                }
            }
        }
    }

    //   1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
    //   Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100,
    //   pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
    //   deoarece metoda afiseaza, nu returneaza.

    public void numaratoarePanaLaOSutaWhile(int number) {
        if (number < 100) {
            int i = number;
            while (i <= 100) {
                System.out.println(i);
                i++;
            }
        } else {
            System.out.println("numarul trebuie sa fie <100");
        }
    }

    //    Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    //    Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute
    //    o numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul
    //    parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,
    //    atunci numaratoarea sa fie de la y la x).
    public void numaratoareDelaPanaLaWhile(int numberOne, int numberTwo) {
        if (numberOne > numberTwo) {
            int i = numberTwo;
            while (i <= numberOne) {
                System.out.println(i);
                i++;
            }
        } else {
            int i = numberOne;
            while (i <= numberTwo) {
                System.out.println(i);
                i++;
            }
        }
    }
}
