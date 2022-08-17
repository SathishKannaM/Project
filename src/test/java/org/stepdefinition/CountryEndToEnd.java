package org.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pom.counry.LoginPage;
import org.test.baseclass.BaseClass;

import io.cucumber.java.en.*;

public class CountryEndToEnd extends BaseClass {

	LoginPage l;

	@Given("To user Should Open browser then sent url launch")
	public void to_user_Should_Open_browser_then_sent_url_launch() {
		 browsers("Chrome");
//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\welcome\\Documents\\Project\\SeleniumFirstDay\\Browser\\geckodriver.exe");
//		driver = new FirefoxDriver();
		impWait(20);
		urlLaunch("https://www.countryroad.com.au/");
		l = new LoginPage();
		click(l.getClose());
	}

	@When("The user click Login page and {string}and{string}")
	public void the_user_click_Login_page_and_and(String User, String Pass) {

		click(l.getLoginBtn());
		sendKeys(l.getEmail(), User);
		sendKeys(l.getPass(), Pass);

	}

	@When("The User click sigin button")
	public void the_User_click_sigin_button() {
		click(l.getSigninbtn());
	}

	@When("The user After Move to elament  Men or wonman etc After click casual Shoes Product")
	public void the_user_After_Move_to_elament_Men_or_wonman_etc_After_click_casual_Shoes_Product()
			 {
		moveToElementAction(l.getMen());
		waits(l.getShoes());
//		WebDriverWait w=new WebDriverWait(driver,50);
//		w.until(ExpectedConditions.visibilityOf(l.getShoes()));
		click(l.getShoes());
	}

	@When("The user navigate to this page and Select method Price Range int{int} low to high")
	public void the_user_navigate_to_this_page_and_Select_method_Price_Range_int_low_to_high(Integer int1)
			 {
//		selectByIndex(l.getPricerange(), 2);
		
	}

	@When("then show the list of  product get intex first or last product")
	public void then_show_the_list_of_product_get_intex_first_or_last_product() throws InterruptedException {
		waits(l.getListofProduct().get(0));
//		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", l.getListofProduct().get(3));
//		click(l.getListofProduct().get(3));
	}

	@When("Navigate then clour and no of sent nno qty ad use select method size")
	public void navigate_then_clour_and_no_of_sent_nno_qty_ad_use_select_method_size()  {
//		waits(l.getClour());
//		click(l.getClour());

		waits(l.getSize());
		selectByVisibleText(l.getSize(), "42");
	
		sendKeys(l.getQty(), "2");

	}

	@When("after click AddToBag after Checkout")
	public void after_click_AddToBag_after_Checkout()  {
		click(l.getAddtoBag());
		waits(l.getCheckout());
		click(l.getCheckout());
		click(l.getCheckout1());
		waits(l.getEditOder());
		click(l.getEditOder());
		click(l.getRemove());
		
		quit();
	}

}
