import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private String course;

    public Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    public String getName() { return name; }
    public int getRollNo() { return rollNo; }
    public String getCourse() { return course; }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Course: " + course);
    }
}

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll Number: ");
                    int rollNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    students.add(new Student(name, rollNo, course));
                    System.out.println("✅ Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("\nList of Students:");
                        for (Student s : students) {
                            s.displayInfo();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
