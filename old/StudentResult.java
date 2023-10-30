import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Marks extends StudentResult {
    private int[] subjectMarks = new int[5];

    public Marks(String name, int rollNumber) {
        super(name, rollNumber);
    }

    public void readMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + " marks: ");
            subjectMarks[i] = scanner.nextInt();
        }
    }

    public void displayResult() {
        int totalMarks = 0;
        for (int marks : subjectMarks) {
            totalMarks += marks;
        }

        double averageMarks = (double) totalMarks / 5;

        System.out.println("Subject-wise Marks:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + subjectMarks[i]);
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        if (averageMarks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        Marks student = new Marks(name, rollNumber);
        student.displayDetails();
        student.readMarks();
        student.displayResult();

        scanner.close();
    }
}
