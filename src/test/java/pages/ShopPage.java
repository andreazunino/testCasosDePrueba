package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.SeleniumBase;

public class ShopPage extends SeleniumBase {
    By locatorBtnComoComprar = By.xpath("//*[@id=\"content\"]/div[3]/div/div/button[4]/div/p[1]");

    public void irComoComprar(){
        click(esperarPorElementoLocalizado(locatorBtnComoComprar));
    }
    //crear elemento web
    public ShopPage(WebDriver driver) {
        super(driver);
    }
}
