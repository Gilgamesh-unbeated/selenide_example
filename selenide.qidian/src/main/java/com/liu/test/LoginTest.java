package com.liu.test;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static com.liu.utils.Constants.PASSWD;
import static com.liu.utils.Constants.USERNAME;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liu.parents.ParentTest;

public class LoginTest extends ParentTest
{
	
	@Test
	public void login() 
	{
		$(By.xpath("//*[@id=\"username\"]")).shouldBe(enabled).sendKeys(props.getProperty(USERNAME));
		$(By.xpath("//*[@id=\"password\"]")).shouldBe(enabled).sendKeys(props.getProperty(PASSWD));
		$(By.xpath("//*[@id=\"j-inputMode\"]/div[2]/a")).shouldBe(enabled).click();
	}

}
