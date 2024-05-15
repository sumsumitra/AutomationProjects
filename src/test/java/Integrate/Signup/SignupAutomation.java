package Integrate.Signup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupAutomation {
	public static void main(String[] args) throws InterruptedException {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
       

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://dev.3trade.xyz");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	    driver.manage().window().maximize();

        // Click on the Sign in button
        WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
        signInButton.click();
        Thread.sleep(3000);

        // Click on the Sign up button
        WebElement signUpButton = driver.findElement(By.linkText("Sign up"));
        signUpButton.click();

        // Click on the Continue to setup instructions button
        WebElement continueButton = driver.findElement(By.xpath("//button[normalize-space()='Continue to Sign-up']"));
        continueButton.isDisplayed();

        // Click on the Download button
        WebElement downloadButton = driver.findElement(By.xpath("//span[normalize-space()='Download']"));
        downloadButton.click();

        // Click on the Continue to Sign-up button
        WebElement continueSignUpButton = driver.findElement(By.xpath("//button[normalize-space()='Continue to Sign-up']"));
        continueSignUpButton.click();

        // Fill in business information
        WebElement businessEmailInput = driver.findElement(By.name("email"));
        businessEmailInput.sendKeys("sahoosumitra2007@gmail.com");

        WebElement organizationNameInput = driver.findElement(By.xpath("//input[@placeholder='Enter your Organisation Name']"));
        organizationNameInput.sendKeys("integratee");
        
        WebElement termsandcondition = driver.findElement(By.xpath("//input[@type='checkbox']"));
        termsandcondition.click();
        
        // Click on the Continue to Sign-up button
        WebElement SignUpButton = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
        SignUpButton.click();

        // Fill in personal details
        WebElement firstNameInput = driver.findElement(By.xpath("//input[@placeholder='Enter your First Name']"));
        firstNameInput.sendKeys("Sumitra");

        WebElement lastNameInput = driver.findElement(By.xpath("//input[@placeholder='Enter your Last Name']"));
        lastNameInput.sendKeys("Sahoo");

        WebElement usernameInput = driver.findElement(By.xpath("//input[@placeholder='Enter your Username']"));
        usernameInput.sendKeys("SumitraSahoo");

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("Password@123");

        WebElement confirmPasswordInput = driver.findElement(By.xpath("//input[@placeholder='Confirm Password']"));
        confirmPasswordInput.sendKeys("Password@123");

        WebElement validatorPartyInput = driver.findElement(By.xpath("//input[@placeholder='Enter your Validator Party']"));
        validatorPartyInput.sendKeys("3Trade");

        // Submit sign-up form
        WebElement signUpForm = driver.findElement(By.xpath("//button[@type='submit']"));
        signUpForm.submit();

        // Verify sign-up success
        if (driver.getPageSource().contains("Sign-up successful")) {
            System.out.println("Sign-up successful!");
        } else {
            System.out.println("Sign-up failed.");
        }

        // Close the browser
        driver.quit();
    }

}
