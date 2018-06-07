import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://is-ticket.mysterycircus.jp/qpg7d4.php?dispatch=promotion_template.add')

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('Page_Administration panel/input_user_login'), 'aki@est-rouge.com')

WebUI.setText(findTestObject('Page_Administration panel/input_password'), 'password')

WebUI.click(findTestObject('Page_Administration panel/input_dispatchauth.login'))

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('Page_Marketing  Promotion (Coupon)/input_promotion_dataname'), promotion)

WebUI.selectOptionByValue(findTestObject('Page_Marketing  Promotion (Coupon)/select_Download app'), delivery_time, false)

WebUI.selectOptionByValue(findTestObject('Page_Marketing  Promotion (Coupon)/select_Cash back'), bonus, false)

WebUI.setText(findTestObject('Page_Marketing  Promotion (Coupon)/input_promotion_datadiscount'), discount)

WebUI.check(findTestObject('Page_Marketing  Promotion (Coupon)/input_promotion_datadelivery_p'))

WebUI.setText(findTestObject('Page_Marketing  Promotion (Coupon)/input_promotion_datadelivery_from'), delivery_from_date)

WebUI.selectOptionByValue(findTestObject('Page_Marketing  Promotion (Coupon)/delivery_from_hour'), delivery_from_hour, false)

WebUI.selectOptionByValue(findTestObject('Page_Marketing  Promotion (Coupon)/delivery_from_minutes'), delivery_from_minutes, 
    false)

WebUI.setText(findTestObject('Page_Marketing  Promotion (Coupon)/input_promotion_datadelivery_to'), delivery_to_date)

WebUI.selectOptionByValue(findTestObject('Page_Marketing  Promotion (Coupon)/delivery_to_hour'), delivery_to_hour, false)

WebUI.selectOptionByValue(findTestObject('Page_Marketing  Promotion (Coupon)/delivery_to_minutes'), delivery_to_minutes, 
    false)

WebUI.check(findTestObject('Page_Marketing  Promotion (Coupon)/input_promotion_dataavail_peri'))

WebUI.setText(findTestObject('Page_Marketing  Promotion (Coupon)/input_promotion_datafrom_date'), available_from_date)

WebUI.selectOptionByValue(findTestObject('Page_Marketing  Promotion (Coupon)/Available_from_hour'), avaible_from_hour, false)

WebUI.selectOptionByValue(findTestObject('Page_Marketing  Promotion (Coupon)/Available_from_minutes'), availble_from_minutes, 
    false)

WebUI.setText(findTestObject('Page_Marketing  Promotion (Coupon)/input_promotion_datadelivery_to'), available_to_day)

WebUI.selectOptionByValue(findTestObject('Page_Marketing  Promotion (Coupon)/Available_to_hour'), available_to_hour, false)

WebUI.selectOptionByValue(findTestObject('Page_Marketing  Promotion (Coupon)/Available_to_minutes'), available_to_minutes, 
    false)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Marketing  Promotion (Coupon)/create button'))

WebUI.waitForPageLoad(0)

