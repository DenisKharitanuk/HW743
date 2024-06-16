package baseEntities;

import com.codeborne.selenide.Configuration;
import configuration.ReadProperties;
import org.junit.jupiter.api.BeforeEach;


import static com.codeborne.selenide.Selenide.open;
import static configuration.ReadProperties.getUrl;

public class BaseTest {
    @BeforeEach
    public void setup() {
        Configuration.baseUrl = ReadProperties.getUrl();
        Configuration.reportsFolder = "target/screenshoots/";
        open(getUrl());
    }
}
