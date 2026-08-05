public class Student {

    String name;
    int rollNo;
    double marks;

    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 101, 82.5);
        Student s2 = new Student("Aman", 102, 76.0);

        s1.displayDetails();
        System.out.println();
        s2.displayDetails();
    }
}
