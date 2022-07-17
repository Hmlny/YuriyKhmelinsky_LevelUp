package ru.levelup.at.homework2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubCalcTest extends BaseCalculatorTest {
    @Test
    public void testSubLong() {
        long res = calculator.sub(3, 2);
        Assert.assertEquals(res, 1);
    }

    @Test
    public void testSubDouble() {
        double res = calculator.sub(4.0D, 1.0D);
        Assert.assertEquals(res, 3.0D);
    }
}
