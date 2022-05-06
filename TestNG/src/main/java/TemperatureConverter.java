import java.util.*;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("Choose to continue");
        System.out.println("1: Fahrenheit to Celsius");
        System.out.println("2: Celsius to Fahrenheit");
        Scanner menu = new Scanner(System.in);
        int menuChoice = menu.nextInt();

        if (menuChoice == 1) {
            System.out.println("Enter fahrenheit to convert to Celsius");
            double degreesFahrenheit = menu.nextDouble();
            System.out.println(toCelsius(degreesFahrenheit));
        }
        else if (menuChoice == 2) {
            System.out.println("Enter Celsius to convert to Fahrenheit");
            double degreesCelsius = menu.nextDouble();
            System.out.println(toFahrenheit(degreesCelsius));
        }
        menu.close();
    }

    public static double toCelsius(double degreesFahrenheit) {
        System.out.println(degreesFahrenheit);
        double degreesCelsius = ((degreesFahrenheit - 32) * (5.0/9.0));
        return degreesCelsius;
    }

    public static double toFahrenheit(double degreesCelsius) {
        System.out.println(degreesCelsius);
        double degreesFahrenheit = (degreesCelsius * (9.0/5.0)) + 32;
        return degreesFahrenheit;
    }
}
