import DTO.GSBLottoDTO;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Sorravit on 12/11/2559.
 * GSB Lotto Check
 */

public class GSBLottoCheck {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriverManager.getInstance().setup();
        System.out.println("PIZZA");
        WebDriver driver = new ChromeDriver();
        getGSBLottoResult(driver,new GSBLottoDTO("67","ค","2229504","2329503"));
    }
    private static void getGSBLottoResult(WebDriver driver, GSBLottoDTO gsbLottoDTO){
        driver.get("http://psc.gsb.or.th/PSCINQ/Welcome.do");
        WebElement element = driver.findElement(By.xpath("//ul/li[1]/label/span/a"));
        element.click();
        element = driver.findElement(By.xpath("//li[@class='Sht'][1]/div/input"));
        element.sendKeys(gsbLottoDTO.getFterm());
        element = driver.findElement(By.xpath("//li[@class='Sht'][2]/div/input"));
        element.sendKeys(gsbLottoDTO.getFgroup());
        element = driver.findElement(By.xpath("//li[@class='MarL']/div/input"));
        element.sendKeys(gsbLottoDTO.getFnumFrom());
        element = driver.findElement(By.xpath("//li[5]/div/input"));
        element.sendKeys(gsbLottoDTO.getFnumto());
        element = driver.findElement(By.xpath("//div[@class='BttnCheck']/input"));
        element.click();


    }
}
