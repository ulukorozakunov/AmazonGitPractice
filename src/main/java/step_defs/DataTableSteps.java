package step_defs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.lang.reflect.Type;
import java.util.List;

public final class DataTableSteps {
    @Given("user is on NambaFood")
    public void user_is_on_namba_food() {
        System.out.println("User is on Namba food");
        
    }
    @When("user clicks on Foods")
    public void user_clicks_on_foods() {
        System.out.println("User clicks on Foods");
        
    }
    @Then("user should find Sushi category")
    public void user_should_find_sushi_category() {
        System.out.println("User find Sushi category");
        
    }
    @When("user click on Sushi")
    public void user_click_on_sushi() {
        System.out.println("User click on Sushi");
        
    }
    @Then("user should see list of Cafes")
    public void user_should_see_list_of_cafes() {
        System.out.println("User see list of Cafes");
        
    }
    @Then("user should scroll down the page to the Arigato cafe")
    public void user_should_scroll_down_the_page_to_the_arigato_cafe() {
        System.out.println("User scroll down the page to the Arigato cafe");
        
    }
    @When("user click on Arigato")
    public void user_click_on_arigato() {
        System.out.println("User scroll down the page to the Arigato cafe");
        
    }
    @Then("user should see the Arigato cafe menu")
    public void user_should_see_the_arigato_cafe_menu() {
        System.out.println("User see the Arigato cafe menu");
        
    }
    @Then("user should find kimchi")
    public void user_should_find_kimchi() {
        System.out.println("User find kimchi");
        
    }
    @When("user increase kimchi amount to {int}")
    public void user_increase_kimchi_amount_to(Integer kimchiAmount) {
        System.out.println("User increase kimchi amount to : "+ kimchiAmount);
        
    }
    @When("user should click on Oreder button")
    public void user_should_click_on_oreder_button() {
        System.out.println("User click on Oreder button");
        
    }
    @Then("on the cart user should see {string}")
    public void on_the_cart_user_should_see(String totalPriceAmount) {
        System.out.println("on the cart user see " + totalPriceAmount);
        
    }
    /// Second scenario
    @Given("user is on {string}")
    public void user_is_on(String URL) {
        System.out.println("User is on " + URL);

    }
    @Then("foolowing menu bar should be displayed on Home page")
    public void foolowing_menu_bar_should_be_displayed_on_home_page(DataTable dataTable) {
        
        List<List<String>> data = dataTable.asLists((Type) String.class);
        System.out.println(data.get(0).get(1));
    }

    @Given("user is on www.car.kg")
    public void user_is_on_www_car_kg() {


    }
    @Then("following cars should be displayed")
    public void following_cars_should_be_displayed(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> datas = dataTable.asLists((Type) String.class);
        System.out.println(datas.get(1).get(3));

    }
}
