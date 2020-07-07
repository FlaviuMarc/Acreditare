package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;
import org.junit.Assert;

public class RegisterSteps {
    private HomePage homePage;
    private MyAccountPage myAccountPage;

    @Step
    public void goToMyAccountPage() {
        homePage.open();
        myAccountPage.clickOnHeaderLoginButton();}

    @Step
    public void typeRegisterUsername(String username){    //always change the email
        myAccountPage.clickOnRegisterUsernameField(username);}

    @Step
    public void typeRegisterPassword(String password) {
        myAccountPage.clickOnRegisterPasswordField(password);}

    @Step
    public void clickRegisterButton(){
        myAccountPage.clickOnRegisterButton();
    }

    @Step
    public void clickTheLoginButton(){
        myAccountPage.clickOnLoginButton();

    }
    @Step
    public void checkIfLoggedIn(String expected){
        String message = myAccountPage.getHelloMessage();
        Assert.assertEquals(expected, message);
    }
}
