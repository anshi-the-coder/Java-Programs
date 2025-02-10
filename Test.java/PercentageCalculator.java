import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for 5 subjects
        System.out.println("Enter marks for 5 subjects (out of 100):");
        float subject1 = scanner.nextFloat();
        float subject2 = scanner.nextFloat();
        float subject3 = scanner.nextFloat();
        float subject4 = scanner.nextFloat();
        float subject5 = scanner.nextFloat();

        // Calculate total and percentage
        float totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        float percentage = (totalMarks / 500.0f) * 100;

        // Display result
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}