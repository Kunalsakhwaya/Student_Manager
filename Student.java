public class Student {
    private String name;
    private int rollNo;
    private String branch;
    private double cgpa;

    public Student(String name, int rollNo, String branch, double cgpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
        this.cgpa = cgpa;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
        System.out.println("CGPA: " + cgpa);
        System.out.println("---------------------------");
    }
}
