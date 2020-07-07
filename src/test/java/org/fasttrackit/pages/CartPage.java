package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class CartPage extends PageObject {


   @FindBy ( css = ".current")
    private WebElementFacade checkIfCartPage;

   @FindBy (css = ".cart_item")
   List<WebElementFacade> productAddedToCartList;


   public String cartPageCheck(String message){
       return checkIfCartPage.getText();
   }

    public List<WebElementFacade> getProductList(){
        return  productAddedToCartList;

    }
    public boolean verifyIfProductExistsInCart(String name){
        for(WebElementFacade currentElement : productAddedToCartList){
            if(currentElement.findElement(By.cssSelector(".product-name a")).getText().equals(name)){
                return true;
            }
        }
        return false;
    }
}
