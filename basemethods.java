package org.testingconcepts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basemethods 

{
	public static WebDriver driver;
	
public static WebDriver launchdriver()

{
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	return driver;// return type for driver we need to access driver to other class as well.
}


public static void launchurl(String url)

{
	driver.get(url);
	}


public static void maxiwin() 
{
	driver.manage().window().maximize();
}
public static void locateandinput(WebElement element,String input)
{
element.sendKeys(input);
	
}

public static void click(WebElement element)
{
	element.click();
}

public static void impliwait()
{
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}

public static void close()
{
	driver.close();
}
}
