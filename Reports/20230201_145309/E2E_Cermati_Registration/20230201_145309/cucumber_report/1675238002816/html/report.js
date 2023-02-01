$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Work/KatalonProject/cermati_test/Include/features/Registration.feature");
formatter.feature({
  "name": "Register Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As A User, I want to Register and have Cermati account",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I already open my browser",
  "keyword": "Given "
});
formatter.match({
  "location": "RegistrationStep.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to cermati registration page",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStep.navigateToRegisterPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input my email",
  "keyword": "When "
});
formatter.match({
  "location": "RegistrationStep.inputEmail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input my phone number",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStep.inputPhoneNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input my password",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStep.inputPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I confirm my password",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStep.confirmPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input my first name",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStep.inputFirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input my last name",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStep.inputLastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I choose my city province",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStep.inputCityProvince()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check terms \u0026 conditions policy agreement",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStep.checkPolicy()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click register button",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStep.clickRegisterButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should directed to OTP option page",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStep.nextPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see two options to sent OTP, SMS or WhatsApp",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStep.currentPage()"
});
formatter.result({
  "status": "passed"
});
});