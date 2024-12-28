Feature: Search and Place the order for Products

Scenario: Search Experience for product search in both home and Offers page

Given User is on GreenCart Landing page
When user searched with a Shortname "Tom" and extracted actual name of the product
Then user searched for "Tom" shortname in offers page 
And Validate product name in offers page matches with Landing page

