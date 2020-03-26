package stepdefinition;

import com.relevantcodes.extentreports.LogStatus;
import framework.ReportUtil;
import framework.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseStep{

        private ScenarioContext scenarioContext;
        public LoginSteps(ScenarioContext scenarioContext)
        {
            this.scenarioContext=scenarioContext;
        }
        @When("I create a new user account in Google")
        public void i_create_a_new_user_account_in_Google()
        {
            new ReportUtil(scenarioContext.getExtentTest())
                    .log(LogStatus.PASS,"Login Step- Anoop Simon");

    }
}
