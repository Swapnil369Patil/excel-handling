package pkg3.POM.Pages;

import org.openqa.selenium.By;

import pkg3.POM.Main.MainClass;

public class LoginPage extends MainClass{
	static By lnkRegister=By.linkText("SIGN-ON");
	static By txtUserName=By.name("userName");
	public static void login()	{
		driver.findElement(lnkRegister).click();
		driver.findElement(txtUserName).sendKeys("Rohit");
		driver.findElement(By.name("password")).sendKeys("Rohit");
		driver.findElement(By.name("login")).click();
	}
}
