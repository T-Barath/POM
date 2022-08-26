package com.StepDefinition;

import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.ConfigurationProp.FileReaderManager;
import com.RunnerClass.PageObjectManager;
import com.TestRunner.TestRunner;
import com.base_Class.BaseClass1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass1 {
	public static WebDriver driver= TestRunner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	
	@When("User enters the username in username field")
	public void user_enters_the_username_in_username_field() throws IOException {
		inputValueElement(pom.getLoginPage().getusername() ,FileReaderManager.getInstanceFRM().getInstanceCR().getUserName());
	 
	}

	@And("User enters the password in password field")
	public void user_enters_the_password_in_password_field() throws IOException {
		inputValueElement(pom.getLoginPage().getpassword(), FileReaderManager.getInstanceFRM().getInstanceCR().getPassword());
	  
	}

	@Then("User clicks the login buttion and navigates to search page")
	public void user_clicks_the_login_buttion_and_navigates_to_search_page() {
		clickOnElement(null);
	   
	}

	@When("User selects location from the location dropdown")
	public void user_selects_location_from_the_location_dropdown() {
	    
	}

	@When("User selects hotels from the hotels dropdown")
	public void user_selects_hotels_from_the_hotels_dropdown() {
	 
	}

	@When("User selects room type from room type dropdown")
	public void user_selects_room_type_from_room_type_dropdown() {
	    
	}

	@When("User selects number of rooms from number of rooms dropown")
	public void user_selects_number_of_rooms_from_number_of_rooms_dropown() {

	}

	@When("User Clears and enter Check in date in check in date field")
	public void user_clears_and_enter_check_in_date_in_check_in_date_field() {

	}

	@When("User clears and enter check out date in check out date field")
	public void user_clears_and_enter_check_out_date_in_check_out_date_field() {

	}

	@When("User selects adults per room in adults per room dropdown")
	public void user_selects_adults_per_room_in_adults_per_room_dropdown() {
	   
	}

	@When("User selects child in child per room dropdown")
	public void user_selects_child_in_child_per_room_dropdown() {
	
	}

	@Then("User clicks the search button and navigates to select hotel page")
	public void user_clicks_the_search_button_and_navigates_to_select_hotel_page() {
	}

	@When("User selects the hotel by clicking radio button")
	public void user_selects_the_hotel_by_clicking_radio_button() {
	  
	}

	@Then("User clicks the continue button and navigates to book a hotel page")
	public void user_clicks_the_continue_button_and_navigates_to_book_a_hotel_page() {
	 
	}

	@When("User enters the first name in first name field")
	public void user_enters_the_first_name_in_first_name_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters the last nae in last name field")
	public void user_enters_the_last_nae_in_last_name_field() {
	  
	}

	@When("user enter the billing address in the billing address field")
	public void user_enter_the_billing_address_in_the_billing_address_field() {
	 
	}

	@When("User enters the credit card number in Credit card No. field")
	public void user_enters_the_credit_card_number_in_credit_card_no_field() {
	
	}

	@When("User selects credit card type from the credit card type dropdown")
	public void user_selects_credit_card_type_from_the_credit_card_type_dropdown() {
	  
	}

	@When("user selects expiry month from select month dropdown in expiry date field")
	public void user_selects_expiry_month_from_select_month_dropdown_in_expiry_date_field() {
	   
	}

	@When("user selects expiry year from select year dropdown in exiry date field")
	public void user_selects_expiry_year_from_select_year_dropdown_in_exiry_date_field() {
	   
	}

	@When("user enters CVV number in CVV number field")
	public void user_enters_cvv_number_in_cvv_number_field() {
	    
	}

	@Then("User clicks the book now button and navigates to booking confirmation page")
	public void user_clicks_the_book_now_button_and_navigates_to_booking_confirmation_page() {
	    
	}

	@When("User takes the screenshot of the booking confirmation page")
	public void user_takes_the_screenshot_of_the_booking_confirmation_page() {
	  
	}

	@When("User clicks logout button and logout successfully")
	public void user_clicks_logout_button_and_logout_successfully() {
	  
	}

	@Then("User clicks click here to login page and navigates to homepage")
	public void user_clicks_click_here_to_login_page_and_navigates_to_homepage() {
	  
	}
	
}