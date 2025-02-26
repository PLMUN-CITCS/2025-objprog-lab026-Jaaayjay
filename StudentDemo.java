class Student{
    private String name;
    private int id;
    private double gpa;

    public static int studentCount = 0;

    public Student(String name, int id, double gpa){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        studentCount++;
    }
    public void displayStudentInfo(){
        System.out.println("Student ID: "+ id + ", Name: " + name + ", GPA: "+ gpa);
    }
    public static void displayStudentCount(){
        System.out.println("total students: " + studentCount);
    }
}

public class StudentDemo{
    public static void main(String[] args) {
        Student student1 = new Student("alice",101,3.8);
        Student student2 = new Student("bob",102,3.5);
        Student student3 = new Student("charlie",103,3.9);
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
        Student.displayStudentCount();
    }
}
