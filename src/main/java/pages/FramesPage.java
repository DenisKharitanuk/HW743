package pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FramesPage {

    private final static String pagePath = "/frames";

    private SelenideElement iFrame = $(By.xpath("//a[@href='/iframe']"));

    private SelenideElement getIFrame() {
        return iFrame;
    }

    public IFramePage clickOnIframe(){
        open(pagePath);
        getIFrame().click();
        return new IFramePage();
    }
}
