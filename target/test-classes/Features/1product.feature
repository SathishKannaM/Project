Feature: To Validate the Product to add to card to following Steps

  Scenario Outline: To Validate the login functionality with Valid
    Given To user Should Open browser then sent url launch
    When The user click Login page and "<Username>"and"<Password>"
    And The User click sigin button
    And  The user After Move to elament  Men or wonman etc After click casual Shoes Product
    And  The user navigate to this page and Select method Price Range int2 low to high
    And then show the list of  product get intex first or last product
    And Navigate then clour and no of sent nno qty ad use select method size 
    And after click AddToBag after Checkout
    
    Examples: 
      | Username                  | Password    |
      | sathishkanna606@gmail.com | sathish9043 |
      
