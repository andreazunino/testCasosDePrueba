package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.MiClaro;
import pages.RegisterPage;

public class Test_CpClaro {
    WebDriver driver;
    HomePage home;
    RegisterPage register;
    MiClaro claropage;
    String rutaDriver = "C:\\Users\\andrea.zunino\\Desktop\\Ejercicio\\src\\test\\resources\\Drivers\\chromedriver.exe";
    String browser = "Chrome";
    String property = "webdriver.chrome.driver";

    @BeforeEach
    public void preTests(){
        home = new HomePage(driver);
        home.conexionDriver(browser,rutaDriver,property);
        claropage = new MiClaro(home.getDriver());
        register = new RegisterPage(claropage.getDriver());
        home.cargarPagina("https://www.claro.com.ar/");
    }

    @Test
    public void CP_01_CrearUsuarioConExito(){
        home.irMiClaro();
        claropage.irARegistrar();
        register.completarFormularioRegistro("domnasdas@gmail.com","safJ34534");
        Assertions.assertTrue(true);

    }


   // @AfterEach
    //public void afterTests(){
       // home.cerrarBrowser();
    //}
}


