import DTO.GSBLottoDTO;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Sorravit on 12/11/2559.
 * GSB Lotto Check
 */

public class GSBLottoCheck {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        ChromeDriverManager.getInstance().setup();
        WebDriver driver = new ChromeDriver();
        System.setIn(new FileInputStream("GSBData.txt"));
        System.setOut(new PrintStream(new FileOutputStream("Result.html")));
        System.out.print("<head><meta http-equiv='Content-Type' content='text/html; '><title>ผลสลากออมสินพิเศษของทุกคน</title><link href='http://psc.gsb.or.th/PSCINQ/css/gsb-lottery.css' rel='stylesheet' type='text/css'></head><Body>  <div class='Wrapper'><div id='Results'>");
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            StringTokenizer st = new StringTokenizer(in.nextLine(), ",");
        getGSBLottoResult(driver,new GSBLottoDTO(Integer.parseInt(st.nextToken()),st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken()));
        }
        System.out.print("</div></div></body>");
        driver.get("C:\\Users\\Sorravit\\IdeaProjects\\GSB-Check\\Result.html");
    }
    private static void getGSBLottoResult(WebDriver driver, GSBLottoDTO gsbLottoDTO){
        driver.get("http://psc.gsb.or.th/PSCINQ/Welcome.do");
        WebElement element;
        if(gsbLottoDTO.getType()==3) {
            element = driver.findElement(By.xpath("//li[1]/label/span/a"));
        }else{
            element = driver.findElement(By.xpath("//li[2]/label/span/a"));
        }
        element.click();
        element = driver.findElement(By.xpath("//li[@class='Sht'][1]/div/input"));
        element.sendKeys(gsbLottoDTO.getFterm());
        element = driver.findElement(By.xpath("//li[@class='Sht'][2]/div/input"));
        element.sendKeys(gsbLottoDTO.getGroup());
        element = driver.findElement(By.xpath("//li[@class='MarL']/div/input"));
        element.sendKeys(gsbLottoDTO.getNumFrom());
        element = driver.findElement(By.xpath("//li[5]/div/input"));
        element.sendKeys(gsbLottoDTO.getNumTo());
        element = driver.findElement(By.xpath("//div[@class='BttnCheck']/input"));
        element.click();
        System.out.print("<div class=\"Header\">");
        element = driver.findElement(By.className("Header"));
        System.out.print(
                element.getAttribute("innerHTML").substring(0,element.getAttribute("innerHTML").indexOf("<span>"))+" ของ "+gsbLottoDTO.getOwner()+element.getAttribute("innerHTML").substring(element.getAttribute("innerHTML").indexOf("<span>"))
        );
        System.out.print("</div><div class=\"Body\">");
        element = driver.findElement(By.className("Body"));
//        System.out.print(element.getText());
        System.out.print(element.getAttribute("innerHTML"));
        System.out.print("</div>");

//        driver.close();


    }
}
