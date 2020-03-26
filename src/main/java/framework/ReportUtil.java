package framework;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportUtil {
   public ReportUtil(ExtentTest test){
       this.extentTest=test;
   }
    private ExtentTest extentTest;

    public void log(LogStatus logStatus,String log)
    {
        extentTest.log(logStatus,log);
    }
}
