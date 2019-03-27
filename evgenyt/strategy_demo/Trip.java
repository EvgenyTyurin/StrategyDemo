package evgenyt.strategy_demo;

/**
 * Trip has a destination and a trip method, using strategy
 */

class Trip {
    private String destination;

    Trip(String destination) {
        this.destination = destination;
    }

    void trip(TripStrategy tripStrategy) {
        tripStrategy.trip(destination);
    }
}
