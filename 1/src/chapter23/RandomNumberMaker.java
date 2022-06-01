package chapter23;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {

    public static void main(String[] args) {

        RandomNumberMaker numberMaker = new RandomNumberMaker();
        numberMaker.makeRandomNumbers(10);

    }

    public HashSet<Integer> getSixNumber(){
        HashSet<Integer> set1 = new HashSet<>();
        while (true){
            Random random = new Random();
            int randomNum = random.nextInt(44)+1;
            set1.add(randomNum);

            if (set1.size()==6){
                break;
            }
        }
        return set1;
    }

    public void makeRandomNumbers(int count){
        for (int loop = 0;loop<count;loop++){
            HashSet<Integer> set = getSixNumber();
            System.out.println(set);
        }
    }
}
