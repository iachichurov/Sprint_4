import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SevenTest {

    private static ChromeDriver driver = null;
    @Before
    public void testStart(){
        driver = new ChromeDriver();
    }

    @Test
    public void checkOrderFromHeader() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://www.seventest.com");
        driver.findElement(By.xpath("//b[text()='Форум']")).click();
    }

    @After
    public void testQuit() {
        driver.quit();
    }

}
