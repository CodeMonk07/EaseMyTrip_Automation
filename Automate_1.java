import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class Automate_1 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/Users/aneesh_singh/Desktop/Selenium/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.easemytrip.com/flights.html");
			
			driver.findElement(By.xpath("//input[@id='ddate']")).click();
			Thread.sleep(500);
			String flag = "False";
			while(flag=="False") {
				if(driver.findElements(By.xpath("//li[@id='fst_3_01/02/2023']")).size()>0) {
					driver.findElement(By.xpath("//li[@id='fst_3_01/02/2023']")).click();
					flag = "True";
					Thread.sleep(500);
				}
				else {
					Thread.sleep(500);
					driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
				}

			
			}
			System.out.println("Successful");
			driver.close();		
		}
	}
	
	
