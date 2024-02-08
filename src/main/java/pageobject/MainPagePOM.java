package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPagePOM {
    private final WebDriver driver;
    public MainPagePOM(WebDriver driver) {this.driver = driver;}

    public void clickFaqField(String accordionIndex) {
        driver.findElement(By.xpath("//div[@id=\"accordion__heading-" + accordionIndex + "\"]")).click();
    }

    public String checkFaqField(String accordionIndex) {
        return driver.findElement(By.id("accordion__panel-"+accordionIndex)).getText();
    }


}
