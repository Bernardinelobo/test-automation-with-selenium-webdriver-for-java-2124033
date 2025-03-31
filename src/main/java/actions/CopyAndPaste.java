package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.interactions.Actions;

import setup.Main;

public class CopyAndPaste extends Main {
  
  public static void main(String[] args){
    driver.get("https://www.selenium.dev/selenium/web/formPage.html");
    var copyText = driver.findElement(By.id("withText"));
    var pasteText = driver.findElement(By.id("emptyTextArea"));
    Keys cmdctrl = Platform.getCurrent().is(Platform.WINDOWS) ? Keys.COMMAND : Keys.CONTROL;
    Actions action = new Actions(driver);
    action.click(copyText)
    .keyDown(cmdctrl)
    .sendKeys("a")
    .sendKeys("c")
    .keyUp(cmdctrl).perform();

    action.click(pasteText)
    .keyDown(cmdctrl)
    .sendKeys("v").perform();

    //driver.quit();
  }
}