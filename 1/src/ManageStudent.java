public class ManageStudent {

    public static void main(String[] args) {
       // Student[] student = null;
       // ManageStudent manageStudent = new ManageStudent();
       // student = manageStudent.addStudent();
       // manageStudent.printStudents(student);
        ManageStudent manageStudent = new ManageStudent();
        manageStudent.checkEquals();

    }

    public Student[] addStudent(){
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Soon","seoul","010xxxxxxxx","qh@naver.com");
        return student;
    }

    public void printStudents(Student[] student){
        for (int num = 0; num < student.length;num++){
            System.out.println(student[num].toString());
        }
    }

    public void checkEquals(){
        Student student1 = new Student("Min","Seoul","010XXXXXXXX","xx@naver.com");
        Student student2 = new Student("Min","Seoul","010XXXXXXXX","xx@naver.com");
        if(student1.equals(student2)){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
    }
}
