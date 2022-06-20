package ru.levelup.at.homework2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivCalcTest extends BaseCalculatorTest {
    @Test
    public void testDivLong() {
        long res = calculator.div(8, 2);
        Assert.assertEquals(res, 4);
    }
}
