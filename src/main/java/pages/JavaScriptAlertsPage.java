package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class JavaScriptAlertsPage {

    private final static String pagePath = "/javascript_alerts";

    private SelenideElement clickForJSAlertButton = $(By.xpath("//button[@onclick='jsAlert()']"));
    private SelenideElement clickForJSConfirm = $(By.xpath("//button[@onclick='jsConfirm()']"));
    private SelenideElement clickForJSPrompt = $(By.xpath("//button[@onclick='jsPrompt()']"));

    private SelenideElement resultMessage = $("#result");

    private SelenideElement getClickForJSAlertButton() {
        return clickForJSAlertButton;
    }

    private SelenideElement getClickForJSConfirm() {
        return clickForJSConfirm;
    }

    private SelenideElement getClickForJSPrompt() {
        return clickForJSPrompt;
    }

    private SelenideElement getResultMessage() {
        return resultMessage;
    }

    public JavaScriptAlertsPage clickOnForJSAlert() {
        open(pagePath);
        getClickForJSAlertButton().click();
        return this;
    }

    public JavaScriptAlertsPage jsAlertConfirmAndVerification() {
        String text = confirm();
        assertEquals("I am a JS Alert", text);
        return this;
    }

    public JavaScriptAlertsPage closeAlertVerification(String message) {
        $(getResultMessage().shouldBe(visible).shouldHave(text(message)));
        return this;
    }

    public JavaScriptAlertsPage clickOnJSConfirm() {
        open(pagePath);
        getClickForJSConfirm().click();
        return this;
    }

    public JavaScriptAlertsPage dismissAndVerification() {
        String text = dismiss();
        assertEquals("I am a JS Confirm", text);
        return this;
    }

    public JavaScriptAlertsPage clickOnJSPrompt() {
        open(pagePath);
        getClickForJSPrompt().click();
        return this;
    }

    public JavaScriptAlertsPage inputText(String message) {
        prompt(message);
        return this;
    }
}

