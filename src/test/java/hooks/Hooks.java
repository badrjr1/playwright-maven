package hooks;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.Arrays;

public class Hooks {

    public static Playwright playwright;
    public static Browser browser;
    public static Page page;

    @Before
    public void setUp() {
        boolean isCI = System.getenv("CI") != null;

        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(isCI) // CI → true
                        .setArgs(Arrays.asList("--no-sandbox"))
        );
    }

    @After
    public void tearDown() {
        browser.close();
        playwright.close();
    }
}
