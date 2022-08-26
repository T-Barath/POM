package com.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTesting {
	@Test
	@Parameters({"username","password"})
	private void credentials(String username, String password) {
		System.out.println("UserName="+username);
		System.out.println("Password="+ password);
	

	}

}
