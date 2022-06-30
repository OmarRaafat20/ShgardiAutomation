package main.java.SeleniumActivites.SeleniumUtilites;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {

    int count = 0;
    int retryCount = 0;

    @Override
    public boolean retry(ITestResult iTestResult) {
        while (count < retryCount) {
            count++;
            System.out.println("Retrying test " + iTestResult.getName() + " with status " + iTestResult.getStatus());
            return true;
        }
        return false;
    }
}
