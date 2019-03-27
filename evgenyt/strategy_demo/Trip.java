package evgenyt.strategy_demo;

/**
 * Trip has a destination and a trip method, using strategy
 */

public class Trip {
    String destination;

    public Trip(String destination) {
        this.destination = destination;
    }

    void trip(TripStrategy tripStrategy) {
        tripStrategy.trip(destination);
    }
}
