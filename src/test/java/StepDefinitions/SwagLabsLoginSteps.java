package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SwagLabsLoginSteps {
//    WebDriver driver = null;
//    @Given("browser is launched")
//    public void browser_is_launched() {
//        System.out.println("Inside Test: browser is launched..!!");
//        System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//       //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//    }
//    @Given("user is on Swag Labs login page")
//    public void user_is_on_swag_labs_login_page() throws InterruptedException {
//        System.out.println("Inside Test: user is on Swag Labs login page..!!");
//        driver.navigate().to("https://www.saucedemo.com/");
//        Thread.sleep(2000);
//
//    }
//    @When("user enters username")
//    public void user_enters_username() throws InterruptedException {
//        System.out.println("Inside Test: user enters username..!!");
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        Thread.sleep(2000);
//
//    }
//    @When("user enters password")
//    public void user_enters_password() throws InterruptedException {
//        System.out.println("user enters password..!!");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        Thread.sleep(2000);
//
//    }
//    @Then("user is navigated to the homepage")
//    public void user_is_navigated_to_the_homepage() throws InterruptedException {
//        System.out.println("user is navigated to the homepage..!!");
//        driver.findElement(By.id("login-button")).click();
//        Thread.sleep(2000);
//        Boolean loginText = driver.findElement(By.xpath("//span[text()='Products']")).isDisplayed();
//        if(loginText){
//            System.out.println("Successfully Logged In");
//        }
//        else {
//            System.out.println("Login Unsuccessful");
//        }
//        Thread.sleep(2000);
//        driver.quit();
//    }
}
