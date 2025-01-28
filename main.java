Here’s a simple Java program that demonstrates a Student class. This class includes attributes like the student's name, ID, age, and grade, along with methods to display and manipulate student details.

// Define the Student class
class Student {
    // Attributes of a student
    private String name;
    private int id;
    private int age;
    private double grade;

    // Constructor to initialize a student object
    public Student(String name, int id, int age, double grade) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.grade = grade;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

// Main class to demonstrate the Student class
public class StudentDemo {
    public static void main(String[] args) {
        // Create a new student object
        Student student = new Student("Alice", 101, 20, 85.5);

        // Display student details
        student.displayDetails();

        // Update student details
        student.setAge(21);
        student.setGrade(90.0);

        // Display updated details
        System.out.println("\nUpdated Details:");
        student.displayDetails();
    }
}

Output:

Student Details:
Name: Alice
ID: 101
Age: 20
Grade: 85.5

Updated Details:
Student Details:
Name: Alice
ID: 101
Age: 21
Grade: 90.0

Would you like additional features added, such as a list of students or operations like sorting or searching?

