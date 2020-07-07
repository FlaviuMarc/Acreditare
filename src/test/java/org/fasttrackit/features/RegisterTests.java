package org.fasttrackit.features;


import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class RegisterTests extends BaseTest {

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void registerAccount(){
        long currentTimeVar = System.currentTimeMillis();
        registerSteps.goToMyAccountPage();
        registerSteps.typeRegisterUsername("flaviuTest_"+currentTimeVar+"@mailinator.com");
        registerSteps.typeRegisterPassword("FlaviuTest#123");
        registerSteps.clickRegisterButton();
        registerSteps.checkIfLoggedIn("Hello flaviuTest_"+currentTimeVar+" (not flaviuTest_"+currentTimeVar+"? Log out)");
    }
}
