package step_defs;

import applications.DemirBank;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class BankApps {
    DemirBank adikDemirBank ;
    @Given("user should to register to with following info")
    public void user_should_to_register_to_with_following_info(io.cucumber.datatable.DataTable dataTable) throws Exception {
      List<List<String>> number = dataTable.asLists(String.class);
        long accNum = Long.parseLong(number.get(1).get(0));
        long routNum = Long.parseLong(number.get(1).get(1));

        adikDemirBank = new DemirBank(accNum,routNum);
        System.out.println(adikDemirBank.getAccountNumber());
        System.out.println(adikDemirBank.getRoutingNumber());
    }
    @Then("user should be successfully register to the bank with foolowing credentials")
    public void user_should_be_successfully_register_to_the_bank_with_foolowing_credentials(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> number1 = dataTable.asLists(String.class);
        long accNum = Long.parseLong(number1.get(1).get(0));
        long routNum = Long.parseLong(number1.get(1).get(1));
        Assertions.assertEquals(accNum, adikDemirBank.getAccountNumber());
        Assertions.assertEquals(routNum, adikDemirBank.getRoutingNumber());
    }
}
