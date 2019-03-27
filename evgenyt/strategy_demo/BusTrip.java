package evgenyt.strategy_demo;

/**
 * Concrete strategy: trip by bus
 */

public class BusTrip implements TripStrategy {
    @Override
    public void trip(String destination) {
        System.out.println("Go to nearest bus stop, wait a proper bus, board in, pay, wait nearest to " +
                destination + " bus stop.");
    }
}
