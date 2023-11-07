package Automation;

import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonfirst {


	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeOptions cop = new ChromeOptions();

		cop.addArguments("--allow-running-insecure-content");

		WebDriver driver = new ChromeDriver(cop);
		driver.get("https://www.amazon.in/gp/css/homepage.html/ref=nav_bb_ya");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8919447290");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Faizan786@");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("fire-boltt quantum luxury stainless steel design");
		String parent=driver.getWindowHandle();

		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Fire-Boltt Quantum Luxury Stainless Steel Design 1.28\" Bluetooth Calling Smartwatch with High Resolution of...']")).click();
		Thread.sleep(3000);

		
	
	   Set<String> child=driver.getWindowHandles();

	   for (String child1:child)
	     {
		if(!child1.equals(parent))
		{
		driver.switchTo().window(child1);
		System.out.println(driver.switchTo().window(child1).getTitle());
		
		Thread.sleep(3000);
		//System.out.println(driver.switchTo().window(child_window).getTitle());
		String Brand1=driver.findElement(By.xpath("//span[@class='a-size-base po-break-word'][normalize-space()='Black Red']")).getText();
		System.out.print(Brand1);
		System.out.print("------------");
		//Thread.sleep(3000);
		String Brandname=driver.findElement(By.xpath("//span[@class='a-size-base po-break-word'][normalize-space()='Fire-Boltt']")).getText();
		System.out.println(Brandname);
		String colorname=driver.findElement(By.xpath("//span[@class='a-size-base po-break-word'][normalize-space()='Black Red']")).getText();
		System.out.println(colorname);
	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement qty=driver.findElement(By.xpath("//select[@id='quantity']"));
		Select qtydropdown= new Select(qty);
	    qtydropdown.selectByValue("4");
	    driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	    driver.findElement(By.id("attach-close_sideSheet-link")).click();
	    driver.findElement(By.id("nav-logo-sprites")).click();
	    driver.findElement(By.xpath("//a[normalize-space()='Electronics']")).click();
	    //driver.findElement(By.xpath("//span[@class='nav-a-content'][normalize-space()='Mobiles & Accessories']")).click();
	 
	    WebElement mainMenu = driver.findElement(By.xpath("//span[@class='nav-a-content'][normalize-space()='Mobiles & Accessories']"));

	
	    Actions actions = new Actions(driver);
         actions.moveToElement(mainMenu).perform();

	    //actions.click().build().perform();
	    driver.findElement(By.linkText("Apple")).click();
	    //driver.close();
	    //driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("apple");
	    //driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    //driver.quit();
		
		}


	}

}
}

