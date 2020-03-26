import com.relevantcodes.extentreports.ExtentReports;
import framework.ReportUtil;
import framework.ScenarioContext;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import stepdefinition.Hooks;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        tags = {"@diTest"},
        glue = {"stepdefinition"})
        public class RunCucumberTest extends Hooks {



}


