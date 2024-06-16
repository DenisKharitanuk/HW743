package pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class NewWindowPage {
    private SelenideElement pageMessageText = $(By.xpath("//div/h3"));

    private SelenideElement getPageMessageText() {
        return pageMessageText;
    }

    public WindowPage newPageVerification(String message) {
        $(getPageMessageText().shouldBe(visible).shouldHave(text(message)));
        return new WindowPage();
    }
}
