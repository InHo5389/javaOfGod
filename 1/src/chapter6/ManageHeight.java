package chapter6;

public class ManageHeight {

    int gradeHeights[][];

    public static void main(String[] args) {
        ManageHeight mh = new ManageHeight();
        mh.setData();
        for (int classNum = 1;classNum <=5;classNum++){
            //mh.printHeight(classNum);
            mh.printAverage(classNum);
        }

    }

    public void setData(){
        gradeHeights = new int[5][];
        gradeHeights[0]=new int[] {170,180,173,175,177};
        gradeHeights[1]=new int[] {160,165,167,186};
        gradeHeights[2]=new int[] {158,177,187,176};
        gradeHeights[3]=new int[] {173,182,181};
        gradeHeights[4]=new int[] {170,180,165,177,172};
    }

    public void printHeight(int classNum){
            System.out.println("Class No.:"+classNum);
            for(int data : gradeHeights[classNum-1]){
                System.out.println(data);
            }
    }

    public void printAverage(int classNum){
        double result=0;

        System.out.println("Class No.:"+classNum);
        for (int data : gradeHeights[classNum-1]){
            result += data;
        }
        System.out.println("Height average:"+result/gradeHeights[classNum-1].length);
    }


}
