import DTO.GSBLottoDTO;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.PublicKey;

/**
 * Created by Sorravit on 12/11/2559.
 */
public class GSBLottoCheck {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriverManager.getInstance().setup();
        System.out.println("PIZZA");
        WebDriver driver = new ChromeDriver();
        getGSBLottoResult(driver,new GSBLottoDTO("67","ค","2229504","2329503","01","2559","12","2559","17","12"));
//        sendPost(new GSBLottoDTO("67","%A4","2229504","2329503","01","2559","12","2559","17","12"));
//        testGoogleSearch(driver);
    }
public static void getGSBLottoResult(WebDriver driver,GSBLottoDTO gsbLottoDTO){
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
    public static void testGoogleSearch(WebDriver driver) throws InterruptedException {
        driver.get("http://www.google.com");
        Thread.sleep(1000); // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        Thread.sleep(1000); // Let the user actually see something!
        driver.quit();
    }
    private static boolean sendPost(GSBLottoDTO gsbLottoDTO) {
        try {
            String url = "http://psc.gsb.or.th/PSCINQ/actions/checkPsc.do";
            URL obj = new URL(url);
//            HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("POST");
            String urlParameters = "fterm=" + gsbLottoDTO.getFterm() +
                    "&fgroup=" + gsbLottoDTO.getFgroup() +
                    "&fnumFrom=" + gsbLottoDTO.getFnumFrom() +
                    "&fnumto=" + gsbLottoDTO.getFnumto() +
                    "&fmonthFrom=" + gsbLottoDTO.getFmonthFrom() +
                    "&fyearFrom=" + gsbLottoDTO.getFyearFrom() +
                    "&fmonthto=" + gsbLottoDTO.getFmonthto() +
                    "&fyearto=" + gsbLottoDTO.getFyearto() +
                    "&x=" + gsbLottoDTO.getX() +
                    "&y=" + gsbLottoDTO.getY();
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(urlParameters);
            wr.flush();
            wr.close();

            int responseCode = con.getResponseCode();
            System.out.println("\nSending 'POST' request to URL : " + url);
            System.out.println("Post parameters : " + urlParameters);
            System.out.println("Response Code : " + responseCode);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null)

            {
                response.append(inputLine);
            }
            in.close();
            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
