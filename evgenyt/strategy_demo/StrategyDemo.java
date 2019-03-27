package evgenyt.strategy_demo;

import java.util.Scanner;

/**
 * Strategy pattern demo
 * Mar 2019 Evgeny Tyurin
 */

public class StrategyDemo {
    public static void main(String[] args) {
        System.out.println("Enter trip destination");
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.next();
        Trip trip = new Trip(destination);
        System.out.println("Enter trip strategy: taxi or bus");
        String strategy = scanner.next();
        switch (strategy) {
            case "taxi":
                trip.trip(new TaxiTrip());
                break;
            case "bus":
                trip.trip(new BusTrip());
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
