
Feature: Add To Cart Epic Test

Background:
Given i Already navigated to Amazon Homepage

  @Adhoc
  Scenario Outline: Verify search and Add to cart 
    When I entered Following String in the Search Field "<Name>"
    And I Clicked on The Search Icon
    Then The Total number of my Results are displaying as "<Number>"
    When I clicked on first_item
    Then Add to Cart button is displaying in right Panel
    When i clicked on Add_To_Cart button
    Then add protection page is Displaying
   Examples:
   |Name|Number|first_item
   |Computer|20000|


