package stepdefinition;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import framework.ReportUtil;
import framework.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class PreReqSteps {

    private  ScenarioContext scenarioContext;
    public PreReqSteps(ScenarioContext scenarioContext)
    {
        this.scenarioContext = scenarioContext;
    }

    @When("I launch {string}")
    public void i_launch(String string) {

    }

}
