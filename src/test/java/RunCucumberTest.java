import com.relevantcodes.extentreports.ExtentReports;
import framework.ReportUtil;
import framework.ScenarioContext;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        tags = {"@diTest"},
        glue = {"stepdefinition"})
        public class RunCucumberTest {
        @BeforeClass
        public static void initializer()
        {
                ExtentReports extentReports= new ExtentReports("C:/tmp/sample.html");
                extentReports.loadConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
                ScenarioContext.registerExtentReportInContext(extentReports);

        }
        @AfterClass
        public static void teardown()
        {
           ScenarioContext.getExtentReports().close();
        }


}


