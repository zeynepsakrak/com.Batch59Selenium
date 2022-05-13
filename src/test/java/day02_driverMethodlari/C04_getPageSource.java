package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPageSource {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/direver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        String sayfaKaynakKodlari=driver.getPageSource();
        String arananKelime="Gateway";
        if (sayfaKaynakKodlari.contains(arananKelime)){
            System.out.println("Kaynal kodu testi PASSED");
        }else {
            System.out.println("Kaynak kodlarında "+arananKelime+" yoktur");
        }

        driver.close();
    }
}
