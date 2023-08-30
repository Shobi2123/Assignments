package week2Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
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
	driver.findElement(By.partialLinkText("Contacts")).click();
	driver.findElement(By.linkText("Create Contact")).click();
	//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("COGNIZANT TECHNOLOGY SOLUTIONS");
    driver.findElement(By.id("firstNameField")).sendKeys("SAI");
    driver.findElement(By.id("lastNameField")).sendKeys("TAWKER");
    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sai");
    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("T");
    driver.findElement(By.id("createContactForm_departmentName")).sendKeys("FINANCE");
    driver.findElement(By.id("createContactForm_description")).sendKeys("Very motivated and hardworking person");
    driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abc.efg@gmail.com");
    
    //select dropdown NY for the state
    WebElement stateDD = driver.findElement	(By.id("createContactForm_generalStateProvinceGeoId"));
    Select sec = new Select(stateDD);
    sec.selectByVisibleText("New York");
    
    driver.findElement(By.className("smallSubmit")).click();
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.name("description")).clear();
    driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Please do read the T & C's before joing and acknowledgment needed");
    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
    String title=driver.getTitle();
    System.out.println("The title of the landing page:" +title);

}
}
