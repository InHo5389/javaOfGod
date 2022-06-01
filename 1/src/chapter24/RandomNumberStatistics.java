package chapter24;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {

    public static void main(String[] args) {
        RandomNumberStatistics rns = new RandomNumberStatistics();
        rns.getRandomNumberStatistics();
    }

    private final int DATA_BOUNDARY = 50;

    private Hashtable<Integer,Integer> hashtable = new Hashtable<>();

    public void getRandomNumberStatistics(){
        Random random = new Random();
        int runCount = DATA_BOUNDARY * 100;

        for (int loop =0;loop<runCount;loop++){
            int tempNum = random.nextInt(DATA_BOUNDARY) + 1;
            putCurrentNumber(tempNum);
        }
        printStatistics();
    }

    public void putCurrentNumber(int tempNumber){
        if (!hashtable.containsKey(tempNumber)){
            hashtable.put(tempNumber,1);
        }else {
            hashtable.put(tempNumber,hashtable.get(tempNumber)+1);
        }
    }

    public void printStatistics(){

        Set<Integer> hashKey = hashtable.keySet();
        for(int key : hashKey){
            System.out.print(key +" = "+hashtable.get(key)+"\t");
            if (key%10-1==0) System.out.println();
        }
    }
}
