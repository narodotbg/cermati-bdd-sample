package cermati.test
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class RegistrationStep {

	@Given("I already open my browser")
	def openBrowser() {
		WebUI.openBrowser("")
		WebUI.maximizeWindow()
	}

	@And("navigate to cermati registration page")
	def navigateToRegisterPage() {
		WebUI.navigateToUrl(GlobalVariable.url)
	}

	@When("I input my email")
	def inputEmail() {
		WebUI.setText(findTestObject('Object Repository/register_page/email_field'), GlobalVariable.mail)
	}

	@And("I input my phone number")
	def inputPhoneNumber() {
		WebUI.setText(findTestObject('Object Repository/register_page/phoneNumber_field'), GlobalVariable.phoneNumber)
	}

	@And ("I input my password")
	def inputPassword() {
		WebUI.setEncryptedText(findTestObject('Object Repository/register_page/password_field'), GlobalVariable.password)
	}

	@And("I confirm my password")
	def confirmPassword() {
		WebUI.setEncryptedText(findTestObject('Object Repository/register_page/confirmPassword_field'), GlobalVariable.password)
	}

	@And("I input my first name")
	def inputFirstName() {
		WebUI.setText(findTestObject('Object Repository/register_page/firstName_field'), 'Narodo')
	}

	@And("I input my last name")
	def inputLastName() {
		WebUI.setText(findTestObject('Object Repository/register_page/lastName_field'), 'Mario')
	}

	@And("I choose my city province")
	def inputCityProvince() {
		WebUI.setText(findTestObject('Object Repository/register_page/cityProvince_field'), 'JAKARTA')
		WebUI.click(findTestObject('register_page/cityProvince_option'))
	}

	@And("I check terms & conditions policy agreement")
	def checkPolicy() {
		//disabled since t&c checkbox is checked by default
		//WebUI.click(findTestObject('Object Repository/register_page/termConditions_checkbox'))
	}

	@And("I click register button")
	def clickRegisterButton() {
		WebUI.click(findTestObject('Object Repository/register_page/register_button'))
	}

	@Then("I should directed to OTP option page")
	def nextPage() {
	}

	@And("I see two options to sent OTP, SMS or WhatsApp")
	def currentPage() {
	}
}