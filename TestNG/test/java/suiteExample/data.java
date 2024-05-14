package suiteExample;

import org.testng.annotations.DataProvider;

public class data {
    @DataProvider(name="loginData1")
    public Object[][] method1(){
        return new Object[][] {
                {"Narayana", "Malyavantham", "msn@gmail.com","8008156663", "nothing"},
                {"Naru", "Maly","sma@gmail.com","8008156663","something"},
                {"Nar2u", "Ma2ly","sma@gmail.com","8008156663","something"}
                // More data sets
        };
    }
}
