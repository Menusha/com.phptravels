package helpers;

import org.openqa.selenium.By;

import helpers.PropertyLoader;

public class Login {

    public static By getUserNameSelector() {
        return By.name("username");
    }

    public static By getPasswordSelector() {
        return By.name("password");
    }

    public static By getLoginBtnSelector() {
        return By.xpath("//button[contains(text(),'Login')]");
    }

    public static String getUserName(String application) {
        return PropertyLoader.getProperty(application, "username");
    }

    public static String getPassword(String application) {
        return PropertyLoader.getProperty(application,"password");
    }
}
