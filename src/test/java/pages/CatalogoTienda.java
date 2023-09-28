package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.SeleniumBase;

public class CatalogoTienda extends SeleniumBase {
    By locatorPrecioMenor = By.xpath("//input[@type='number' and @step='500' and @min='0' and contains(@class, 'MuiOutlinedInput-input')]");
            //"//input[contains(@aria-invalid, 'false')]");
    By locatorPrecioMayor = By.xpath("//input[@type='number' and @step='500' and @min='30000' and contains(@class, 'MuiOutlinedInput-input')]");
    By locatorBtnAplicar = By.xpath("//button[contains(@class, 'Filtros_footer-button__2gxzH Filtros_footer-button-a')]");
    public void filtrosCatalogo(String precioMenor,  String precioMayor){
        scrollByLocator(locatorPrecioMenor);
       escribirTexto(esperarPorElementoLocalizado(locatorPrecioMenor),precioMenor);
        scrollByLocator(locatorPrecioMayor);
        escribirTexto(esperarPorElementoLocalizado(locatorPrecioMayor),precioMayor);

        //click(esperarPorElementoLocalizado(locatorBtnAplicar));
    }
    public void Aplicar(){
        click(esperarPorElementoLocalizado(locatorBtnAplicar));
    }

    public CatalogoTienda(WebDriver driver) {
        super(driver);
    }
}
