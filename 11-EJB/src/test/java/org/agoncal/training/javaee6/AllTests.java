package org.agoncal.training.javaee6;

import org.agoncal.training.javaee6.service.IsbnGeneratorSingletonTest;
import org.agoncal.training.javaee6.service.ItemEJBTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ItemEJBTest.class,
        IsbnGeneratorSingletonTest.class
})
public class AllTests {
}
