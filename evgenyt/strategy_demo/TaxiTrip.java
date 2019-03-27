package evgenyt.strategy_demo;

/**
 * Concrete strategy: trip by taxi
 */

public class TaxiTrip implements TripStrategy {
    @Override
    public void trip(String destination) {
        System.out.println("Call taxi, wait, ask a ride to " + destination + ", pay.");
    }
}
