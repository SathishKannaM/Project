Feature: To Validate the Login Functionality in my Application

  Scenario Outline: To Validate the login functionality with Valid
    Given To user Should Open browser then sent url launch
    When The user click Login page and "<Username>"and"<Password>"
    And The User click sigin button

    Examples: 
      | Username                  | Password    |
      | sathishkanna606@gmail.com | sathish9043 |
