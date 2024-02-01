package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class aotomationtest 
{
	 public static WebDriver driver;
	 
    public static void main(String[] args)
    {

    
	ChromeOptions  option = new  ChromeOptions ();
       
        driver = new ChromeDriver(option);

        
        driver.get("https://demo.automationtesting.in/Register.html");

        try {
            
            WebElement skipSignInButton = driver.findElement(By.xpath("//a[@id='btn2']"));
            skipSignInButton.click();
            
            // Navigate to the Register page
            WebElement registrationTab = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
            registrationTab.click();

            // Fill out the registration form
            WebElement firstNameField = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
            firstNameField.sendKeys("John");

            WebElement lastNameField = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
            lastNameField.sendKeys("Doe");

            WebElement addressField = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
            addressField.sendKeys("123 Main St");

            WebElement emailField = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
            emailField.sendKeys("john.doe@example.com");

            WebElement phoneField = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
            phoneField.sendKeys("1234567890");

            WebElement maleRadio = driver.findElement(By.xpath("//input[@value='Male']"));
            maleRadio.click();

            WebElement hobbiesCheckbox = driver.findElement(By.xpath("//input[@value='Cricket']"));
            hobbiesCheckbox.click();

            WebElement skillsDropdown = driver.findElement(By.id("Skills"));
            skillsDropdown.sendKeys("Java");

            WebElement countryDropdown = driver.findElement(By.id("countries"));
            countryDropdown.sendKeys("United States");

            WebElement selectCountry = driver.findElement(By.xpath("//span[contains(text(),'United States')]"));
            selectCountry.click();

            WebElement yearOfBirthDropdown = driver.findElement(By.id("yearbox"));
            yearOfBirthDropdown.sendKeys("1990");

            WebElement monthOfBirthDropdown = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
            monthOfBirthDropdown.sendKeys("May");

            WebElement dayOfBirthDropdown = driver.findElement(By.id("daybox"));
            dayOfBirthDropdown.sendKeys("10");

            WebElement passwordField = driver.findElement(By.id("firstpassword"));
            passwordField.sendKeys("Pass123");

            WebElement confirmPasswordField = driver.findElement(By.id("secondpassword"));
            confirmPasswordField.sendKeys("Pass123");

            // Submit the form
            WebElement submitButton = driver.findElement(By.id("submitbtn"));
            submitButton.click();

        }
        catch (Exception e) 
        {
            e.printStackTrace();
        } 
           // driver.quit();
        }
    }

