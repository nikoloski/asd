package com.seavus.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CalculatorAddTest{

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testNormalScenario() throws Exception {
        Integer sum = calculator.add(1, 2);

        Assert.assertEquals(new Integer(3), sum);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWhenFirstArgumentsIsNull() throws Exception {
            calculator.add(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWhenSecondArgumentsIsNull() throws Exception {
        calculator.add(1, null);
    }

    @Test(expected = OverFlowException.class)
    public void testForOverFlow() throws Exception {
        calculator.add(Integer.MAX_VALUE, 10);
    }
}
