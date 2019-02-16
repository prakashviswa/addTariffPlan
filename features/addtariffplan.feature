#Author: prakash
Feature: Add Tariff Plan

  Scenario Outline: Enter the  details in Add Tariff Plan
    Given The User is in the add tariff plan page
    And The user click the add tariff button
    When The user fill all details in the form "<MonthlyRental>","<FreeLocalMin>","<FreeIntUnits>","<FreeSMSPack>","<LocalMinChar>","<IntMinChar>","<SMSperCharg>"
    And The user submits the form
    Then I validate whether user submitted the form

    Examples: 
      | MonthlyRental | FreeLocalMin | FreeIntUnits | FreeSMSPack | LocalMinChar | IntMinChar | SMSperCharg |
      |           123 |          345 |         4343 |         978 |          677 |       7897 |       45656 |
      |           789 |          987 |          434 |         111 |         3457 |         74 |        4556 |
      |           556 |          666 |         7675 |         122 |        23377 |       4597 |       95656 |
      |           333 |          888 |        54353 |         333 |         2327 |        765 |         256 |
