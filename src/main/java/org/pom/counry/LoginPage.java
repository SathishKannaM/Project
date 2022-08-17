package org.pom.counry;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//button[@type='button'])[20]")
	private WebElement close;
	@FindBy(id = "header-account-link")
	private WebElement LoginBtn;
	@FindBy(xpath = "(//input[@name='emailaddress'])[1]")
	private WebElement Email;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement Pass;
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement Signinbtn;
	@FindBy(xpath = "(//a[contains (text(),'Man')]//parent::li)[1]")
	private WebElement Men;
	@FindBy(xpath = "(//a[contains (text(),'Woman')]//parent::li)[1]")
	private WebElement Woman;
	@FindBy(xpath = "(//a[contains (text(),'Teen')]//parent::li)[1]")
	private WebElement Teen;
	@FindBy(xpath = "(//a[contains (text(),'Home')]//parent::li)[1]")
	private WebElement Home;
	@FindBy(xpath = "(//a[contains (text(),'Gifting')]//parent::li)[1]")
	private WebElement Gifting;
	@FindBy(xpath = "//a[@class='cat_162044']")
	private WebElement Shoes;
	@FindBy(xpath = "//select[@id='catorder']")
	private WebElement pricerange;
	@FindBy(xpath = "//a[@class='product_link']")
	private List<WebElement> ListofProduct;
	@FindBy(xpath = "//img[@title='Light Grey']//parent::a//parent::li")
	private WebElement Clour;
	@FindBy(xpath = "//input[@id='qty']")
	private WebElement qty;
	@FindBy (xpath="(//option[contains (text(),'Select your size')]//parent::select)[1]")
	private WebElement Size;
	@FindBy(xpath = "//input[@class='btn major']")
	private WebElement AddtoBag;
	@FindBy(xpath = "//a[contains(text(),'View Bag & Checkout')]")
	private WebElement Checkout;
	@FindBy(xpath = "//button[@class='btn btn-primary btn-block']")
	private WebElement Checkout1;
	@FindBy(xpath = "//button[@aria-label='Remove item from cart']")
	private WebElement Remove;
	@FindBy(xpath = "//a[@aria-label='Edit order items']")
	private WebElement EditOder;

	

	public WebElement getEditOder() {
		return EditOder;
	}


	public WebElement getRemove() {
		return Remove;
	}


	public WebElement getClose() {
		return close;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPass() {
		return Pass;
	}

	public WebElement getSigninbtn() {
		return Signinbtn;
	}

	public WebElement getMen() {
		return Men;
	}

	public WebElement getWoman() {
		return Woman;
	}

	public WebElement getTeen() {
		return Teen;
	}

	public WebElement getHome() {
		return Home;
	}

	public WebElement getGifting() {
		return Gifting;
	}

	public WebElement getShoes() {
		return Shoes;
	}

	public WebElement getPricerange() {
		return pricerange;
	}

	public List<WebElement> getListofProduct() {
		return ListofProduct;
	}

	public WebElement getClour() {
		return Clour;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getSize() {
		return Size;
	}

	public WebElement getAddtoBag() {
		return AddtoBag;
	}

	public WebElement getCheckout() {
		return Checkout;
	}
	public WebElement getCheckout1() {
		return Checkout1;
	}
	
}
