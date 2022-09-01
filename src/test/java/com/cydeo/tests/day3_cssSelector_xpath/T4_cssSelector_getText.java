package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {

    public static void main(String[] args) {


        // TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password

        WebElement resetPassword = driver.findElement(By.cssSelector("button[value='Reset password']"));
         String resetPasswordExpected = "Reset password";
        String resetPasswordActual = resetPassword.getAttribute("value");
        if (resetPasswordActual.equals(resetPasswordExpected)){
            System.out.println("Verification PASSED");
        }else {
            System.out.println("Verification FAİLED");
        }
    }
}
