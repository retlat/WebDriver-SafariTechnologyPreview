package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class Sample {
    public static void main(String[] args) {
        SafariOptions options = new SafariOptions();
        options.setUseTechnologyPreview(true);

        WebDriver driver = new SafariDriver(options);

        driver.get("https://www.google.co.jp");
        driver.quit();
    }
}
