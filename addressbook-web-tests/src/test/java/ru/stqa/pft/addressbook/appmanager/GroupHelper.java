package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {

  public GroupHelper(WebDriver driver) {
    super(driver);
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
    type("group_name", By.name("group_name"), groupData.getName());
    type(null, By.name("group_header"), groupData.getHeader());
    type(null, By.name("group_footer"), groupData.getFooter());
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void deleteSelectedGroups() {
    click(By.name("delete"));
  }

  public void selectGroup() {
    selectGroup(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='kate2'])[1]/input[1]"));
  }

  private void selectGroup(By xpath) {
    click(xpath);
  }
}
