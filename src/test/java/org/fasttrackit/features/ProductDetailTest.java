package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.ProductDetailSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class ProductDetailTest extends BaseTest {
    @Steps
    private ProductDetailSteps productDetailSteps;

    @Test
    public void addToCartFromProductDetailsPage() {
        productDetailSteps.goToSearchField();
        productDetailSteps.typeProductName("shirt");
        productDetailSteps.clickSearch();
        productDetailSteps.clickOnProduct();
        productDetailSteps.verifyProductAddedToCart("SKU: Woo-tshirt-logo");
    }
}
