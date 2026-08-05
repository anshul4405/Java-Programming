import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Aman");
        students.add("Rohit");
        students.add("Neha");
        students.add("Karan");

        System.out.println("Student List:");

        for (String name : students) {
            System.out.println(name);
        }

        students.remove("Rohit");

        System.out.println("\nAfter removing Rohit:");

        for (String name : students) {
            System.out.println(name);
        }

        System.out.println("\nTotal Students: " + students.size());

        if (students.contains("Aman")) {
            System.out.println("Aman is present in the list");
        }
    }
}
