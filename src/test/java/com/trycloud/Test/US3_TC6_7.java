package com.trycloud.Test;

import com.trycloud.Page.Dashboard;
import com.trycloud.Test.Base.TestBase;
import com.trycloud.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US3_TC6 extends TestBase {

    @Test
    public void createFolder(){

        Dashboard dashboard = new Dashboard();

        dashboard.files.click();

        dashboard.addFile.click();

        dashboard.newFolder.click();

        dashboard.folderName.sendKeys("Ruslan K Folder", Keys.ENTER);

        WebElement dog = Driver.getDriver().findElement(By.xpath("//span[@class='nametext']//span[.='Ruslan K Folder']"));

        Assert.assertTrue(dog.isDisplayed());
    }


}
