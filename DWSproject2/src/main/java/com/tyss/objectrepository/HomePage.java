package com.tyss.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText = "Log out")
	private WebElement logout_link;
	
	@FindBy(partialLinkText  ="BOOKS")
	private WebElement BOOKS_link;
	
	
	public WebElement getLogout_link() {
		return logout_link;
	}

	public WebElement getBOOKS_link() {
		return BOOKS_link;
	}

	
	

}
