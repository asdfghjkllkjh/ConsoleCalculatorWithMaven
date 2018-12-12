/*
 * Copyright (c) 2017 Ergon Informatik AG
 * Merkurstrasse 43, 8032 Zuerich, Switzerland
 * All rights reserved.
 */

package ch.noah;

import static java.lang.Integer.valueOf;

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

    public int multiplication (String value1, String value2) {
        int intValue1 = valueOf(value1);
        int intValue2 = valueOf(value2);

        return intValue1 * intValue2;
    }
}
