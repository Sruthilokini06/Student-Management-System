public class Student {

    private int rollNo;
    private String name;
    private int age;
    private String department;
    private double marks;

    // Constructor
    public Student(int rollNo, String name, int age, String department, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.department = department;
        this.marks = marks;
    }

    // Getters
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public double getMarks() {
        return marks;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Grade Calculation (Encapsulated Logic)
    public String getGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    @Override
    public String toString() {
        return "\n=================================\n" +
               "        STUDENT DETAILS\n" +
               "=================================\n" +
               "Roll No    : " + rollNo + "\n" +
               "Name       : " + name + "\n" +
               "Age        : " + age + "\n" +
               "Department : " + department + "\n" +
               "Marks      : " + marks + "\n" +
               "Grade      : " + getGrade() + "\n" +
               "=================================\n";
    }
}
