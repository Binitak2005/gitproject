$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Testcase.feature");
formatter.feature({
  "name": "To test the OrangeLogin functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To check the login functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "to verify the title of the page",
  "keyword": "Given "
});
formatter.step({
  "name": "To enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "To click the submit button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "admin123"
      ]
    },
    {
      "cells": [
        "admin",
        "admin123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To check the login functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "to verify the title of the page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefination.LoginSteps.to_verify_the_title_of_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter \"admin\" and \"admin123\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefination.LoginSteps.to_enter_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefination.LoginSteps.to_click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check the login functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "to verify the title of the page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefination.LoginSteps.to_verify_the_title_of_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter \"admin\" and \"admin123\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefination.LoginSteps.to_enter_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefination.LoginSteps.to_click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
});