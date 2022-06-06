package chpater30;

public class TypeInference {
    public static void main(String[] args) {
        TypeInference type = new TypeInference();
        type.makeObject();
    }

    public void makeObject(){

        GenericClass<Integer> generic1 = new <String> GenericClass<Integer>("String");
        //GenericClass<Integer> generic1 = new <String> GenericClass<>("String");
        //주석처럼 사용을하면 컴파일러가 혼동을 일으켜 컴파일이 정상적으로 되지않음.
        generic1.setValue(999);
    }
}
