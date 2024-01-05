package com.tyss.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {
	
	public BooksPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[text()='Books']")
	private WebElement Books_page_msg;

	
	@FindBy(id = "products-orderby")
	private WebElement sortByDropdown;
	
	public WebElement getSortByDropdown() {
		return sortByDropdown;
	}


	public WebElement getBooks_page_msg() {
		return Books_page_msg;
	}
	
	
	@FindBy(linkText = "Log out")
	private WebElement logout_button;


	public WebElement getLogout_button() {
		return logout_button;
	}
	

}
