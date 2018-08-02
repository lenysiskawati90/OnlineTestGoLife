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
        driver.get("http://www.gojek.com");
    }

    @And("^I click service button$")
    public void I_Click_Layanan_Button() throw Throwable {
        driver.findElement(By.className("buttonLayanan")).click();
    }

    @When("^I click images (.*)$")
    public void I_Click_Images_Product_Option(String productOption) () throw Throwable {
        WebElement temp = driver.findElement(By.xpath("//img[@src='web/L001/images/GORIDE.jpg']"));
        WebElement temp = driver.findElement(By.xpath("//img[@src='web/L002/images/GOCAR.jpg']"));
    }

    @Then("^I should see Why (.*)'$")
    public void I_Should_See_Kenapa(List<String> productOption) () throw Throwable {
        WebElement temp = driver.findElement(By.xpath("//img[@src='web/L001/images/GORIDE.jpg']"));
        WebElement temp = driver.findElement(By.xpath("//img[@src='web/L002/images/GOCAR.jpg']"));
    }
}
