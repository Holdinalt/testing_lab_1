import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
//hi
class SecondTaskModuleTests {

    @BeforeAll
    public static void setup(){
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", "./src/resources/chromedriver.exe");
        //создание экземпляра драйвера
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.cs.usfca.edu/~galles/visualization/BinomialQueue.html");
    }

    @Test
    public void openWindow(){
        Assertions.assertTrue(true);
    }

}
