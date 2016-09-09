import java.util.Scanner;
public class Acceleration {

    static double ACCELERATION = 9.80665;

    public static void main(String[] args) {
        double distance = getInput("Input distance in meters: ");
        double v = Math.floor((getVelocityAfterDistance(distance)*3.6) * 100) / 100;
        double travelTime = Math.floor((getTravelTime(distance)) * 100) / 100;
        System.out.println("The object traveled " + distance + " meters in " + travelTime + " seconds ending at a velocity of " + v + " km/h");
    }

    // Gets input from user
    public static double getInput(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.printf(message);
        while (!scanner.hasNextDouble()){
            System.out.println("Not a vlid input. Make sure you type a double");
            System.out.printf(message);
            scanner.next();
        }
        double input = scanner.nextDouble();
        scanner.close();
        return input;
    }

    // Calculates velocity after a given distance
    public static double getVelocityAfterDistance(double distance){
        return Math.sqrt(2*ACCELERATION*distance);
    }

    // Calculates traveltime over a given distance
    public static double getTravelTime(double distance){
        return Math.sqrt((2*distance)/ACCELERATION);
    }
}