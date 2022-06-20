package ru.levelup.at.homework2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiCalcTest extends BaseCalculatorTest {
    @Test
    public void testMultLong() {
        long res = calculator.mult(5, 5);
        Assert.assertEquals(res, 25);
    }
}
