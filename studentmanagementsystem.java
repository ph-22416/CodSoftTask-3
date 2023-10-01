import java.util.ArrayList;
import java.util.Scanner;

public class studentmanagementsystem {

    private ArrayList<student> students = new ArrayList<>();

    public void addStudent(student student) {
        students.add(student);
    }

    public void displayAllStudents() {
        for (student student : students) {
            System.out.println(student);
        }
    }

    public student searchStudent(String rollNo) {
        for (student student : students) {
            if (student.getRollNo().equals(rollNo)) {
                return student;
            }
        }
        return null;
    }

    public void deleteStudent(String rollNo) {
        student student = searchStudent(rollNo);
        if (student != null) {
            students.remove(student);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void main(String[] args) {
        studentmanagementsystem sms = new studentmanagementsystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter RollNo, Name, Course:");
                    String rollNo = scanner.nextLine();
                    String name = scanner.nextLine();
                    String course = scanner.nextLine();
                    sms.addStudent(new student(rollNo, name, course));
                    break;

                case 2:
                    sms.displayAllStudents();
                    break;

                case 3:
                    System.out.println("Enter RollNo to search:");
                    rollNo = scanner.nextLine();
                    student s = sms.searchstudent(rollNo);
                    if (s != null) {
                        System.out.println(s);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Enter RollNo to delete:");
                    rollNo = scanner.nextLine();
                    sms.deleteStudent(rollNo);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private student searchstudent(String rollNo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
