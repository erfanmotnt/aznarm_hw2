package calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.Before;
import org.junit.Assert;

import static java.lang.Float.NaN;

public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private float result;
    private String operation;
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

    @Then("^I expect the result (-?\\d+.\\d+)$")
    public void iExpectTheResult(float arg0) {
        Assert.assertEquals(arg0, result, 0);
    }

    @Given("^One input values, (-?\\d+)$")
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

    @Given("^One operation and a number, ([a-z]{3}) (-?\\d+)$")
    public void oneOperationAndANumberOptInput(String operation, int arg0) {
        value1 = arg0;
        this.operation = operation;
    }

    @When("^I want to calculate it$")
    public void iWantToCalculateIt() {
        result = calculator.calculat(operation, value1);
    }

    @Then("^I expect the result Infinity$")
    public void iExpectTheResultInfinity() {
        Assert.assertEquals(result, Double.POSITIVE_INFINITY, 0);
    }

    @Then("^I expect the result NaN$")
    public void iExpectTheResultNaN() {
        Assert.assertEquals(result, NaN, 0);
    }
}
