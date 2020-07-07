package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class LoginTests extends BaseTest {
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void validUserLogin(){
        loginSteps.goToMyAccountPage();
        loginSteps.typeUsername("flaviutest@mailinator.com");
        loginSteps.typePassword("FlaviuTest123");
        loginSteps.clickLoginButton();
        loginSteps.verifyIfLoggedIn("Hello flaviutest (not flaviutest? Log out)");
    }

    @Test
    public void invalidUserLogin(){
        loginSteps.goToMyAccountPage();
        loginSteps.typeUsername("flaviutestinvalid@mailinator.com");
        loginSteps.typePassword("FlaviuTest123");
        loginSteps.clickLoginButton();
        loginSteps.verifyInvalidLoginError("ERROR: Invalid email address. Lost your password?");
    }
}
