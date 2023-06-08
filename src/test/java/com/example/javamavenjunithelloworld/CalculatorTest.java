package com.example.javamavenjunithelloworld;


import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Unit test for Hello.
 * <p/>
 * A unit test aims to test all code and code paths of a specific class.
 */
public class CalculatorTest {

    @Test
    public void testAdd() {

        Calculator calculator = new Calculator();
        int a = 1;
        int b = 2;
        int sum = calculator.add(a, b);

        assertThat("sum", sum == 3);
    }

    @Test
    public void testSubs() {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 2;
        int sum = calculator.subs(a, b);

        assertThat("substraction", sum == 3);
    }

}
