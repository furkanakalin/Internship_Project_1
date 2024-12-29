package US_7_8_9_10.StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {

    @After
    public void after(Scenario senaryo)
    {
        GWD.quitDriver();
    }

}
