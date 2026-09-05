import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEmployee " + i);

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter weight in kg: ");
            double weight = scanner.nextDouble();

            System.out.print("Enter height in meters: ");
            double height = scanner.nextDouble();
            scanner.nextLine();

            double bmi = weight / (height * height);

            String category;

            if (bmi < 18.5) {
                category = "Underweight";
            } else if (bmi < 25) {
                category = "Normal";
            } else if (bmi < 30) {
                category = "Overweight";
            } else {
                category = "Obese";
            }

            System.out.printf(
                    "%s - BMI: %.2f - Category: %s%n",
                    name, bmi, category
            );
        }

        scanner.close();
    }
}
