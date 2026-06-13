package Academy;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserTest {

    @Test
    public void getData() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://tanzeelalamacademy-fpcdgsgghraaf7ah.centralus-01.azurewebsites.net/webapp/");

            String text = driver.findElement(By.cssSelector("h1")).getText();

            System.out.println("Page Heading: " + text);

            Assert.assertEquals(
                    "Tanzeelalamacademy.com Learning Tanzeel Alam",
                    text);

        } finally {
            driver.quit();
        }
    }
}
