package class1;

public class ClassStart3 {

    public static void main(String[] args) {

        Student[] students = new Student[2];

        Student student1 = new Student();
        students[0] = student1;
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        students[1] = student2;
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        for (Student student : students) {
            System.out.println(student);
            System.out.println("이름 : " + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);
        }
    }
}
