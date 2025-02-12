Feature: Scenario outline practice

  @googleSearchOutline @B2G3-304 @B2G3-305
  Scenario Outline: Google search for capital cities
    Given user is on Google search page
    When user search for the "<country>"
    Then user should see the "<capital>" in the result

    Examples:
      | country     | capital          |
      | Azerbaijan  | Baku             |
      | Ukraine     | Kyiv             |
      | Afghanistan | Kabul            |
      | USA         | Washington, D.C. |
      | Turkiye     | Ankara           |
      | Uzbekistan  | Tashkent         |