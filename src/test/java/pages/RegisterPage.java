package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumBase;

public class RegisterPage extends SeleniumBase {
    By locatorBtnRegistrar = By.xpath("//a[contains(@tabindex,6)]");

    public void irARegistrar() {
        //click(locatorBtnRegistrarte);
        click(esperarPorElementoLocalizado(locatorBtnRegistrar));
    }

    public RegisterPage(WebDriver driver) {
        super(driver);
    }


    By locatorEmail = By.id("email");
    By locatorPassword = By.name("password");
    By locatorRepeatPassword = By.name("password-confirm");
    By locatorIngresar = By.xpath("//button[@type='submit']");

    //Centralizar Acciones

    public void completarFormularioRegistro(String correo, String password){

        escribirTexto(esperarPorElementoLocalizado(locatorEmail),correo);
        escribirTexto(esperarPorElementoLocalizado(locatorPassword),password);
        escribirTexto(esperarPorElementoLocalizado(locatorRepeatPassword),password);

        click(esperarPorElementoLocalizado(locatorIngresar));
    }
}
