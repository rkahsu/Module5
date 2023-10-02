import java.util.ArrayList;
import java.util.Scanner;

public class TemperatureTracker {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Add days of the week to the arraylist days
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

 for (String day : days) {
            System.out.println("Input average temperature for " + day + ": ");
            temperatures.add(scanner.nextDouble());
        }

        while (true) {
            System.out.println("Input a day of the week for daily average temperature or 'week' for weekly average temperature: ");
            String input = scanner.next();

            if (days.contains(input)) {
         
                int index = days.indexOf(input);
                System.out.println(input + ": " + temperatures.get(index));
            } else if (input.equals("week")) {
             
                double sum = 0;
                for (int i = 0; i < 7; i++) {
                    System.out.println(days.get(i) + ": " + temperatures.get(i));
                    sum += temperatures.get(i);
                }
                System.out.println("Weekly average: " + sum / 7);
            } else {
                System.out.println("Invalid input. Make sure to input the day of the week as written above");
            }
        }
    }
}
