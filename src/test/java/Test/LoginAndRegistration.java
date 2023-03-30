package Test;

import Helpers.DriverHelper;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginAndRegistration {
    private WebDriver driver;

    @Test
    public void Question1() {
        driver = DriverHelper.getDriver();
        driver.get("https://moneygaming.qa.gameaccount.com");

        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/a[2]")).click();

        WebElement title = driver.findElement(By.id("title"));
        Select dropdown = new Select(title);
        dropdown.selectByValue("Ms");

        WebElement firstName = driver.findElement(By.name("map(firstName)"));
        firstName.sendKeys("Silviya");
        WebElement lastName = driver.findElement(By.name("map(lastName)"));
        lastName.sendKeys("Temple");

        WebElement checkbox = driver.findElement(By.id("checkbox"));
        checkbox.click();

        WebElement joinNow = driver.findElement(By.id("form"));
        joinNow.click();

        Assert.assertTrue(true);
        System.out.println("This field is required");
    }

    @Test
       public void Question1withAllFields() {
           driver= DriverHelper.getDriver();
           driver.get("https://moneygaming.qa.gameaccount.com");

           driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/a[2]")).click();

           WebElement title = driver.findElement(By.id("title"));
           Select dropdown = new Select(title);
           dropdown.selectByValue("Ms");

           WebElement firstName = driver.findElement(By.name("map(firstName)"));
           firstName.sendKeys("Silviya");
           WebElement lastName = driver.findElement(By.name("map(lastName)"));
           lastName.sendKeys("Temple");

           WebElement dateOfBirth = driver.findElement(By.id("dobDay"));
           Select date = new Select(dateOfBirth);
           date.selectByValue("03");

           WebElement monthOfBirth = driver.findElement(By.id("dobMonth"));
           Select month = new Select(monthOfBirth);
           month.selectByValue("07");

           WebElement yearOfBirth = driver.findElement(By.id("dobYear"));
           Select year = new Select(yearOfBirth);
           year.selectByValue("1981");






   }

    }

