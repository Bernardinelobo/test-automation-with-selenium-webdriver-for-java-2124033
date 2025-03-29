package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import setup.Main;

public class Challenge_CompleteForm extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    /*
     * TODO: add your solution here
     * Enter “username” in the Text input field 
     * Enter passw0rd in the Password field
     * Write “I am learning Selenium WebDriver” in the Textarea field
     * Select the Three option from the dropdown
     * Deselect Checked checkbox
     * Select Default checkbox
     * Select Default radio
     * And click the Submit button
     */ 

     //Enter “username” in the Text input field 
     WebElement userName = driver.findElement(By.id("my-text-id"));
     userName.sendKeys("Bernardine Lobo");

     //Enter passw0rd in the Password field
     WebElement password = driver.findElement(By.name("my-password"));
     password.sendKeys("Jesus");

    //Write “I am learning Selenium WebDriver” in the Textarea field
    WebElement textArea = driver.findElement(By.name("my-textarea"));
    textArea.sendKeys("I am learning Selenium");

    //Select the Three option from the dropdown
    Select dropdown = new Select(driver.findElement(By.name("my-select")));
    dropdown.selectByContainsVisibleText("Three");

    //Deselect Checked checkbox
    WebElement checkbox1 = driver.findElement(By.id("my-check-1"));
    Boolean isSelected = checkbox1.isSelected();
    if (isSelected)
    {
      checkbox1.click();
    }

    //Select Default checkbox
    WebElement checkbox2 = driver.findElement(By.id("my-check-2"));
    Boolean isSelected2 = checkbox2.isSelected();
    if(!isSelected2)
    {
      checkbox2.click();
    }

    //Select Default radio
    WebElement radioButton1 = driver.findElement(By.id("my-radio-2"));
    Boolean isSelected3 = radioButton1.isSelected();
    if (!isSelected3) {
      radioButton1.click();
    }
    //And click the Submit button
    driver.findElement(By.xpath("//Button[text()='Submit']")).click();

    //driver.quit();
  }
}