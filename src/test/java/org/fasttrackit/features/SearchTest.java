package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class SearchTest extends BaseTest {
    @Steps
    private SearchSteps searchSteps;

    @Test
    public void performSearchWithMultipleResults(){
        searchSteps.goToSearchField();
        searchSteps.typeProductName("shirt");
        searchSteps.clickSearch();
        searchSteps.verifySearchResults("Showing all 3 results");
    }
}
