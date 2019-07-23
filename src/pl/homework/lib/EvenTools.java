package pl.homework.lib;

public class EvenTools {
    private int startRange;
    private int endRange;

    public EvenTools() {
        startRange = 0;
        endRange = 100;
    }

    public void getEvens() {
        int sum =0;
        for (int i = startRange; i<= endRange; i++) {
            if (i%2 == 0) {
                sum += i;
                System.out.printf("%d ", i);
            }
        }
        System.out.println("\nSuma liczb parzystych z zakresu: [" + startRange + ", " + endRange + "] wynosi " + sum );
    }
}
