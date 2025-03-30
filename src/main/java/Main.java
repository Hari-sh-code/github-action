import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Principal Amount: ");
            double principal = scanner.nextDouble();

            System.out.print("Enter Rate of Interest (% per year): ");
            double rate = scanner.nextDouble();

            System.out.print("Enter Time (years): ");
            double time = scanner.nextDouble();

            System.out.print("Enter Compounding Frequency (e.g., 1 for yearly, 4 for quarterly): ");
            int n = scanner.nextInt();

            // Call InterestCalculator methods
            double simpleInterest = InterestCalculator.simpleInterest(principal, rate, time);
            double compoundInterest = InterestCalculator.compoundInterest(principal, rate, time, n);

            System.out.println("\nSimple Interest: " + simpleInterest);
            System.out.println("Compound Interest: " + compoundInterest);
        }
    }
}
