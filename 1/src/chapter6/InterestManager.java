package chapter6;

public class InterestManager {

    public static void main(String[] args) {
        InterestManager im = new InterestManager();
        for(int day = 1; day<=365;day++){
            double amount = im.calculateAmount(day, 1000000);
            System.out.println("day = " + day+"amount = "+ amount);
        }

    }

    public double getInterestRate(int day){
        if (day <= 90){
            return 0.5;
        }else if(day >= 91 && day <= 180){
            return 1;
        }else if(day >= 181 && day <= 364){
            return 2;
        }else{
            return 5.6;
        }
    }

    public double calculateAmount(int day,long amount){
        double totalAmount;
        double interest = getInterestRate(day);
        double interestAmount = amount * (interest /100.0);
        totalAmount = amount + interestAmount;
        return totalAmount;

    }
}
