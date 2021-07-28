package com.Demo.Test;

import org.junit.Test;

import com.Demo.GenericsUtils.BaseClass;
import com.Demo.ObjectRepository.GetProductList;

public class ProductListTest extends BaseClass {
	@Test
	public void getDetails() {
		GetProductList gpl=new GetProductList(driver);
		gpl.productlist();
	}

}
