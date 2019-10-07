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
  "duration": 9164381369,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMStepDefination.Title_of_the_Login_Page_is_FreeCRM()"
});
formatter.result({
  "duration": 18516741,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMStepDefination.User_enters_Username_and_Password(DataTable)"
});
formatter.result({
  "duration": 348207316,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMStepDefination.User_clicks_on_Login_Page()"
});
formatter.result({
  "duration": 3328819186,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMStepDefination.User_is_on_Home_Page()"
});
formatter.result({
  "duration": 8633311,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMStepDefination.User_moves_to_new_Deal_Page()"
});
formatter.result({
  "duration": 395215576,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMStepDefination.User_enters_deal_details(DataTable)"
});
formatter.result({
  "duration": 21955301072,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMStepDefination.Close_the_browser()"
});
formatter.result({
  "duration": 706319104,
  "status": "passed"
});
});