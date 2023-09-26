package pages;

import org.junit.jupiter.api.Assertions;
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

    By locatorErrorContrasenia = By.xpath("//*[@id=\"password-help-text\"]");

    String resultadoEsperado = corregirEncoding("La contraseña debe contener al menos 8 caracteres, una mayúscula.");

    //Centralizar Acciones

    public void completarFormularioRegistro(String correo, String password){

        escribirTexto(esperarPorElementoLocalizado(locatorEmail),correo);
        escribirTexto(esperarPorElementoLocalizado(locatorPassword),password);
        escribirTexto(esperarPorElementoLocalizado(locatorRepeatPassword),password);

        Assertions.assertEquals(resultadoEsperado,obtenerTexto(esperarPorElementoLocalizado(locatorErrorContrasenia)));
        click(esperarPorElementoLocalizado(locatorIngresar));
    }
}



