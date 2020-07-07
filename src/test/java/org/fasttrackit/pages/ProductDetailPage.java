package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductDetailPage extends PageObject {

    @FindBy( css = ".sku_wrapper" )
        private WebElementFacade productIndividualDetail;

    @FindBy ( css = "button.single_add_to_cart_button ")
    private WebElementFacade addToCartButton;

    @FindBy ( css = "[role=\"alert\"]")
    private WebElementFacade addedToCartMessage;

    @FindBy (css = ".view-cart")
    private WebElementFacade viewCartHeaderOption;








    public String getProductIndividualDetail(String message) {
        return productIndividualDetail.getText();
    }

    public void setAddToCartButton(){
        clickOn(addToCartButton);
    }

    public String setAddedToCartMessage(String message){
        return addedToCartMessage.getText();
    }

    public void selectViewCartHeaderOption(){
        clickOn(viewCartHeaderOption);
    }
}









