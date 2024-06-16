package tests;

import baseEntities.BaseTest;
import org.junit.jupiter.api.Test;
import pages.FramesPage;
import pages.JavaScriptAlertsPage;
import pages.WindowPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class HerokuappTest extends BaseTest {


    @Test
    public void iFrameTest() {
        new FramesPage()
                .clickOnIframe()
                .clickOnBoldButton()
                .inputText("Hello World!");
    }

    @Test
    public void windowsTest() {
        new WindowPage()
                .openNewWindow()
                .newPageVerification("New Window")
                .closeNewWindow()
                .windowPageVerification();
    }

    @Test
    public void infoJSAlertTest() {
        new JavaScriptAlertsPage()
                .clickOnForJSAlert()
                .jsAlertConfirmAndVerification()
                .closeAlertVerification("You successfully clicked an alert");
    }

    @Test
    public void jsConfirmTest() {
        new JavaScriptAlertsPage()
                .clickOnJSConfirm()
                .dismissAndVerification()
                .closeAlertVerification("You clicked: Cancel");
    }

    @Test
    public void jsPromptTest() {
        new JavaScriptAlertsPage()
                .clickOnJSPrompt()
                .inputText("Hello World")
                .closeAlertVerification("You entered: Hello World");
    }
}
