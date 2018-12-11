/*
 * Copyright (c) 2017 Ergon Informatik AG
 * Merkurstrasse 43, 8032 Zuerich, Switzerland
 * All rights reserved.
 */

package ch.noah;

public class Calculator {

    int summe(int summand1, int summand2) {
        return summand1 + summand2;
    }

    public int subtract(int value1, int value2) {
        return subtractPrivate(value1, value2);
    }

    private int subtractPrivate(int value1, int value2) {
        return value1 - value2;
    }

    protected int division(int value1, int value2) {
        return value1 / value2;
    }
}
