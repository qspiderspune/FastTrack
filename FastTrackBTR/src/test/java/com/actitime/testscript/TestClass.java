package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;


@Listeners(com.actitime.generics.ListenersClass.class)
public class TestClass extends BaseClass{

	@Test
	public void testCreatNewTask() {
		//Assert.fail();
		Reporter.log("create new task",true );
		
	}

}   
