
@smoke
Feature:Createanacct1 using Datatable

  Scenario:
#    When I click on "Automation Practice"website
    And I click on SignIn button of Automation Practice Website
    Then Create_an_Account form should open"http://automationpractice.com/index.php?controller=authentication&back=my-account"
    And I enter Email address"Test12345@gmail.com"
    And click on Create_an_account button
#    And I select the "Title" as Mr or Mrs

    And enter below details:
      | Firstname | Lastname | Emailid          | Password | Day |Month|Year|
      | Ashley    | Lord     | Ashley@gmail.com | 123456   | 1   |March  |2019|