package guvitasks2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAutomation {
    public static void main(String[] args) {
      

        // Initialize the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the jQueryUI droppable website
        driver.get("https://jqueryui.com/droppable/");

        // Switch to iframe that contains the drag-and-drop elements
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        // Locate the source and target elements
        WebElement sourceElement = driver.findElement(By.id("draggable"));
        WebElement targetElement = driver.findElement(By.id("droppable"));

        // Perform drag and drop operation
        Actions action = new Actions(driver);
        action.dragAndDrop(sourceElement, targetElement).perform();

        // Verify if the target element text has changed to "Dropped!"
        String targetText = targetElement.getText();
        if (targetText.equals("Dropped!")) {
            System.out.println("Drag and drop operation successful");
        } else {
            System.out.println("Drag and drop operation failed");
        }

        // Close the browser
        driver.quit();
    }
}

