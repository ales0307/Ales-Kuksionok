package allure;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.reporters.ExitCodeListener;

public class AllureScreenShooter extends ExitCodeListener implements ITestListener {
    public void onTestFailure(final ITestResult result) {
        super.onTestFailure(result);
        allure.AllureHelpers.takeScreenshot();

    }
}
