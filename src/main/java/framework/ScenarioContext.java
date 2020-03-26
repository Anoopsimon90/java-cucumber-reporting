package framework;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public  class ScenarioContext
{
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    private String sessionId="init";

    public String getWebDriver() {
        return WebDriver;
    }

    public void setWebDriver(String webDriver) {
        WebDriver = webDriver;
    }

    private String WebDriver;

    private ReportUtil reportUtil;


    public static ExtentReports getExtentReports() {
        return extentReports;
    }

    public static void registerExtentReportInContext(ExtentReports extentReports) {
        ScenarioContext.extentReports = extentReports;
    }

    private static ExtentReports extentReports;


    public ExtentTest getExtentTest() {
        return extentTest;
    }

    public void setExtentTest(ExtentTest extentTest) {
        this.extentTest = extentTest;
    }

    private ExtentTest extentTest;

}
