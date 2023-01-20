package cscc.tkotila;

public class Main {
    public static void main(String[] args) {
        int[] temperatures = {45, 29, 10, 22, 41, 28, 33};
        double[] precipitation = {0.95, 0.6, 0.25, 0.05, 0.0, 0.75, 0.9};
        String[] dayNames = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println("Is is likely to snow on:");

        for (int i = 0; i < 7; i++) {
            if (temperatures[i] < 32 && precipitation[i] >= .5) {
                System.out.printf(dayNames[i]);
                System.out.println();
            }
        }
    }
}