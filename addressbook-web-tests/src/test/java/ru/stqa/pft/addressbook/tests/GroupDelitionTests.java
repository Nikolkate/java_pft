package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;


public class GroupDelitionTests extends TestBase {


  @Test
  public void testGroupDelition() throws Exception {
    app.getNavigationManager().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }


}
