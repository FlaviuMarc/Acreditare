package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.ProductDetailPage;
import org.junit.Assert;



public class CartSteps {
    private ProductDetailPage productDetailPage;
    private CartPage cartPage;


    @Step
    public void verifyIfCartPage() {
        cartPage.cartPageCheck("Cart");
    }

    @Step
    public void verifyCartList() {
        cartPage.getProductList();
    }


    @Step
    public void verifyProductInCart(String name){
        Assert.assertTrue(cartPage.verifyIfProductExistsInCart(name));
    }




}
