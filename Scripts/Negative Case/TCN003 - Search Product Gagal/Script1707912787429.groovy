import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\asus\\Downloads\\Documents\\Compressed\\Advantage+demo+3.2.apk', true)

Mobile.setText(findTestObject('Object Repository/search/searchbar'), "asus rog", 10)

Mobile.tap(findTestObject('Object Repository/search/search button'), 10)

boolean result = Mobile.verifyElementExist(findTestObject('Object Repository/search/android.widget.TextView - - No results for asus rog -'), 0)

if (result ==  true) {
	Mobile.tap(findTestObject('Object Repository/search/swipebar'), 10)
	Mobile.tap(findTestObject('Object Repository/search/android.widget.TextView - HOME'), 10)
	
	Mobile.setText(findTestObject('Object Repository/search/searchbar'), "microsoft", 10)
	Mobile.tap(findTestObject('Object Repository/search/search button'), 10)
	Mobile.delay(2)
	Mobile.closeApplication()
}else {
	Mobile.delay(2)
	Mobile.closeApplication()
}