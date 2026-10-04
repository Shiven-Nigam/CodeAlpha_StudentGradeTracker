import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Grade Management System =====");

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        double[] grades = new double[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Grade: ");
            grades[i] = sc.nextDouble();
            sc.nextLine();
        }

        // Calculate average, highest, lowest
        double total = 0;
        double highest = grades[0];
        double lowest = grades[0];
        String highestStudent = names[0];
        String lowestStudent = names[0];

        for (int i = 0; i < n; i++) {

            total += grades[i];

            if (grades[i] > highest) {
                highest = grades[i];
                highestStudent = names[i];
            }

            if (grades[i] < lowest) {
                lowest = grades[i];
                lowestStudent = names[i];
            }
        }

        double average = total / n;

        // Display report
        System.out.println("\n========== SUMMARY REPORT ==========");

        System.out.printf("%-20s %-10s\n", "Student Name", "Grade");
        System.out.println("--------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-10.2f\n", names[i], grades[i]);
        }

        System.out.println("--------------------------------------");
        System.out.printf("Average Score : %.2f\n", average);
        System.out.printf("Highest Score : %.2f (%s)\n", highest, highestStudent);
        System.out.printf("Lowest Score  : %.2f (%s)\n", lowest, lowestStudent);

        sc.close();
    }
}