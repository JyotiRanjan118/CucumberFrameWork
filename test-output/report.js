$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:\\Java\\Java Project\\Application Under Test\\Selenium_Cucumber\\FeatureFiles\\FreeCRMDeals.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM deals data creation",
  "description": "",
  "id": "freecrm-deals-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "FreeCRM create a new deal scenario",
  "description": "",
  "id": "freecrm-deals-data-creation;freecrm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is already Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Title of the Login Page is FreeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters Username and Password",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 7
    },
    {
      "cells": [
        "naveenautomation",
        "test@123"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User clicks on Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User is on Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User moves to new Deal Page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User enters deal details",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "Probability",
        "commission"
      ],
      "line": 14
    },
    {
      "cells": [
        "deal01",
        "1000",
        "50",
        "10"
      ],
      "line": 15
    },
    {
      "cells": [
        "deal02",
        "2000",
        "60",
        "20"
      ],
      "line": 16
    },
    {
      "cells": [
        "deal03",
        "3000",
        "70",
        "30"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FreeCRMStepDefination.User_is_already_Login_Page()"
});
formatter.result({
  "duration": 11397948286,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMStepDefination.Title_of_the_Login_Page_is_FreeCRM()"
});
formatter.result({
  "duration": 12296940,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMStepDefination.User_enters_Username_and_Password(DataTable)"
});
formatter.result({
  "duration": 500270705,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMStepDefination.User_clicks_on_Login_Page()"
});
formatter.result({
  "duration": 6355665435,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMStepDefination.User_is_on_Home_Page()"
});
formatter.result({
  "duration": 11115588,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMStepDefination.User_moves_to_new_Deal_Page()"
});
formatter.result({
  "duration": 409298399,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMStepDefination.User_enters_deal_details(DataTable)"
});
formatter.result({
  "duration": 20836349407,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMStepDefination.Close_the_browser()"
});
formatter.result({
  "duration": 784330409,
  "status": "passed"
});
});