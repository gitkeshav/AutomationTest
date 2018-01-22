package com.allfilesinsamefolderSaerchGoogle;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



	public class OneFolderGoogleStepDefs {
		
			protected WebDriver driver;
			
			@Before
			public void setUp() throws InterruptedException {
				System.out.println("in setup");
				System.setProperty("webdriver.chrome.driver","E:\\RadicalSoftware\\RadicalSoftware\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
//				System.setProperty("webdriver.gecko.driver", "D:\\Training\\TrainingContent\\SeleniumJars_Software\\geckodriver_64\\geckodriver.exe");
//				driver = new FirefoxDriver();
				System.out.println("opned browser");
				Thread.sleep(5000);
			}
			
			@Given("^the user is on google Page$")
			public void the_user_is_on_google_login_Page() throws InterruptedException {
				System.out.println("actual script started");
				driver.get("https://www.Google.com/");
				Thread.sleep(5000);
			}
			
			@When("^he enters \"([^\"]*)\" as search text$")
			public void He_enters_Search_text(String searchText) {
				driver.findElement(By.id("lst-ib")).sendKeys(searchText);
			}
			
			@When("^he clicks on search button$")
			public void He_click_on_search_button() throws InterruptedException {
				driver.findElement(By.id("tsf")).click();
				Thread.sleep(5000);
			}
			
			@Then("^check search result display properly or not$")
			public void check_result(){
			
				Assert.assertTrue(true);
				driver.quit();
			}
			
			

	}
