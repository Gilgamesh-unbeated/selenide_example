package com.liu.test;

import static com.codeborne.selenide.Selenide.*;
import static com.liu.utils.Constants.*;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import com.codeborne.selenide.WebDriverRunner;
import com.liu.parents.ParentTest;
import com.liu.utils.LogUtils;

public class BeforeTest extends ParentTest
{
	@Test
	public void openTaobao() 
	{
		LogUtils.info("启动浏览器，进入起点登录页面");
		setBrowserParams();
		open(props.get(URL).toString());
	}

	/**
	 * 初始化浏览器参数
	 */
	private void setBrowserParams()
	{
		System.setProperty("selenide.browser",WebDriverRunner.CHROME);
		System.setProperty("webdriver.chrome.driver",".\\\\driver\\\\chromedriver.exe");
		
	}

}
