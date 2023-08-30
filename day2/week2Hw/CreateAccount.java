package week2Hw;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();           
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sai");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Tawker");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("0123456");
	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("crmsfa");
	
	WebElement dateofbirthDOB = driver.findElement(By.id("day"));
	Select sec = new Select(dateofbirthDOB);
	sec.selectByValue("7");
	
	WebElement dateofbirthDOB1 = driver.findElement(By.id("month"));
	Select sec1 = new Select(dateofbirthDOB1);
	sec1.selectByVisibleText("May");
	
	WebElement dateofbirthDOB2 = driver.findElement(By.id("year"));
	Select sec2 = new Select(dateofbirthDOB2);
	sec2.selectByValue("2017");
	
	driver.findElement(By.xpath("//input[@name='sex']")).click();
	}
	}
