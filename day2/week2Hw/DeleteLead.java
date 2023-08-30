package week2Hw;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class DeleteLead {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

   //to enter the username, obj.findthe element for locator(abs class id(att.value).pass the keys using the sendkeys elt
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	//click CRM/SFA
	driver.findElement(By.partialLinkText("CRM")).click();
	//click leads
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	
	//click on Phone nd enter the ph number
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("91");
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9952666699");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();	
	
	Thread.sleep(2000);
	//capture lead id of first resulting lead
	String LeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	System.out.println("The Deleted Lead ID is: " +LeadID);
	
	//click first resulting leadid
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	
	//delete the first LEADID
	driver.findElement(By.xpath("//a[text()='Delete']")).click();
	
	//click findleads
	driver.findElement(By.linkText("Find Leads")).click();
	
	//enter captured leadID
	driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys("LeadID");
	
	//enter findleads
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
	
	//to verify and display the deleted msg
	String TextDelete = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
	if(TextDelete.contains("No records to display")) {
		
		System.out.println("The Lead has been deleted");
	}else {
		System.out.println("The Lead has not been deleted");
	}
	//close the webpage
	driver.close();
}
}

