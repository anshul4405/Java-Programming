import java.util.ArrayList;
import java.util.Scanner;

class StudentRecord {

    int rollNo;
    String name;
    double marks;

    StudentRecord(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(rollNo + " | " + name + " | " + marks);
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<StudentRecord> students = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter roll number: ");
                int roll = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter marks: ");
                double marks = sc.nextDouble();

                students.add(new StudentRecord(roll, name, marks));

                System.out.println("Student added");

            } else if (choice == 2) {

                if (students.isEmpty()) {

                    System.out.println("No students found");

                } else {

                    System.out.println("\nRoll | Name | Marks");

                    for (StudentRecord student : students) {
                        student.display();
                    }
                }

            } else if (choice == 3) {

                System.out.print("Enter roll number: ");
                int roll = sc.nextInt();

                boolean found = false;

                for (StudentRecord student : students) {

                    if (student.rollNo == roll) {
                        student.display();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found");
                }
            }

        } while (choice != 4);

        System.out.println("Program closed");

        sc.close();
    }
}
