import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("====== Student Record System ======");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: searchStudent(); break;
                case 4: deleteStudent(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }

    static void addStudent() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll no: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter branch: ");
        String branch = sc.nextLine();
        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        Student s = new Student(name, rollNo, branch, cgpa);
        students.add(s);
        System.out.println("Student added successfully!\n");
    }

    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.\n");
            return;
        }
        for (Student s : students) {
            s.displayInfo();
        }
    }

    static void searchStudent() {
        System.out.print("Enter roll no to search: ");
        int roll = sc.nextInt();
        boolean found = false;
        for (Student s : students) {
            if (s.getRollNo() == roll) {
                s.displayInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.\n");
        }
    }

    static void deleteStudent() {
        System.out.print("Enter roll no to delete: ");
        int roll = sc.nextInt();
        boolean removed = students.removeIf(s -> s.getRollNo() == roll);
        if (removed) {
            System.out.println("Student deleted successfully.\n");
        } else {
            System.out.println("Student not found.\n");
        }
    }
}
