import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.OrderPOM;
import pageobject.ButtonClickPOM;
import org.junit.Assert;

public class TestHeaderOrder {

    private static ChromeDriver driver = null;
    String name = "Иван";
    String surname = "Иванов";
    String address = "Ул. Иванова, 1";
    String station = "Лубянка";
    String phone = "+79999999999";
    String date = "15.02.2024";
    String period = "сутки";

    @Before
    public void testStart(){
        driver = new ChromeDriver();
    }
    @Test
    public void checkOrderFromHeader() {
        ButtonClickPOM objHeaderButton = new ButtonClickPOM(driver);
        objHeaderButton.clickHeaderOrderButton();
        OrderPOM objOrder = new OrderPOM(driver);
        objOrder.orderCheck(name, surname, address, station, phone, date, period);
        Assert.assertTrue(objOrder.isPopUpVisible());
    }
    @After
    public void testQuit() {
        driver.quit();
    }
}
