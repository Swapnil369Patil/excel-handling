package pkg3.POM.Main;

import org.openqa.selenium.WebDriver;

import pkg3.POM.Pages.LoginPage;
import pkg3.POM.Pages.RegisterPage;
import pkg3.POM.Pages.HomePage;



public class MainClass {
	public static WebDriver driver;
	public static void main(String[] args) {
		HomePage.launchApp();
		RegisterPage.registerUser();
		LoginPage.login();
//		HomePage.CloseApp();
	}
}
