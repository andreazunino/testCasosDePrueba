package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumBase;

public class RegisterPage extends SeleniumBase {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }


    By locatorEmail = By.id("email");
    By locatorPassword = By.name("password");
    By locatorRepeatPassword = By.name("password-confirm");
    By locatorIngresar = By.xpath("//a[@class='btn-secondary']");

    //Centralizar Acciones

    public void completarFormularioRegistro(String correo, String password){

        escribirTexto(esperarPorElementoLocalizado(locatorEmail),correo);
        escribirTexto(esperarPorElementoLocalizado(locatorPassword),password);
        escribirTexto(esperarPorElementoLocalizado(locatorRepeatPassword),password);

        click(esperarPorElementoLocalizado(locatorIngresar));
    }
}
