package ru.levelup.at.homework2;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "Sum long Data")
    public Object[][] sumLongData() {
        return new Object[][]{
                {2, 2, 4},
                {1, 0, 1},
                {776, 1, 777}
        };
    }

    @DataProvider(name = "Sum Double Data")
    public Object[][] sumDoubleData() {
        return new Object[][]{
                {2.22D, 2.22D, 4.44D},
                {1.111D, 0D, 1.111D},
                {776D, 1.777D, 777.777D}
        };
    }
}
