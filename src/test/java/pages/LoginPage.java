package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class LoginPage {
    private Page page;

    private Locator emailLocator ;
    private Locator passwordLocator ;
    private Locator loginBtn ;


    public LoginPage(Page page) {
        this.page = page;
        this.loginBtn = page.locator("input.btn.btn-primary");
        this.passwordLocator = page.getByLabel("Password");
        this.emailLocator = page.getByLabel("E-Mail Address");
    }

    public void entreEmail(String email) {
        emailLocator.fill(email);
    }

    public void entrePassword(String password) {
        passwordLocator.fill(password);
    }

    public void clickLogin() {
        loginBtn.click();
    }

}
