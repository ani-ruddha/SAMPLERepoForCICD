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
		String URL = PUTIL.getDataFromProperties("url");
		System.out.println("welcome");
		System.out.println("most welcome");
		System.out.println("abcxyz");
		System.out.println("welcome back bhargav!!");
		
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println(URL);
	}
}
