
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Script3 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver","C:\\Users\\M1077455\\edgedriver_win64\\msedgedriver.exe");
EdgeDriver edgeDriver = new EdgeDriver();
edgeDriver.get("https://www.savaari.com/");
edgeDriver.findElement(By.cssSelector(".bg-airport")).click();
edgeDriver.findElement(By.id("fromCityList")).sendKeys("Bangalore");
Thread.sleep(1000);
edgeDriver.findElement(By.id("fromCityList")).sendKeys(Keys.ENTER);
edgeDriver.findElement(By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid.ng-star-inserted")).click();
edgeDriver.findElement(By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid.ng-star-inserted")).sendKeys(Keys.ARROW_DOWN);
edgeDriver.findElement(By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid.ng-star-inserted")).sendKeys(Keys.ENTER);
edgeDriver.findElement(By.id("search_places")).click();
Thread.sleep(200);
edgeDriver.findElement(By.id("search_places")).sendKeys("Banashankari");
Thread.sleep(1000);
edgeDriver.findElement(By.cssSelector(".book-button.btn")).click();
Thread.sleep(1000);
edgeDriver.findElement(By.id("search_places")).click();
Thread.sleep(1000);
edgeDriver.findElement(By.id("search_places")).sendKeys(Keys.ARROW_DOWN);
Thread.sleep(1000);
edgeDriver.findElement(By.id("search_places")).sendKeys(Keys.ENTER);
Thread.sleep(500);
edgeDriver.findElement(By.cssSelector(".book-button.btn")).click();

}
}