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

class Mark extends Student {
    private int[] marks = new int[5]; // Array to store marks of 5 subjects

    public Mark(String name, int rollNumber) {
        super(name, rollNumber);
    }

    public void readMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    public void calculateTotalAndAverage() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }

        double average = (double) total / marks.length;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }


    public void displayResult() {
        calculateTotalAndAverage();
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        Mark studentMark = new Mark(name, rollNumber);

        studentMark.readMarks(); // Read marks for 5 subjects
        studentMark.displayDetails();
        studentMark.displayResult(); // Display student details and result
    }
}
