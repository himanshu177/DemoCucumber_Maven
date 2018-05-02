package Step;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step
{
   
    WebDriver we;
    @Given("^User is on Home Page$")
    public void User_Acct()
    {
        System.setProperty("webdriver.gecko.driver","/home/administrator/Downloads/geckodriver");
        we=new FirefoxDriver();
        we.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);   
        we.get("http://127.0.0.1:8080/apex/");
        we.findElement(By.name("p_t01")).sendKeys("him");
        we.findElement(By.name("p_t02")).sendKeys("2424");
        we.findElement(By.id("LOGIN")).click();
    }

    @When("^User navigate to Login Page$")
    public void admin() throws Exception
    {
        Thread.sleep(3000);
        we.findElement(By.linkText("Administration")).click();
    }
  
    @And("^User enters Username and Password and login button$")
    public void button()
    {
        we.findElement(By.xpath("html/body/form/div[7]/table/tbody/tr/td[1]/table[1]/tbody/tr/td[1]/table/tbody/tr/td[10]/input")).click();
        we.findElement(By.linkText("Logout")).click();
        we.close();
    }
   
    @Then("^Message Displayed Login Sucessfull$")
    public void msg()
    {
        System.out.println("Sucessfull List Displayed");
    }
}