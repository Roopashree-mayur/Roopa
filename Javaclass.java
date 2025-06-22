package Javatesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javaclass {
public static void main(String[] args) {
	System.out.println("Hi Welcome to Java");
	WebDriver driver = new ChromeDriver ();
	driver.get("Https://google.com");
}
	
}
