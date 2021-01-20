$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/SignupFeature.feature");
formatter.feature({
  "name": "Signup feature",
  "description": "  I want to verify signup feature",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As a user I want to create sign up account",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigate the url",
  "keyword": "Given "
});
formatter.match({
  "location": "webmd.stepDef.SignupStepDef.user_navigate_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on singin link",
  "keyword": "When "
});
formatter.match({
  "location": "webmd.stepDef.SignupStepDef.click_on_singin_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on signup link",
  "keyword": "And "
});
formatter.match({
  "location": "webmd.stepDef.SignupStepDef.click_on_signup_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "input email , password , dob",
  "keyword": "And "
});
formatter.match({
  "location": "webmd.stepDef.SignupStepDef.input_email_password_dob()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on signup button",
  "keyword": "And "
});
formatter.match({
  "location": "webmd.stepDef.SignupStepDef.click_on_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can see my profile text",
  "keyword": "Then "
});
formatter.match({
  "location": "webmd.stepDef.SignupStepDef.i_can_see_my_profile_text()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});