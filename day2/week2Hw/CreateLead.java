package week2Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();

   //to enter the username, obj.findthe element for locatoer(abs class id(att.value).pass the keys using the sendkeys elt
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	//click CRM/SFA
	driver.findElement(By.partialLinkText("CRM")).click();
	driver.findElement(By.partialLinkText("Leads")).click();
	driver.findElement(By.partialLinkText("Create")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("COGNIZANT TECHNOLOGY SOLUTIONS");
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SAI");
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("TAWKER");
    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sai");
    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("FINANCE");
    driver.findElement(By.id("createLeadForm_description")).sendKeys("Very motivated and hardworking person");
    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc.efg@gmail.com");
    
    //select dropdown NY for the state
    WebElement stateDD = driver.findElement	(By.id("createLeadForm_generalStateProvinceGeoId"));
    Select sec = new Select(stateDD);
    sec.selectByVisibleText("New York");
    
    driver.findElement(By.className("smallSubmit")).click();
    String title=driver.getTitle();
    System.out.println("The title of the landing page:" +title);
	}
}
