package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;


public class IFramePage {
    private SelenideElement boldButton = $(By.xpath("//button[@aria-label='Bold']"));
    private SelenideElement iFrame = $(By.xpath("//IFrame"));
    private SelenideElement tinymce = $("#tinymce");

    private SelenideElement getBoldButton() {
        return boldButton;
    }

    private SelenideElement getIFrame() {
        return iFrame;
    }

    private SelenideElement getTinymce() {
        return tinymce;
    }

    public IFramePage clickOnBoldButton() {
        getBoldButton().click();
        return this;
    }

    public IFramePage inputText(String text) {
        switchTo().frame("mce_0_ifr");
        getTinymce().sendKeys(text);
        switchTo().defaultContent();
        return this;
    }
}
