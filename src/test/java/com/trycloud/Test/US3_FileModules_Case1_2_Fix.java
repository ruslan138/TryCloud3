package com.trycloud.Test;

import com.trycloud.Page.Dashboard;
import com.trycloud.Test.Base.TestBase;
import com.trycloud.Utilities.BrowserUtils;
import com.trycloud.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US3_FileModules_Case1_2 extends TestBase {
    Dashboard dashboard = new Dashboard();
    @Test
    public void file(){



        dashboard.files.click();

        String expected = "Files";

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expected));

    }

    @Test
    public void selectAll(){

        dashboard.files.click();

        BrowserUtils.explicitWaitClick(Driver.getDriver(),4,"//label[@for='select_all_files']");
        WebElement selectAll=  Driver.getDriver().findElement(By.xpath("//label[@for='select_all_files']"));

      selectAll.click();

      WebElement selected = Driver.getDriver().findElement(By.xpath("//tr[@data-id='5897']"));


      Assert.assertTrue(selected.isSelected());


    }
}
