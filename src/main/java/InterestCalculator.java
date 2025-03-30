public class InterestCalculator {
    
    // Method to calculate Simple Interest
    public static double simpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    // Method to calculate Compound Interest
    public static double compoundInterest(double principal, double rate, double time, int n) {
        return principal * Math.pow((1 + rate / (100 * n)), n * time) - principal;
    }
}
