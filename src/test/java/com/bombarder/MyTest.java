package com.bombarder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class MyTest {

    private WebDriver driver;
    private WebDriverWait driverWait;

    @Before
    public void start(){
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:/Tools");
        driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver,10);
    }
    @Test
    public void myFirstTest(){
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("btnG")).click();
        driverWait.until(titleIs("webdriver - Пошук Google"));
    }
    @After
    public void stop(){
        driver.quit();
        driver = null;
    }
}
