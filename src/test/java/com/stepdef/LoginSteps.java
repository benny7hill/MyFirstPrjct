package com.stepdef;

import com.selenium.methods.LoginMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("launch the browser")
	public void launch_the_browser() {

		LoginMethods.launchBrowser();
	}

	@When("type url and hit enter")
	public void type_url_and_hit_enter() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("it should take me to Login screen")
	public void it_should_take_me_to_login_screen() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("I enter {string} and \"Pass@{int}   And click on {string} button")
	public void i_enter_and_pass_and_click_on_button(String string, Integer int1, String string2) {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("I should redirect to the Home screen")
	public void i_should_redirect_to_the_home_screen() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("I enter {string} and \"   And click on \"Login\" button")
	public void i_enter_and_and_click_on_login_button(String string) {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("I view the product")
	public void i_view_the_product() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("I click on add to cart button")
	public void i_click_on_add_to_cart_button() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("It should take me to cart page")
	public void it_should_take_me_to_cart_page() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("The cart should display the added product")
	public void the_cart_should_display_the_added_product() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("I can increase and decrease the quantity")
	public void i_can_increase_and_decrease_the_quantity() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("I can remove the item from the cart")
	public void i_can_remove_the_item_from_the_cart() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("I have a product in the cart")
	public void i_have_a_product_in_the_cart() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("I click the {string} button")
	public void i_click_the_button(String string) {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("I am redirected to Checkout screen")
	public void i_am_redirected_to_checkout_screen() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("I enter {string}, {string} and {string}")
	public void i_enter_and(String string, String string2, String string3) {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("click the {string} button")
	public void click_the_button(String string) {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("Redirects to the OTP screen")
	public void redirects_to_the_otp_screen() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("Enter he valid OTP")
	public void enter_he_valid_otp() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("it should show the successful Payment confirmation message")
	public void it_should_show_the_successful_payment_confirmation_message() {
		// Write code here that turns the phrase above into concrete actions

	}
}
