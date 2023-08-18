package selenium.login;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String args[]) {
		
	System.setProperty("webdriver.chrome.driver", "./src/driver/chromedriver.exe");	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://ultimateqa.com/filling-out-forms/");
	driver.findElementByXPath("//*[@id='et_pb_contact_name_1']").sendKeys("Light Yagami");
	driver.findElementByXPath("//*[@id='et_pb_contact_message_1']").sendKeys("In Human Society, There Are Very Few People Who Truly Trust Each Other.");
	driver.findElementByXPath("//*[@id=\"et_pb_contact_form_1\"]/div[2]/form/div/div/p/input").sendKeys("10");
	driver.findElementByXPath("//*[@id=\"et_pb_contact_form_1\"]/div[2]/form/div/button").click();
//	 driver.get("https://courses.ultimateqa.com/collections");
//	 driver.findElementByXPath("//*[@id=\"main-content\"]/div/div[2]/ul/li[1]").click();
//	 driver.findElementByXPath("//*[@id=\"main-content\"]/section[1]/div/div/article/div/div/a").click();
//	 driver.findElementByXPath("//*[@type='email']").sendKeys("kshitijupmanyuas_ece19@its.edu.in");
//	 driver.findElementByXPath("//*[@type='password']").sendKeys("Kshitij_01");
//	 driver.findElementByXPath("//*[@type='submit']").click();
//	 driver.findElementByXPath("//*[@id=\"ap_email\"]").sendKeys("");
//	 driver.findElementByXPath("//*[@id=\"continue\"]").click();
//	 driver.findElement(By.xpath("//*[@type='password']")).sendKeys("");
//	 driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
	 
}}
