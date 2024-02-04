package locators;

import org.openqa.selenium.By;

public class OrderPageLocators {
    // Поле Имя
    // /html/body/div/div/div/div/div/input[@placeholder="* Имя"]
    public static By nameField = By.xpath("//input[@placeholder=\"* Имя\"]");

    // Поле Фамилия
    // /html/body/div/div/div/div/div/input[@placeholder="* Фамилия"]
    public static By surnameField = By.xpath("//input[@placeholder=\"* Фамилия\"]");

    // Поле Адрес
    // /html/body/div/div/div/div/div/input[@placeholder="* Адрес: куда привезти заказ"]
    public static By addressField = By.xpath("//input[@placeholder=\"* Адрес: куда привезти заказ\"]");

    // Поле Станция метро перед кликом
    // /html/body/div/div/div/div/div/div[@class="select-search"]
    public static By metroStationClickableField = By.xpath("//div[@class=\"select-search\"]");

    // Установка Станции метро
    // /html/body/div/div/div/div/div/div[@class="select-search has-focus"]/div/input[@class="select-search__input"]\
    // Установка By.className("select-search__input").sendKeys("value", "Черкизовская")
    public static By metroStationInputField = By.xpath("/html/body/div/div/div/div/div/div/div/input");

    // Поле Телефон
    // /html/body/div/div/div/div/div/input[@placeholder="* Телефон: на него позвонит курьер"]
    public static By phoneField = By.xpath("//input[@placeholder=\"* Телефон: на него позвонит курьер\"]");

    // Кнопка Далее
    // /html/body/div/div/div/div[@class="Order_NextButton__1_rCA"]/button[@class="Button_Button__ra12g Button_Middle__1CSJM"]
    // /html/body/div/div/div/div[@class="Order_NextButton__1_rCA"]/button[text()="Далее"]
    public static By nextButton = By.xpath("//button[text()=\"Далее\"]");

    // Кнопка выбора календаря
    // /html/body/div/div/div/div/div[@class="Order_MixedDatePicker__3qiay"]

    // Выбор непосредственно даты
    // /html/body/div/div/div/div/div[1]/div/div/input[@placeholder="* Когда привезти самокат"]
    public static By calendarField = By.xpath("//input[@placeholder=\"* Когда привезти самокат\"]");

    // Поле срок аренды
    // /html/body/div/div/div/div/div[@class="Dropdown-root"]
    public static By rentalTimeSelection = By.xpath("//div[@class=\"Dropdown-root\"]");

    // Выбор срока аренды
    // /html/body/div/div/div/div/div[@class="Dropdown-root is-open"]/div/div[text()="сутки"]
    public static By rentalTimePick = By.xpath("//div[text()=\"сутки\"]");

    // Кнопка заказать
    // /html/body/div/div/div/div[@class="Order_Buttons__1xGrp"]/button[text()="Заказать"]
    public static By orderButtonForm =
            By.xpath("//div[@class=\"Order_Buttons__1xGrp\"]/button[text()=\"Заказать\"]");

    // Всплывающее окно
    // /html/body/div/div/div/div[@class="Order_Modal__YZ-d3"]

    public static By popUpWindow = By.xpath("//div[@class=\"Order_Modal__YZ-d3\"]");
}
