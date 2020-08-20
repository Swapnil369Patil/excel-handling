package pkg3.POM.Pages;

import org.openqa.selenium.By;

import pkg3.POM.Main.MainClass;


public class RegisterPage extends MainClass{
	static By lnkRegister=By.linkText("REGISTER");
	static By txtFirstName=By.name("firstName");
	
	public static void registerUser()	{
		driver.findElement(lnkRegister).click();
		driver.findElement(txtFirstName).sendKeys("Rohit");
	}
}
