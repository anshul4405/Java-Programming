class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void showDetails() {
        display();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class InheritanceExample {

    public static void main(String[] args) {

        Developer developer =
                new Developer("Rohit", 45000, "Java");

        developer.showDetails();
    }
}
