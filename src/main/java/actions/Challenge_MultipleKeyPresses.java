package actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.interactions.Actions;

import setup.Main;

public class Challenge_MultipleKeyPresses extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/keyboard_shortcut.html");
    Keys cmdctrl = Platform.getCurrent().is(Platform.WINDOWS) ? Keys.COMMAND : Keys.CONTROL;
    Keys cmdshft = Platform.getCurrent().is(Platform.WINDOWS) ? Keys.COMMAND : Keys.SHIFT;
    Actions action = new Actions(driver);
    action
    .keyDown(cmdctrl)
    .keyDown(cmdshft)
    .sendKeys("1")
    .keyUp(cmdctrl)
    .keyUp(cmdshft)
    .perform();

   // driver.quit();
  }
}