package ru.stqa.pft.addressbook.test;


import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.*;


public class GroupDeletionTests extends TestBase {

  
private String baseUrl;
  
private boolean acceptNextAlert = true;
  
private StringBuffer verificationErrors = new StringBuffer();



  
@Test
  public void testGroupDeletion()
         
 throws Exception {

    selectGroup();
   
 deleteSelectedGroups();
   
 returnToGroupPage();
 
 }

  private void returnToGroupPage()
 {
    applicationManager.driver.findElement(By.linkText("group page")).click();
  }

  private void deleteSelectedGroups() {
    applicationManager.driver.findElement(By.name("delete")).click();
  }

  private void selectGroup() {
    selectGroup(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='kate2'])[1]/input[1]"));
  }

  private void selectGroup(By xpath) {
    applicationManager.driver.findElement(xpath).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    applicationManager.driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      applicationManager.driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      applicationManager.driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = applicationManager.driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
