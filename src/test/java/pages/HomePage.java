package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumBase;

public class HomePage extends SeleniumBase {
    //Definir los localizadores
    By locatorBtnMiClaro = By.xpath("//*[@id=\"content\"]/div[2]/li[1]/a");
    By locatorBtnTienda = By.xpath("///*[@id=\"__next\"]/div/header/div[1]/div/div/nav/div/div[1]/div/a[3]/div/img");
    By locatorBtnRegistrar = By.xpath("//*[@id=\"kc-info-wrapper\"]/div/a");
    //Centralizar las acciones
    public void irMiClaro(){
        //click(locatorBtnRegistrarte);
        click(esperarPorElementoLocalizado(locatorBtnMiClaro));
        esperarXSegundos(10);
        click(esperarPorElementoLocalizado(locatorBtnRegistrar));

    }



    public void irATienda(){
        click(esperarPorElementoLocalizado(locatorBtnTienda));
    }
    public HomePage(WebDriver driver) {
        super(driver);
    }
}
