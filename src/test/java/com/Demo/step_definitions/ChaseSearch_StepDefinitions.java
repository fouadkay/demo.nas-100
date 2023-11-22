package com.Demo.step_definitions;

import com.Demo.pages.ChaseSearchPage;
import com.Demo.utillities.ConfigurationReader;
import com.Demo.utillities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class ChaseSearch_StepDefinitions {

    ChaseSearchPage page = new ChaseSearchPage();

ChaseSearchPage p = new ChaseSearchPage();

    @Given("user is on the chase.com website")
    public void user_is_on_the_chase_com_website()  {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));


    }

    @Then("user searches for {string}")
    public void user_searches_for(String input) {
        page.searchBox.sendKeys(input);
        page.searchButtonOnSearchPage.click();


    }
    @Then("user should see {string} under featured links")
    public void user_should_see_under_featured_links(String result) {




        Assert.assertTrue(page.myCarLink.getText().equals(result));





    }

}
