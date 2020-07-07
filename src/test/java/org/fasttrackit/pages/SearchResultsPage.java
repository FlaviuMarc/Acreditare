package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchResultsPage extends PageObject {

    @FindBy(css = ".woocommerce-result-count")
    private WebElementFacade multipleResultsPage;

    @FindBy(css = "#primary > div > div.wc-products > ul > li.post-42.product.type-product.status-publish.has-post-thumbnail.product_cat-tshirts.first.instock.shipping-taxable.purchasable.product-type-simple > div.collection_desc.clearfix > a > h3")
    private WebElementFacade selectTheProduct;


    public String getMultipleResultsPage() {
        return multipleResultsPage.getText();
    }

    public void navigateToProduct() {
        clickOn(selectTheProduct);


    }
}
