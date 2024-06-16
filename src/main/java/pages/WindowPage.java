package pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class WindowPage {
    private final static String pagePath = "/windows";

    private SelenideElement clickHereButton = $(By.xpath("//a[@href=\"/windows/new\"]"));

    private SelenideElement getClickHereButton() {
        return clickHereButton;
    }


    public NewWindowPage openNewWindow() {
        open(pagePath);
        getClickHereButton().click();
        switchTo().window(1);
        return new NewWindowPage();
    }

    public WindowPage closeNewWindow() {
        closeWindow();
        switchTo().window(0);
        return this;
    }
    public WindowPage windowPageVerification(){
        $(getClickHereButton().shouldBe(visible));
        return this;
    }
}
