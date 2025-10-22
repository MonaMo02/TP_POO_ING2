package exo2;

import java.util.Scanner;

public class MainApp_Scanner {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Instructor Information ===");
        System.out.print("Enter instructor name: ");
        String instructorName = sc.nextLine();

        System.out.print("Enter instructor specialty: ");
        String specialty = sc.nextLine();

        Instructor instructor = new Instructor(instructorName, specialty);

        System.out.println("\n=== Training Creation ===");
        System.out.print("Enter title for the first training: ");
        String title1 = sc.nextLine();
        Training training1 = new Training(title1, instructor);

        System.out.print("Enter title for the second training: ");
        String title2 = sc.nextLine();
        Training training2 = new Training(title2);

        System.out.println("\n=== Learners Registration ===");
        System.out.print("How many learners do you want to create? ");
        int learnerCount = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= learnerCount; i++) {
            System.out.println("\n--- Learner " + i + " ---");

            System.out.print("First name: ");
            String firstName = sc.nextLine();

            System.out.print("Last name: ");
            String lastName = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            Learner learner = new Learner(lastName, firstName, email);

            System.out.println("Assign learner to a training:");
            System.out.println("1. " + training1.title);
            System.out.println("2. " + training2.title);
            System.out.print("Enter your choice (1 or 2): ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                training1.addLearner(learner);
            } else if (choice == 2) {
                training2.addLearner(learner);
            } else {
                System.out.println("Invalid choice. Learner not added.");
            }
        }

        // --- Display Results ---
        System.out.println("\n***************************************************");
        System.out.println("=== Trainings Summary ===");
        training1.displayTraining();
        System.out.println("***************************************************");
        training2.displayTraining();
        System.out.println("***************************************************");
        Training.displayCount();

        sc.close();
    }


}
