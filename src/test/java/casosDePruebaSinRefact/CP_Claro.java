package casosDePrueba;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.charset.StandardCharsets;


public class CP_Claro {
    private WebDriver driver; //atributo para no crear abajo

    @BeforeEach
    public void preCondiciones(){
        //parametrizar la ruta del driver
        String rutaDriver = "C:\\Users\\andrea.zunino\\Desktop\\Ejercicio\\src\\test\\resources\\Drivers\\chromedriver.exe";

        //enlazar el webdriver de chrome al browser
        System.setProperty("webdriver.chrome.driver", rutaDriver);

        //instanciar un objeto de tipo webdriver de google chrome
        driver = new ChromeDriver();
        driver.get("https://www.claro.com.ar/personas");


    }

    @AfterEach
    public void postCondiciones(){
        driver.quit(); //para que se cierre el navegador
    }



    @Test
    public void CP_01_CrearUsuarioConExito() throws InterruptedException {
        //localizar elemento en html
        By locatorBtnMiClaro = By.xpath("//*[@id=\"content\"]/div[2]/li[1]/a");

        //crear elemento web
        WebElement btnMiClaro = driver.findElement(locatorBtnMiClaro);

        //hacer click en boton
        btnMiClaro.click();

        //aplico thread para que no de error luego, hace pausa de 3seg para que pueda cargar la pagina
        Thread.sleep(3000);


        //localizar elemento en html
        By locatorBtnRegistrarte = By.xpath("//*[@id=\"body-secondary-btn\"]");

        //crear elemento web
        WebElement btnRegistrarte = locatorBtnRegistrarte.findElement(driver);

        //hacer click en boton
        btnRegistrarte.click();

        //aplico thread para que no de error luego, hace pausa de 3seg para que pueda cargar la pagina
        Thread.sleep(3000);

        // hago busqueda por id email y contraseña
        driver.findElement(By.id("email")).sendKeys("mailprueba33@saleono");

        driver.findElement(By.id("password")).sendKeys("121212Ab");

        // hago busqueda por nombre de repetir contraseña
        driver.findElement(By.name("password-confirm")).sendKeys("121212Ab");

        //boton registrar
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"btnRegister\"]")).click();
    }

   /* @Test
    public void CP_02_ErrorPasswordCrearUsuario() throws InterruptedException {
        //localizar elemento en html
        By locatorBtnMiClaro = By.xpath("//*[@id=\"content\"]/div[2]/li[1]/a");

        //crear elemento web
        WebElement btnMiClaro = driver.findElement(locatorBtnMiClaro);

        //hacer click en boton
        btnMiClaro.click();

        //aplico thread para que no de error luego, hace pausa de 3seg para que pueda cargar la pagina
        Thread.sleep(1000);


        //localizar elemento en html
        By locatorBtnRegistrarte = By.xpath("//*[@id=\"body-secondary-btn\"]");

        //crear elemento web
        WebElement btnRegistrarte = locatorBtnRegistrarte.findElement(driver);

        //hacer click en boton
        btnRegistrarte.click();

        //aplico thread para que no de error luego, hace pausa de 3seg para que pueda cargar la pagina
        Thread.sleep(1000);

        // hago busqueda por id email y contraseña
        driver.findElement(By.id("email")).sendKeys("mailprueba22@saleono");

        driver.findElement(By.id("password")).sendKeys("121212");


        String resultadoEsperado = corregirEncoding("La contraseña debe contener al menos 8 caracteres, una mayúscula, una minúscula.");

        WebElement textoMensaje = driver.findElement(By.xpath("//*[@id=\"password-help-text\"]"));

        String resultadoObtenido = textoMensaje.getText();

        Assertions.assertEquals(resultadoEsperado,resultadoObtenido);
    }

    public static String corregirEncoding( String textoIncorrecto){
        byte[] bytes =textoIncorrecto.getBytes(StandardCharsets.ISO_8859_1);
        String textoCorregido = new String (bytes, StandardCharsets.UTF_8);

        return textoCorregido;


    } */

    @Test
    public void CP_03_CancelarRegistracion() throws InterruptedException {
        //localizar elemento en html
        By locatorBtnMiClaro = By.xpath("//*[@id=\"content\"]/div[2]/li[1]/a");

        //crear elemento web
        WebElement btnMiClaro = driver.findElement(locatorBtnMiClaro);

        //hacer click en boton
        btnMiClaro.click();

        //aplico thread para que no de error luego, hace pausa de 3seg para que pueda cargar la pagina
        Thread.sleep(3000);


        //localizar elemento en html
        By locatorBtnRegistrarte = By.xpath("//*[@id=\"body-secondary-btn\"]");

        //crear elemento web
        WebElement btnRegistrarte = locatorBtnRegistrarte.findElement(driver);

        //hacer click en boton
        btnRegistrarte.click();

        //aplico thread para que no de error luego, hace pausa de 3seg para que pueda cargar la pagina
        Thread.sleep(3000);

        // hago busqueda por id email y contraseña
        driver.findElement(By.id("email")).sendKeys("mailprueb@saleono");

        driver.findElement(By.id("password")).sendKeys("121212Ab");

        // hago busqueda por nombre de repetir contraseña
        driver.findElement(By.name("password-confirm")).sendKeys("121212Ab");

        //boton registrar
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"btnRegister\"]")).click();

        //boton cancelar
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"reset-login\"]")).click();
    }

    @Test
    public void CP_04_IngresaTienda() throws InterruptedException {
        //localizar elemento en html
        By locatorBtnMiClaro = By.xpath("//*[@id=\"content\"]/div[2]/li[3]/a/h2");

        //crear elemento web
        WebElement btnMiClaro = driver.findElement(locatorBtnMiClaro);

        //hacer click en boton
        btnMiClaro.click();

        //aplico thread para que no de error luego, hace pausa de 3seg para que pueda cargar la pagina
        Thread.sleep(3000);


        //localizar elemento en html
        By locatorBtnComoComprar = By.xpath("//*[@id=\"content\"]/div[3]/div/div/button[4]/div/p[1]");

        //crear elemento web
        WebElement btnComoComprar = locatorBtnComoComprar.findElement(driver);

        //hacer click en boton
        btnComoComprar.click();

        //aplico thread para que no de error luego, hace pausa de 3seg para que pueda cargar la pagina
        Thread.sleep(3000);
    }
}


