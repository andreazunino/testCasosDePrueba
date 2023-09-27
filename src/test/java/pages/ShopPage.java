package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.SeleniumBase;

public class ShopPage extends SeleniumBase {

    By locatorBtnCatalogo = By.xpath("//*[@id=\"content\"]/section/div/div[1]/div[2]/span/a/div/div/div");
    public ShopPage irACatalogo() {
        click(esperarPorElementoLocalizado(locatorBtnCatalogo));
        return null;
    }

    public ShopPage(WebDriver driver) {
        super(driver);
    }
   /* By locatorBtnComoComprar = By.xpath("//p[@class='AccesosRapidos_titulo__19QGm' and text()='¿Cómo comprar?']");

    public void irComoComprar(){
        click(esperarPorElementoLocalizado(locatorBtnComoComprar));
    }
    //crear elemento web
    public ShopPage(WebDriver driver) {

        super(driver);
    }*/
}
