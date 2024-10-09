package guvitasks2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class DatePickerAutomation {
    public static void main(String[] args) {
 

        // Initialize the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to the datepicker URL
        driver.get("https://jqueryui.com/datepicker/");

        // Switch to iframe that contains the datepicker
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        // Open the datepicker
        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.click();

        // Click on the next month button
        WebElement nextButton = driver.findElement(By.xpath("//a[@title='Next']"));
        nextButton.click();

        // Select date "22" from the datepicker
        WebElement dateToSelect = driver.findElement(By.xpath("//a[text()='22']"));
        dateToSelect.click();

        // Get the selected date
        String selectedDate = dateField.getAttribute("value");
        System.out.println("Selected date: " + selectedDate);

        // Close the browser
        driver.quit();
    }
}



