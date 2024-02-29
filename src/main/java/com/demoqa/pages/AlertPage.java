package com.demoqa.pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AlertPage extends BasePage {


  public AlertPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(id = "alertButton")
  WebElement alertButton;

  public AlertPage acceptAlert() {
    click(alertButton);
    driver.switchTo().alert().accept();
    return this;
  }

  @FindBy(id = "timerAlertButton")
  WebElement timeButton;

  public AlertPage clickByAlertWithTimer() {
    clickWithJs(timeButton, 0, 100);
    new WebDriverWait(driver, Duration.ofSeconds(5))
        .until(ExpectedConditions.alertIsPresent()).accept();
    return this;
  }

  @FindBy(id = "confirmButton")
  WebElement confirmButton;

  public AlertPage selectResult(String confirm) {
    clickWithJs(confirmButton, 0, 100);

    if (confirm != null && confirm.equals("Cancel")) {
      driver.switchTo().alert().dismiss();
    } else if (confirm != null && confirm.equals("ok")) {
      driver.switchTo().alert().accept();
    }

    return this;
  }

  @FindBy(id = "confirmResult")
  WebElement confirmResult;

  public AlertPage verifyResult(String result) {

    Assert.assertTrue(confirmResult.getText().contains(result));

    return this;
  }

  @FindBy(id = "promtButton")
  WebElement promtButton;

  public AlertPage sendMassageToAlert(String massage) {
    clickWithJs(promtButton, 0, 200);
    if (massage != null) {
      driver.switchTo().alert().sendKeys(massage);
      driver.switchTo().alert().accept();
    }
    return this;
  }

  @FindBy(id = "promptResult")
  WebElement promptResult;

  public AlertPage verifyMassage(String massage) {
    Assert.assertTrue(promptResult.getText().contains(massage));
    return this;
  }
}
