package com.me.calculators;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses(
        {
                ConsoleCalculatorTest.class,
        })
class AllCalulatorsTests {
}
