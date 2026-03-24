package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class HomePage {

    private Page page ;

    private Locator myAccount;
    private Locator login;

    public HomePage(Page page) {
        this.page = page;

        this.myAccount = page.locator("body > div:nth-child(1) > div:nth-child(5) > header:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > nav:nth-child(1) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(6) > a:nth-child(1)");

        this.login = page.getByText("Login", new Page.GetByTextOptions().setExact(true));
    }

    public void clickMyAccount() {
        myAccount.hover();
        login.click();
    }

}
