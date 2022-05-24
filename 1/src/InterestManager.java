package chapter6;

public class InterestManager {
    public InterestManager() {
    }

    public static void main(String[] args) {
        InterestManager im = new InterestManager();

        for(int day = 1; day <= 365; ++day) {
            double amount = im.calculateAmount(day, 1000000L);
            System.out.println("day = " + day + "amount = " + amount);
        }

    }

    public double getInterestRate(int day) {
        if (day <= 90) {
            return 0.5D;
        } else if (day >= 91 && day <= 180) {
            return 1.0D;
        } else {
            return day >= 181 && day <= 364 ? 2.0D : 5.6D;
        }
    }

    public double calculateAmount(int day, long amount) {
        double interest = this.getInterestRate(day);
        double interestAmount = (double)amount * (interest / 100.0D);
        double totalAmount = (double)amount + interestAmount;
        return totalAmount;
    }
}
