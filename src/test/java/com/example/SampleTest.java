package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SampleTest {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        SafariOptions options = new SafariOptions();
        options.setUseTechnologyPreview(true);

        driver = new SafariDriver(options);
    }

    @Test
    public void test() {
        driver.get("https://www.google.co.jp");
        assertThat(driver.getTitle(), is(equalTo("Google")));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
