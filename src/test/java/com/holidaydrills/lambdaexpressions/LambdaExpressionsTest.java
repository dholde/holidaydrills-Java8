package com.holidaydrills.lambdaexpressions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LambdaExpressionsTest {

    LambdaExpressions cut = new LambdaExpressions();

    @Test
    public void test_lambda_calculateTwoValues() {
        int valueOne = 10;
        int valueTwo = 15;

        int result = cut.calculateTwoValues(valueOne, valueTwo, (a, b) -> a + b);

        int expected = 10 + 15;
        assertEquals(expected, result);
    }

}