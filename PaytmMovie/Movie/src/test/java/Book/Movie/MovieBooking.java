package Book.Movie;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MovieBooking {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://paytm.com/movies/bengaluru");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		// Hindi
		driver.findElement(By.xpath("//*[@id=\"Hindi\"]")).click();
		Thread.sleep(2000);
		
		//Movie choice
		driver.findElement(By.xpath("//img[@alt='Zara Hatke Zara Bachke']")).click();
		Thread.sleep(6000);
		
		//date pick
		driver.findElement(By.xpath("(//div[@class='DatesDesktop_movieDateText__42vcO'])[4]")).click();
		Thread.sleep(2000);
		
		//Theatre
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]")).click();
		
	}

}
