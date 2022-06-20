package ru.levelup.at.homework2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SinCalcTest extends BaseCalculatorTest {
    @Test
    public void testSinusDouble() {
        double res = calculator.sin(Math.toRadians(90.0));
        Assert.assertEquals(res, 1.0);
    }

}
