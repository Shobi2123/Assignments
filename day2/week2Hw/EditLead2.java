package week2Hw;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();

   //to enter the username, obj.findthe element for locatoer(abs class id(att.value).pass the keys using the sendkeys elt
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	//click CRM/SFA
	driver.findElement(By.partialLinkText("CRM")).click();
	//click leads
	driver.findElement(By.partialLinkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	
	//enter the first name
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("sai");
	
	//find the lead in the dashboard
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	
	//click on the first resulting lead and print the title
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	System.out.println("The Title of the reulting page is: " +driver.getTitle());
	//click edit
	driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
	//clear the old compny name and update the new name and click update
	driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
	driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Cognizant");
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
   
	// To verify the companyname has been updated
	
	String verifyText = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
	if(verifyText.contains("Cognizant")) {
		System.out.println("The companyname name has been updated");
	}else {
		System.out.println("The companyname has not been updated");
	}
	//close the webpage
	driver.close();
}
}
