package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;
import org.junit.Assert;

public class LoginSteps {
    private HomePage homePage;
    private MyAccountPage myAccountPage;


    @Step
    public void goToMyAccountPage() {
        homePage.open();
        myAccountPage.clickOnHeaderLoginButton();}

     @Step
     public void typeUsername(String username){
        myAccountPage.clickOnUsernameField(username);}

     @Step
     public void typePassword(String password) {
        myAccountPage.clickOnPasswordField(password);}

     @Step
     public void clickLoginButton(){
        myAccountPage.clickOnLoginButton();

    }
    @Step
    public void verifyIfLoggedIn(String expected){
        String message = myAccountPage.getHelloMessage();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void verifyInvalidLoginError(String expected){
        String message = myAccountPage.getInvalidEmailAddressMessage();
        Assert.assertEquals(expected, message);
    }


    @Step
    public void login(String username, String pass){
        goToMyAccountPage();
        typeUsername(username);
        typePassword(pass);
        clickLoginButton();


    }









}
