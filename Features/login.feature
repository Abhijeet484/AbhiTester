
Feature: Login

Background: Steps common for all scenario.
Given User launch Chrome browser
    When User opens URL "https://magento.softwaretestingboard.com/checkout/#shipping"
    And Click on Sign in link
    And User enter Email as "admin@yourstore.com" and password as "Admin@1998"
    And Click on Login button

@tag1
Scenario: Successful Login with Valid Credentials

    Then Page Title should be "My Account"
    #And close browser
    
    @sanity
    Scenario: Whats new
    
     And Click on whats new
    Then Page Title should be whatsnew "What's New"
    
    @sanity
    Scenario: Women section
    And Click on Women section
    Then Page Title should be women section "Women"
    
    @sanity
    Scenario: Men section add to cart
    And Click on Men section
    Then Page Title should be whatsnew "Men"
    When click on hero hoodie
    And select size
    And select colour
    And click on add to cart button
    And click on cart button
    And click on proceed to checkout
    And click on next
    And click on place order
    
    
    
    
    @tag5
    Scenario: Gear section
    #And Open new window
    #And Click on Gear section
    #And Take Screenshot
    #And check Tooltip
    #Then Page Title should be whatsnew "Gear"
    
    
    @tag6
    Scenario: mouse hover
    Given User launch Chrome browser
    When User opens URL "https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9tZW4vdG9wcy1tZW4uaHRtbA%2C%2C/"
    #And Click on Sign in link
    And User enter Email as "admin@yourstore.com" and password as "Admin@1998"
    And Click on Login
    And Mouse hover on men
    
    
    
    