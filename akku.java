import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class akku {

    public static void main(String[] args) {
        ArrayList<Double> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student grades. Type -1 to finish:");

        // Input loop for grades
        while (true) {
            System.out.print("Enter grade: ");
            double grade = scanner.nextDouble();

            if (grade == -1) {
                break;  // Stop input when -1 is entered
            }

            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade! Enter a value between 0 and 100.");
            } else {
                grades.add(grade);  // Add valid grades to the list
            }
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            // Calculate and display statistics
            double average = calculateAverage(grades);
            double highest = Collections.max(grades);
            double lowest = Collections.min(grades);

            System.out.printf("Average Grade: %.2f%n", average);
            System.out.println("Highest Grade: " + highest);
            System.out.println("Lowest Grade: " + lowest);
        }

        scanner.close();
    }

    // Method to calculate the average of the grades
    public static double calculateAverage(ArrayList<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}

     


     
     
     

     


      
  
