@Suite @ShoppingCart
Feature: CP02 - Validate shopping cart

  Background: Perform 3 validations on the shopping cart
    Given the user navigates to the website
    When enter valid credentials

    @ShoppingCartList
    Scenario: 1 - Check shopping cart when selecting products
      And add products to the shopping cart
      And click on the cart icon
      Then the application should list the selected products in the shopping cart

    @ShoppingCartEmpty
    Scenario: 2 - Verify that the shopping cart is empty when no items are selected
      And click on the cart icon
      Then the application should display the cart without products

    @ShoppingCartProcess
    Scenario: 3 - Verify that after adding products to the cart, the purchase can be completed successfully
      And add products to the shopping cart
      And click on the cart icon
      When complete the order registration
      Then the application should process the purchase