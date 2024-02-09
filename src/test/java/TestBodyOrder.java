import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.OrderPOM;
import pageobject.ButtonClickPOM;
import org.junit.Assert;
public class TestBodyOrder {

    private static ChromeDriver driver = null;
    String name = "Петр";
    String surname = "Петров";
    String address = "Ул. Петрова, 1";
    String phone = "+79999999999";
    String date = "25.02.2024";
    String period = "двое суток";

    @Before
    public void testStart(){
        driver = new ChromeDriver();
    }

    @Test
    public void checkOrderFromHeader() {
        ButtonClickPOM objBodyButton = new ButtonClickPOM(driver);
        objBodyButton.cookieClick();
        objBodyButton.clickBodyOrderButton();
        OrderPOM objOrder = new OrderPOM(driver);
        objOrder.orderCheck(name, surname, address, phone, date, period);
        Assert.assertTrue(objOrder.isPopUpVisible());
    }

    @After
    public void testQuit() {
        driver.quit();
    }

}
