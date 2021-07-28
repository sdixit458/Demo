package com.Demo.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetProductList {
	@FindBy(xpath = "//span[text()='PRODUCTS']")
	private WebElement product;
	
	public GetProductList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void productlist() {
		product.click();
		
	}

}
