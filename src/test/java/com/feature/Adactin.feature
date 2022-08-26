Feature: Hotel Booking with Adactin Functionality

Scenario: Checking login functionality
Given: User enters the Application page
When User enters the username in username field
And User enters the password in password field
Then User clicks the login buttion and navigates to search page

Scenario: Searching Hotel functionality
When User selects location from the location dropdown
And User selects location from the location dropdown
And User selects hotels from the hotels dropdown
And User selects room type from room type dropdown
And User selects number of rooms from number of rooms dropown
And User Clears and enter Check in date in check in date field
And User clears and enter check out date in check out date field
And User selects adults per room in adults per room dropdown
And User selects child in child per room dropdown
Then User clicks the search button and navigates to select hotel page

Scenario: Select hotel functionality
When User selects the hotel by clicking radio button
Then User clicks the continue button and navigates to book a hotel page

Scenario: Book a hotel functionality
When User enters the first name in first name field
And user enters the last nae in last name field
And user enter the billing address in the billing address field
And User enters the credit card number in Credit card No. field
And User selects credit card type from the credit card type dropdown
And user selects expiry month from select month dropdown in expiry date field
And user selects expiry year from select year dropdown in exiry date field
And user enters CVV number in CVV number field
Then User clicks the book now button and navigates to booking confirmation page

Scenario: Check for all the details and logout functionality
When User takes the screenshot of the booking confirmation page
And User clicks logout button and logout successfully
Then User clicks click here to login page and navigates to homepage