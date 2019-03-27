package evgenyt.strategy_demo;

/**
 * All trip strategies must have trip method
 */

public interface TripStrategy {
    void trip(String destination);
}
