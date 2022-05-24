package chapter6;

public class InterestManager {

    public static void main(String[] args) {
        InterestManager im = new InterestManager();
        for(int day = 1; day<=365;day++){
            double amount = im.calculateAmount(day, 1000000);
            System.out.println("day = " + day+"amount = "+ amount);
        }

    }


    public double getInterestRate(int day) {
        double interest;
        if(day<=90) {
            interest=0.5;
        } else if(day>90 && day <=180) {
            interest=1;
        } else if(day>180 && day< 365) {
            interest=2;
        } else {
            interest=5.6;
        }
        return interest;
    }

    public double calculateAmount(int day,long amount){
        double totalAmount;
        double interest = getInterestRate(day);
        double interestAmount = amount * (interest /100.0);
        totalAmount = amount + interestAmount;
        return totalAmount;

    }
}
