package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyAccountPage extends PageObject {

    @FindBy( css = " .account ")
    private WebElementFacade myAccountPageLogin;  //login button from homepage

    @FindBy ( css = "#username")
    private WebElementFacade emailField;  //login field

    @FindBy ( css = "#password")
    private WebElementFacade passwordField;   //login field

    @FindBy ( css = "input[id=\"reg_email\"]")
    private WebElementFacade emailFieldRegister;  //register field

    @FindBy ( css = "input[id=\"reg_password\"]")
    private WebElementFacade passwordFieldRegister;  //register field

    @FindBy ( css = ".button[name=\"login\"]")   // login to my account
    private WebElementFacade loginButton;

    @FindBy ( css = "button[name=\"register\"]")
    private WebElementFacade registerButton;

    @FindBy(css = "p:nth-child(1)")
    private WebElementFacade helloMessage;

    @FindBy (css = ".woocommerce-error >li")
    private WebElementFacade invalidEmailAddressMessage;



    public void clickOnHeaderLoginButton(){
        clickOn(myAccountPageLogin);
    }

    public void clickOnUsernameField(String email){
        typeInto(emailField, email);
    }
    public void clickOnPasswordField(String password){
        typeInto(passwordField, password);
    }
    public void clickOnLoginButton(){
        clickOn(loginButton);
    }

    public void clickOnRegisterUsernameField(String email){
        typeInto(emailFieldRegister, email);
    }

    public void clickOnRegisterPasswordField(String password){
        typeInto(passwordFieldRegister, password);
    }

    public void clickOnRegisterButton(){
        clickOn(registerButton);
    }

    public String getHelloMessage(){
        return helloMessage.getText();
    }

    public String getInvalidEmailAddressMessage() {
        return invalidEmailAddressMessage.getText();}

}
