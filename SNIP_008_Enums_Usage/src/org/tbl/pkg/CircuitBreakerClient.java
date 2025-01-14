package org.tbl.pkg;

/**
 * @author The_Binary_Life
 */

public class CircuitBreakerClient {
    public static void main(String[] args) {
        CircuitBreaker circuitBreaker = new CircuitBreaker();

        //This is print out the positional values of the Enum constants
        System.out.println("Ordinal value of OPEN: " + CircuitBreakerState.OPEN.ordinal());
        System.out.println("Ordinal value of HALF_OPEN: " + CircuitBreakerState.HALF_OPEN.ordinal());
        System.out.println("Ordinal value of CLOSED: " + CircuitBreakerState.CLOSED.ordinal());

        circuitBreaker.setState(CircuitBreakerState.CLOSED);

        //circuitBreaker.setState(2); //This will not be allowed, we cannot set constant ordinals directly,
                                      //It has to be via Enum constants

        CircuitBreakerState state = circuitBreaker.getState();

        System.out.println("The circuit breaker state is " + state);

        circuitBreaker.setState(CircuitBreakerState.HALF_OPEN);

        state = circuitBreaker.getState();

        System.out.println("The circuit breaker state is " + state);
    }
}
