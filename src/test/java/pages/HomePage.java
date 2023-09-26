package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumBase;

public class HomePage extends SeleniumBase {
    //Definir los localizadores
    By locatorBtnMiClaro = By.xpath("//*[@id=\"content\"]/div[2]/li[1]/a");
    By locatorBtnTienda = (By.xpath("//*[@id=\"content\"]/div[2]/li[3]/a/h2"));

    //Centralizar las acciones
    /*public MiClaro irMiClaro(){
        //click(locatorBtnRegistrarte);
        click(esperarPorElementoLocalizado(locatorBtnMiClaro));

        return null
    }*/
    public MiClaro irMiClaro(){
        click(esperarPorElementoLocalizado(locatorBtnMiClaro));
        return null;
    }

    public ShopPage irATienda(){
        click(esperarPorElementoLocalizado(locatorBtnTienda));
        return null;
    }
    public HomePage(WebDriver driver) {
        super(driver);
    }
}
