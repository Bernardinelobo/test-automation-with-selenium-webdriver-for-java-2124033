package browser_interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import setup.Main;

public class Modals extends Main {

  public static void main(String[] args){
    driver.get("https://www.selenium.dev/selenium/web/modal_dialogs/modern_modal.html");
    driver.findElement(By.id("trigger-modal-btn")).click();

    WebElement modal = driver.findElement(By.id("modalContent"));
    if(modal.isDisplayed())
    {
    System.out.println("Modal is displayed successfully");
    driver.findElement(By.id("modal-input")).sendKeys("Hi modal");
    driver.findElement(By.id("modal-close")).click();
    }
    else{
      System.out.println("Modal is not displayed");
    }
       //driver.quit();
  }
}