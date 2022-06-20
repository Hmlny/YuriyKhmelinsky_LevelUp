package ru.levelup.at.homework2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PowCalcTest extends BaseCalculatorTest {
    @Test
    public void testPowDouble() {
        double res = calculator.pow(2.0, 4.0);
        Assert.assertEquals(res, 16.0);
    }
}
