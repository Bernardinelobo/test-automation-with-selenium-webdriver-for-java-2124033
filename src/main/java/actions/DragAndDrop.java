package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import setup.Main;

public class DragAndDrop extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/draggableLists.html");
    var leftItem = driver.findElement(By.id("leftitem-1"));
    var rightItem = driver.findElement(By.id("rightitem-1"));
    new Actions(driver).dragAndDrop(leftItem, rightItem).perform();

    var rightItems = driver.findElements(By.cssSelector("#sortable2 li"));
   // rightItems.forEach(e -> System.out.println(e.getText()));
   // or above code line can also be written as below for loop
   for (WebElement e : rightItems)
   {
    System.out.println(e.getText());
   }
   
    //driver.quit();
  }
}