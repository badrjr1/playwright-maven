package steps;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps {
    private LoginPage loginPage;
    private HomePage homePage;

    @Given("I navigate to {string}")
    public void i_navigate_to(String string) {
        Hooks.page.navigate(string);
        homePage = new HomePage(Hooks.page);
    }
    @Given("I click on {string}")
    public void i_click_on(String string) {
        homePage.clickMyAccount();
        loginPage =  new LoginPage(Hooks.page);
    }
    @Given("I enter E-mail adress {string}")
    public void i_enter_e_mail_adress(String string) {
        loginPage.entreEmail(string);
    }
    @Given("I enter Password {string}")
    public void i_enter_password(String string) {
        loginPage.entrePassword(string);
    }
    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        loginPage.clickLogin();
    }
    @Then("I should Verify url contains {string}")
    public void i_should_verify_url_contains(String expectedText) {
        String currentUrl = Hooks.page.url();
        assertTrue(currentUrl.contains(expectedText),
                "URL actuelle: " + currentUrl + " ne contient pas: " + expectedText);
    }
}
