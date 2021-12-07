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
    public void  isEligibleToVote(int varsta) {
        if (varsta>=18 ) {
            System.out.println("AI DREPT DE VOT DAR ORICUM NU PREA CONTEAZA LA NOI IN TARA!");
        } else {
            System.out.println("Nu ai drept de vot, ne pare rau!");
        }

    }
}
