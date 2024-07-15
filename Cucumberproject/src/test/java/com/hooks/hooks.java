package com.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks 
{
	
	@Before(order=2)
public void launch()
{
	System.out.println("launching successfully");
}
	@Before(order=1)
	public void beforelaunch()
	{
		System.out.println("launch the browser");
	}
	@After(order=2)
public void end()
{
	System.out.println("end the website");
}
	@After(order=1)
	public void quit()
	{
		System.out.println("quit the browser");
	}
}
