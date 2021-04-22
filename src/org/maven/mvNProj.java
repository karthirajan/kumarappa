package org.maven;

import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mvNProj {
	public static WebDriver driver;
	@BeforeClass
	public static void launch(){
		String path = "E://Java_support_files//chromedriver_win32//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
	}
	@Before
	public void time(){
		Date h = new Date();
		System.out.println(h);
	}
	@Test
	public void url(){
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
	}
	
}
