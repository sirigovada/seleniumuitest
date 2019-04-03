/*package reports;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
 
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.LogStatus;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Test;
 
public class ExtentReporterNG implements IReporter {
    private com.aventstack.extentreports.ExtentReports extent;
 
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        extent = new com.aventstack.extentreports.ExtentReports();
 
        for (ISuite suite : suites) {
            Map<String, ISuiteResult> result = suite.getResults();
 
            for (ISuiteResult r : result.values()) {
                ITestContext context = r.getTestContext();
 
                buildTestNodes(context.getPassedTests(), LogStatus.PASS);
                buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
                buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
            }
        }
 
        extent.flush();
       
    }
 
    /*private void buildTestNodes(IResultMap tests, LogStatus pass) {
        Test test;
 
        if (tests.size() > 0) {
            for (ITestResult result : tests.getAllResults()) {
                test = extent.startTest(result.getMethod().getMethodName());
 
               
 
                for (String group : result.getMethod().getGroups())
                    test.assignCategory(group);
 
                String message = "Test " + pass.toString().toLowerCase() + "ed";
 
                if (result.getThrowable() != null)
                    message = result.getThrowable().getMessage();
 
                test.log(pass, message);
 
                extent.endTest(test);
            }
        }
        }
    
    
 
    private Date getTime(long millis) {
        Calendar calendar= Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();        
    }



}*/
