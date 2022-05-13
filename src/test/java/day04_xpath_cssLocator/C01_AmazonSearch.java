package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearch {
    /*
   Tekrar Testi
1. Bir class oluşturun : AmazonSearchTest
2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
a. web sayfasına gidin. https://www. amazon.com/
b. Search(ara) “city bike”
c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
    */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/direver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //  a.web sayfasına gidin "https://www.amazon.com/"
        driver.get("https://www.amazon.com/");

        //b. Search(ara) “city bike”
        WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);

        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın

        List<WebElement> istenenElementListesi = driver.findElements(By.className("sg-col-inner"));
        WebElement istenen= istenenElementListesi.get(0);
        System.out.println("sayfadaki result sayısı: " +istenen.getText());

        //d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

        List<WebElement>  ilkUrunResmi= driver.findElements(By.className("s-image"));
        WebElement ilkUrun= ilkUrunResmi.get(0);
        ilkUrun.click();
    }
}
