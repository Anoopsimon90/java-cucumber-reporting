package stepdefinition;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import framework.ReflectionUtil;
import framework.ScenarioContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

    private ScenarioContext scenarioContext;
    public Hooks(ScenarioContext scenarioContext)
    {
        this.scenarioContext=scenarioContext;
    }

    @Before
    public void BeforeScenario(Scenario scenario)
    {
       System.out.println("-----Before Scenario----");
       ExtentTest extentTest =startExtentTest(scenario.getName());
       this.scenarioContext.setExtentTest(extentTest);
    }


    @After
    public void AfterScenario(Scenario scenario)
    {
        this.scenarioContext
                .getExtentReports()
                .endTest(this.scenarioContext.getExtentTest());
    }

    /**
     * To Start extent test case
     * @param testCaseName
     */
    public ExtentTest startExtentTest(String testCaseName){
        ExtentReports report;
        try {
            return new ReflectionUtil()
                    .getStaticFieldValueFromClass("EXTENTREPORTS")
                    .startTest(testCaseName);
        }catch (Exception e)
        {
            System.out.println("error");
            return null;
        }
    }
}
