package com.tdd.test.shoppingcart;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import com.tdd.test.shoppingcart.ShoppingCart;
import com.tdd.test.shoppingcart.Product;
import com.tdd.test.shoppingcart.ShoppingCart;

public class ShoppingCart {
	private List<Product> productList = new ArrayList<>();
	private double totalCartValue;
	public int getProductCount() {
		return productList.size();	}
	public void addProduct(Product product) {
		productList.add(product);
	
	}
	
	public double getTotalCartValue() {
		if (productList.size() > 0) {
			for (Product product : productList) {
				 totalCartValue = totalCartValue +product.getTotalPrice();
			}
		}
		return totalCartValue();
	}
	private double totalCartValue() {
		// TODO Auto-generated method stub
		return 0;
	}

}


