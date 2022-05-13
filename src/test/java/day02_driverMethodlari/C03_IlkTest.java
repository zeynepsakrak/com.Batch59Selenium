package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/direver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //1.https://www.amazon.com adresine gidin
        driver.get("https://www.amazon.com");
        //2. başlığın Amazon kelimesi içerdiğini kontrol edin
        String actualTitle= driver.getTitle();
        String arananKelime="Amazon";
        if (actualTitle.contains(arananKelime)){
            System.out.println("Title test PASSED");
        }else{
            System.out.println("Title"+arananKelime+"'yi içermiyor");
        }

        //3. url in https://www.amazon.com a eşit olup olmadığını kontrol edin
        String currentUrl= driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com";

    }
}
