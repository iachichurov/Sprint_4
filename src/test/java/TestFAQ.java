
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestFAQ {
    private final String accordionText;
    private final String accordionIndex;

    public TestFAQ(String accordionText, String accordionIndex) {
        this.accordionText = accordionText;
        this.accordionIndex = accordionIndex;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Сутки — 400 рублей. Оплата курьеру — наличными или картой.", "0"},
                {"Пока что у нас так: один заказ — один самокат. " +
                        "Если хотите покататься с друзьями, " +
                        "можете просто сделать несколько заказов — один за другим.", "1"},
                {"Допустим, вы оформляете заказ на 8 мая. " +
                        "Мы привозим самокат 8 мая в течение дня. " +
                        "Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. " +
                        "Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", "2"},
                {"Только начиная с завтрашнего дня. Но скоро станем расторопнее.", "3"},
                {"Пока что нет! Но если что-то срочное — всегда можно позвонить " +
                        "в поддержку по красивому номеру 1010.", "4"},
                {"Самокат приезжает к вам с полной зарядкой. " +
                        "Этого хватает на восемь суток — даже если будете кататься " +
                        "без передышек и во сне. Зарядка не понадобится.", "5"},
                {"Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. " +
                        "Все же свои.", "6"},
                {"Да, обязательно. Всем самокатов! И Москве, и Московской области.", "7"},
        };
    }

    @Test
    public void checkFaqTest(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.className("App_CookieButton__3cvqF")).click();
        driver.findElement(By.xpath("//div[@id=\"accordion__heading-" + accordionIndex + "\"]")).click();
        String textCheck = driver.findElement(By.id("accordion__panel-"+accordionIndex)).getText();
        assertEquals(accordionText, textCheck);
        driver.quit();
    }

}
