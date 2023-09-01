package week2Hw;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
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
	
	//create leads
	//driver.findElement(By.linkText("Create Lead")).click();
	
	//enter the company name,first name,last name, email id,ph number
	//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
	//driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saurabh");
	//driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Patak");
	//driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc.xyz@gmail.com");
	
	//Click on Create Button
	//driver.findElement(By.className("smallSubmit")).click();
	
	
	//click findleads
	driver.findElement(By.linkText("Find Leads")).click();
	
	//click email
	driver.findElement(By.xpath("//span[text()='Email']")).click();
	
	//enter email
	driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("abc.xyz@gmail.com");
	
	//click on findleads
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	
	//capture first lead
		String LeadName = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
		System.out.println("The name of the Lead: " +LeadName);
		
		
	//click on the first resulting lead
    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	
	
	//duplicate the leadid
    driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
    
    //verify the title as duplicate lead
    System.out.println("The Title of the Resulting Page is:" + driver.getTitle());
    
    //click create lead
   driver.findElement(By.xpath("//input[@name='submitButton']")).click();
   
   //capture the name of the duplicate lead
   String DuplicateID = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
   System.out.println("The name of the duplicate lead name: " +DuplicateID);
  
   if(DuplicateID.equals(LeadName)) {
  System.out.println("The actual name and duplicate ID matches");
   }
   
   else {
	  System.out.println("No matches found");
   }
   driver.close();
  	
	
	}

}
