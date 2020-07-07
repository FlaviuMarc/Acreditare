package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.AddToCartSteps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.ProductDetailSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class AddToCartTests extends BaseTest {
    @Steps
    private AddToCartSteps addToCartSteps;
    @Steps
    private ProductDetailSteps productDetailSteps;
    @Steps
    private CartSteps cartSteps;
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void addProductToCartFromSearcResults(){
        addToCartSteps.goToSearchField();
        addToCartSteps.typeProductName("shirt");
        addToCartSteps.clickSearch();
        addToCartSteps.clickOnTheProduct();
        addToCartSteps.verifyProductClicked("SKU: Woo-tshirt-logo");
        addToCartSteps.addProductToCart();
        addToCartSteps.verifyAddedToCartMessage("\"“T-Shirt with Logo” has been added to your cart.\"");
    }

    @Test
    public void addProductToCartFromProductDetailsPage(){   //verify cart table
        loginSteps.login("flaviutest@mailinator.com","FlaviuTest123");
        productDetailSteps.searchByTextAndAddToCart("shirt");
        addToCartSteps.addProductToCart();
        productDetailSteps.clickOnCartButton();
        cartSteps.verifyIfCartPage();
        cartSteps.verifyCartList();
        cartSteps.verifyProductInCart("T-Shirt with Logo");
    }
}
