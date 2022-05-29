package chapter16;

public class MyPage {

    InputBox input;


    public static void main(String[] args) {

        MyPage mp = new MyPage();
        mp.setUI();
        mp.pressKey();
    }

    public void setUI(){
        input = new InputBox(new KeyEventListener() {
            @Override
            public void onKeyDown() {
                System.out.println("KEY DOWN");
            }

            @Override
            public void onKeyUp() {
                System.out.println("KEY UP");
            }
        });
    }

    public void pressKey(){
        input.listenerCalled(InputBox.KEY_DOWN);
        input.listenerCalled(InputBox.KEY_UP);
    }


}
