package chapter25;

public class TimerMain {

    public static void main(String[] args) {

        TimerThread tt = new TimerThread();
        tt.start();
    }
}
