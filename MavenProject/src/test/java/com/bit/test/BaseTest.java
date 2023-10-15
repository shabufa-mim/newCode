package com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.db.ReadFile;

public class BaseTest {
 
	WebDriver dr;
	Properties prop;
	@Before
	public void openBrowser() throws IOException {
	prop =	ReadFile.readfile("C:\\Users\\shabu\\eclipse-workspace\\MavenProject\\Project.proparties");
	String s = prop.getProperty("Browser");
	
	if(s.equals("Chrome")) {
		dr = new ChromeDriver();
	}else if(s.equals("FireFox")) {
		dr = new FirefoxDriver();
	}else if(s.equals("Safari")) {
		dr = new SafariDriver();
	}
	
	dr.get(prop.getProperty("url"));
	
	}
	
	
}
