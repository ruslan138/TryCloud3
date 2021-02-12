package com.trycloud.Test;

import com.trycloud.Page.LoginPage;
import com.trycloud.Test.Base.TestBase;
import com.trycloud.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class US2_TC1  extends TestBase {
 LoginPage loginPage =new LoginPage();
    @Test
    public void modules(){


     Driver.getDriver().findElement(By.xpath("//ul[@id='appmenu']//li[@data-id='files']")).click();




    }
}
