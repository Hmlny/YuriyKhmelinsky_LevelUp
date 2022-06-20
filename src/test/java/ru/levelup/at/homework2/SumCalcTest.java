package ru.levelup.at.homework2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumCalcTest extends BaseCalculatorTest {

    @Test(dataProvider = "Sum long Data", dataProviderClass = TestData.class)
    public void testAddLong(long a, long b, long result) {
        long res = calculator.sum(a, b);
        Assert.assertEquals(res, result);
    }

    @Test(dataProvider = "Sum Double Data", dataProviderClass = TestData.class)
    public void testAddDouble(double a, double b, double result) {
        double res = calculator.sum(a, b);
        Assert.assertEquals(res, result);
    }
}
