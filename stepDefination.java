package cucumberTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.GojekPage;

public class StepDef {

    @Given("^I open gojek website$")
    public void I_Open_Gojek_Website() throw Throwable {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://www.go-jek.com");
    }

    @And("^I click service button$")
    public void I_Click_Service_Button() throw Throwable {
        driver.findElement(By.className("Services")).click();
    }

    @When("^I click images (.*)$")
    public void I_Click_Images_Product_Option(String productOption) () throw Throwable {
        WebElement temp = driver.findElement(By.xpath("/html//body[@id='gojek']/div[@class='megamenu product']/div[@class='container']//a[@href='/go-ride/']"));
        WebElement temp = driver.findElement(By.xpath("/html//body[@id='gojek']/div[@class='megamenu product']/div[@class='container']//a[@href='/go-car/']"));
    }

    @Then("^I should see Why (.*)'$")
    public void I_Should_See_Why(List<String> productOption) () throw Throwable {
        WebElement temp = driver.findElement(By.xpath("//body[@id='goride']/section[@class='how-it-works--wrapper']//div[@class='pure-g']"));
        WebElement temp = driver.findElement(By.xpath("//body[@id='gocar']/section[@class='how-it-works--wrapper']//div[@class='pure-g']"));
    }
}
