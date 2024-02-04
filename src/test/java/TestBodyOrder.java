import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageobject.OrderPOM;
import pageobject.OrderButtonClickPOM;
import org.junit.Assert;
import java.util.concurrent.TimeUnit;
public class TestBodyOrder {

    @Test
    public void checkOrderFromHeader() {
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.className("App_CookieButton__3cvqF")).click();
        OrderButtonClickPOM objBodyButton = new OrderButtonClickPOM(driver);
        objBodyButton.clickBodyOrderButton();
        String name = "Петр";
        String surname = "Петров";
        String address = "Ул. Петрова, 1";
        String station = "Черкизовская";
        String phone = "+79999999999";
        String date = "25.02.2024";
        String period = "двое суток";
        OrderPOM objOrder = new OrderPOM(driver);
        objOrder.orderCheck(name, surname, address, station, phone, date, period);
        Assert.assertTrue(objOrder.isPopUpVisible());
        driver.quit();
    }

}
