package com.packt.webstore.domain;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CartTest {
	private CartItem cartItem;
	private Cart cart;
	@Before
	public void setup() {
		cartItem = new CartItem();
	}
	@Before
	public void setup2() {
		cart = new Cart();
	}
	@Test
	public void testGrandTotalprice(){
		Product iphone = new Product("P1234", "iPhone 5s", new BigDecimal(500));
		Product iphone2 = new Product("P1231", "iPhone 6s", new BigDecimal(1000));
		cartItem.setProduct(iphone);
		cartItem.setProduct(iphone2);
		
		cart.addCartItem(cartItem);
		BigDecimal totalPrice = cart.getGrandTotal();
		Assert.assertEquals(cartItem.getTotalPrice(), totalPrice);
	}
	
}