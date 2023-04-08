package calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.Before;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private float result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }


    @When("^I add the two values$")
    public void iAddTheTwoValues() {
        result = calculator.add(value1, value2);
        System.out.print(result);
    }

    @Then("^I expect the result (\\d+.\\d+)$")
    public void iExpectTheResult(float arg0) {
        Assert.assertEquals(arg0, result, 0);
    }

    @Given("^One input values, (\\d+)$")
    public void oneInputValues(int arg0) {
        value1 = arg0;
    }

    @When("^I want to reverse it$")
    public void iWantToReverseIt() {
        result = calculator.reverse(value1);
    }

    @When("^I want to find square root of it$")
    public void iWantToFindSquareRootOfIt() {
        result = calculator.square_root(value1);
    }

    @Given("^Calculate, (\\[a-z]{3}) (\\d+)$")
    public void calculateOptInput(int arg0) {
        result = calculator.calculat(String operation, int arg0);
    }
}
