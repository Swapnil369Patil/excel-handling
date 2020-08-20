package pkg3.POM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pkg3.POM.Main.MainClass;

public class HomePage extends MainClass{
	
	static WebDriver driver;
	public static void launchApp()	{
		driver=new FirefoxDriver();
		driver.get("http://localhost/servlets/com.mercurytours.servlet.WelcomeServlet");
	}
	
	public static void login()	{
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("Rohit");
		driver.findElement(By.name("password")).sendKeys("Rohit");
		driver.findElement(By.name("login")).click();
	}
	public static void CloseApp(){
		driver.close();
	}
}
