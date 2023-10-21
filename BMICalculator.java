import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in kilograms:");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height in meters:");
        double height = scanner.nextDouble();
        double bmi = calculateBMI(weight, height);
        String interpretation = interpretBMI(bmi);
        System.out.println("Your BMI is " + bmi + ". This corresponds to the following health category: " + interpretation);
    }

    private static double calculateBMI(double weight, double height) {
        return weight / (height * height);   }

    private static String interpretBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";       }
    }
}