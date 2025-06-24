package Javatesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMapsSearch {
    public static void main(String[] args) {
        // Set path to your ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Launch a new Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to Google Maps
        driver.get("https://www.google.com/maps");

        // Give the page a moment to load
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Locate the search box and enter the apartment name
        WebElement searchBox = driver.findElement(By.id("searchboxinput"));
        searchBox.sendKeys("Bailey Creek Apartments");

        // Click the search button
        WebElement searchButton = driver.findElement(By.id("searchbox-searchbutton"));
        searchButton.click();

        // Optional: wait and close after a few seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}