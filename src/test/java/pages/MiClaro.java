package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumBase;

public class MiClaro extends SeleniumBase {

    By locatorBtnRegistrar = By.xpath("//a[contains(@id,'body-secondary-btn')]");

    public void irARegistrar() {
        //click(locatorBtnRegistrarte);
        esperarXSegundos(3000);
        click(esperarPorElementoLocalizado(locatorBtnRegistrar));

    }

    public MiClaro(WebDriver driver) {
        super(driver);
    }
}
