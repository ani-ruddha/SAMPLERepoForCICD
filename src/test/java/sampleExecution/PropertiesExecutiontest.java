package sampleExecution;

import org.testng.annotations.Test;

import generic.PropertiesUtility;

public class PropertiesExecutiontest {

	@Test
	public void fetchData() throws Exception
	{
		PropertiesUtility PUTIL = new PropertiesUtility();
		String USERNAME =PUTIL.getDataFromProperties("username");
		String PASSWORD = PUTIL.getDataFromProperties("password");
		
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
}
