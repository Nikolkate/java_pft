package ru.stqa.pft.addressbook.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

import static org.testng.Assert.fail;

public class TestBase {

  protected final ApplicationManager applicationManager = new ApplicationManager();

  @BeforeClass(alwaysRun = true)
  public void setUp() {
    applicationManager.init();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    applicationManager.stop();
    String verificationErrorString = applicationManager.verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

}
