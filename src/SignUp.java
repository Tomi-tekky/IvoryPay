import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SignUp extends MainClass {

    @Test(priority = 1)
    void UserSignUp() throws InterruptedException {

        System.out.println("Kindly click sign up");
        driver.findElement(By.xpath("(//a[@class='cursor-pointer text-[#02084B]'])[2]")).click();
        Thread.sleep(Long.parseLong("3000"));

        //Enter Firstname
        System.out.println("Kindly input your First name");
        WebElement name = driver.findElement(By.id("register_firstName"));
        name.sendKeys("tomi");

        //Enter Lastname
        System.out.println("Kindly input your Last name");
        WebElement Surname = driver.findElement(By.id("register_lastName"));
        Surname.sendKeys("Test");

        //Enter EmailAddress
        System.out.println("Kindly input your Email Address");
        WebElement Email = driver.findElement(By.id("register_email"));
        Email.sendKeys("IvoryBank@mailinator.co");

        //Enter BusinessName
        System.out.println("Kindly input your Business name");
        WebElement Business = driver.findElement(By.id("register_businessName"));
        Business.sendKeys("Tom Enterprise");

        //Enter Country
        System.out.println("Kindly input your Country");
        driver.findElement(By.xpath("(//input[@id='rc_select_0'])[1]")).click();
        Thread.sleep(Long.parseLong("2000"));

        List<WebElement> ddrop = driver.findElements(By.xpath("//div[@class='ant-select-item-option-content']"));
        for (WebElement country : ddrop) {
            String attrib = country.getAttribute("innerHTML");
           // System.out.println("values from dropdown...." + ddrop);
            if(attrib.contentEquals("Nigeria")){
                country.click();
                break;
            }
        }

        //Enter PhoneNumber
        System.out.println("Kindly input your Phone number");
        WebElement Phone = driver.findElement(By.xpath("//input[@class='ant-input']"));
        Phone.sendKeys("08067430920");

        //Enter Password
        System.out.println("Kindly input your Password");
        WebElement Password = driver.findElement(By.id("register_password"));
        Password.sendKeys("Testing1@");

        //Confirm Password
        System.out.println("Kindly input Confirm Password");
        WebElement ConfirmPassword = driver.findElement(By.id("register_confirmPassword"));
        ConfirmPassword.sendKeys("Testing1@");

        //Select Business Type
        System.out.println("Kindly select your business type");
        List<WebElement> BusinessType = driver.findElements(By.xpath("(//input[@value='starter'])[1]"));
        //System.out.println(BusinessType.size());
        for (WebElement biz : BusinessType) {
            //System.out.println(biz.getAttribute("value"));
            if (biz.getAttribute("value").equals("starter")) {
                biz.click();
            }
        }

        //Are you a developer?
        System.out.println("Kindly specify if you are a developer or not");
        List<WebElement> developer = driver.findElements(By.xpath("(//input[@value='false'])[1]"));
       // System.out.println(developer.size());
        for (WebElement dev : developer) {
            System.out.println(dev.getAttribute("value"));
            if (dev.getAttribute("value").equals("false")) {
                dev.click();
            }
        }

        //Tick policy box
        System.out.println("Kindly tick the policy box");
        WebElement policy = driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[2]"));
        System.out.println(policy.getAttribute("type"));
        if(policy.getAttribute("type").equals("checkbox")){
            policy.click();
        }Thread.sleep(Long.parseLong("2000"));


        //Proceed to signup
        System.out.println("Kindly proceed to signup");
        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default ant-btn-lg  ivry-add-button w-full h-10 md:text-sm text-xs p-2 text-white bg-[#2C3489] active:text-white rounded-md border-0 active:bg-[#2C3489] focus:text-white focus:bg-[#2C3489] hover:bg-[#2C3489]']")).click();
    }
}

