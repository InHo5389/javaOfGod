public class ManageStudent {

    public static void main(String[] args) {
        Student[] student = null;
        ManageStudent manageStudent = new ManageStudent();
        student = manageStudent.addStudent();
        manageStudent.printStudents(student);

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
}
