package com.liu.test;

import org.testng.annotations.Test;

import com.liu.parents.ParentTest;

public class AfterTest extends ParentTest
{
	@Test
	public void waits() 
	{
		sleep(5);
		
	}

}
