$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Testscript01.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Vigneshwaran.S"
    }
  ],
  "line": 4,
  "name": "Magneto site",
  "description": "\t\t\tTestcases one",
  "id": "magneto-site",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@TestCase"
    }
  ]
});
formatter.before({
  "duration": 2949733296,
  "status": "passed"
});
formatter.before({
  "duration": 131170,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "User is in Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Click on MOBILE menu",
  "keyword": "When "
});
formatter.match({
  "location": "StartingSteps.user_is_in_Home_Page()"
});
formatter.result({
  "duration": 18107933687,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.click_on_MOBILE_menu()"
});
formatter.result({
  "duration": 225552298,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Testcase001",
  "description": "",
  "id": "magneto-site;testcase001",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@TestCase-one"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "select SORT BY dropdown as name",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "All products should be sorted by name",
  "keyword": "Then "
});
formatter.match({
  "location": "MobilepageSteps.select_SORT_BY_dropdown_as_name()"
});
formatter.result({
  "duration": 18838043009,
  "status": "passed"
});
formatter.match({
  "location": "MobilepageSteps.all_products_should_be_sorted_by_name()"
});
formatter.result({
  "duration": 184733272,
  "status": "passed"
});
formatter.after({
  "duration": 120334,
  "status": "passed"
});
formatter.after({
  "duration": 74139,
  "status": "passed"
});
});