package chapter25;

import java.util.Date;

public class TimerThread extends Thread{


    public void run() {

        printCurrentTime();
    }

    public void printCurrentTime() {
        try {
            long i=0;

            while(i<10) {
                long current = System.currentTimeMillis();
                System.out.println(new Date(current)+" "+current);
                Thread.sleep(1000);
                i++;

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void reduceTimeGap() {
        long currentTime=System.currentTimeMillis();
        long timeMod=currentTime%1000;
        try {
            Thread.sleep(1000-timeMod);
        } catch (Exception e) {

        }
    }
}
