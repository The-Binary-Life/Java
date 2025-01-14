package org.tbl.pkg;

/**
 * @author The_Binary_Life
 */

public class CircuitBreaker {
    private CircuitBreakerState state;

    public CircuitBreakerState getState() {
        return state;
    }

    public void setState(CircuitBreakerState cbState) {
        this.state = cbState;
    }
}
