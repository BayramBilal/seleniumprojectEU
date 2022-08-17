package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1_YahooTitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver  driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");

        String actualTitle  = driver.getTitle();

        System.out.println("Actual Title = "+actualTitle);

        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";


        if (actualTitle.equals(expectedTitle)){
            System.out.println("It is expected title");
        }else{
            System.out.println("It is not expected title");
        }

    }
}