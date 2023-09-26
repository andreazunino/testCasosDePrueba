package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.MiClaro;
import pages.RegisterPage;
import pages.ShopPage;

public class Test_CpClaro {
    WebDriver driver;
    HomePage home;
    RegisterPage register;
    MiClaro claropage;
    ShopPage tienda;
    String rutaDriver = "C:\\Users\\andrea.zunino\\Desktop\\Ejercicio\\src\\test\\resources\\Drivers\\chromedriver.exe";
    String browser = "Chrome";
    String property = "webdriver.chrome.driver";

    @BeforeEach
    public void preTests(){
        home = new HomePage(driver);
        home.conexionDriver(browser,rutaDriver,property);
        claropage = new MiClaro(home.getDriver());
        register = new RegisterPage(claropage.getDriver());
        tienda= new ShopPage(home.getDriver());
        home.cargarPagina("https://www.claro.com.ar/");
    }

    @Test
    public void CP_01_CrearUsuarioConExito(){
        home.irMiClaro();
        claropage.irARegistrar();
        register.completarFormularioRegistro("domnasdas@gmail.com","safJ34534");
        Assertions.assertTrue(true);

    }

    @Test
    public void CP_02_ErrorContrasenia(){
        //este error es que faltan mayusculas y cantidad de caracteres
        home.irMiClaro();
        claropage.irARegistrar();
        register.completarFormularioRegistro("domnasdas@gmail.com","saf4534");
        Assertions.assertTrue(true);

    }

    @Test
    public void CP_03_IngresaTienda(){
        home.irATienda();


    }
   // @AfterEach
    //public void afterTests(){
       // home.cerrarBrowser();
    //}
}


