package com.tdd.test.shoppingcart;

import org.junit.Assert;
import org.junit.Test;
import com.tdd.test.shoppingcart.TestShoppingCart;
import com.tdd.test.shoppingcart.Product;

public class TestShoppingCart{
 
	@Test
	public void testCreateEmptyShoppingCart() {
		ShoppingCart cart = new ShoppingCart();
		Assert.assertEquals(0, cart.getProductCount());
	}
	
	@Test
	public void testAddSingleProductToShoppingCart() {
		ShoppingCart cart = new ShoppingCart();
		Product product = new Product("Gatsby hair cream", 1, 0.0);
		cart.addProduct(product);
		Assert.assertEquals(1, cart.getProductCount());
		Assert.assertEquals(0.0, cart.getTotalCartValue(),0.0);
	}
	@Test
	public void addDifferentProductsToTheCart(){
		ShoppingCart cart = new ShoppingCart();
		Product gatsByCream = new Product("Gatsby hair cream", 1, 0.0);
		Product bvlgiriSoap = new Product("Bvlgiri Soap", 1, 100.0);
		cart.addProduct(gatsByCream);
		cart.addProduct(bvlgiriSoap);
		Assert.assertEquals(2, cart.getProductCount());
		Assert.assertEquals(0.0, cart.getTotalCartValue(),0.0);
	}
}
