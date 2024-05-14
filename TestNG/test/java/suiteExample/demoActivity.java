package suiteExample;

import org.testng.annotations.*;

public class demoActivity {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite annotation executed");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest annotation executed");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass annotation executed");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod annotation executed");
    }

    @Test
    public void testMethod() {
        System.out.println("TestMethod annotation executed");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod annotation executed");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass annotation executed");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest annotation executed");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite annotation executed");
    }
}
