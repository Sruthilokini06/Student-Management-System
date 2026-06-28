import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    // Constructor
    public StudentManager() {
        students = new ArrayList<>();
    }

    // Check if Roll Number already exists
    public boolean rollNumberExists(int rollNo) {
        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                return true;
            }
        }
        return false;
    }

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display All Students
    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("\nNo students found.");
            return;
        }

        System.out.println("\n===== STUDENT LIST =====");

        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Search Student
    public void searchStudent(int rollNo) {

        for (Student s : students) {

            if (s.getRollNo() == rollNo) {
                System.out.println("\nStudent Found!");
                System.out.println(s);
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Update Student
    public boolean updateStudent(int rollNo, String name, int age, String department, double marks) {

        for (Student s : students) {

            if (s.getRollNo() == rollNo) {

                s.setName(name);
                s.setAge(age);
                s.setDepartment(department);
                s.setMarks(marks);

                return true;
            }
        }

        return false;
    }

    // Delete Student
    public boolean deleteStudent(int rollNo) {

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getRollNo() == rollNo) {
                students.remove(i);
                return true;
            }
        }

        return false;
    }
}