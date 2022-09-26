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

Mobile.startApplication('D:\\Aulas.apk', true)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.widget.TextView - UPDATE NOW'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.widget.TextView - RESTART AULAS'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.widget.TextView - (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/aulas-trust/android.widget.EditText - Mobile Number'), '9399613815')

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.widget.TextView - CONTINUE'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.view.ViewGroup (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/aulas-trust/android.widget.EditText'), '592726')

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.widget.TextView - VERIFY'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.widget.TextView - trust'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.widget.TextView - 2'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.widget.TextView - Fee Payments'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.switchToNative()

Mobile.switchToLandscape()

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot7113158363983720147.png')

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.widget.TextView - More'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.view.ViewGroup (5)'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.webkit.WebView'), 0)

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot1817792943772205195.png')

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.view.ViewGroup (6)'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-trust/android.widget.TextView - LOG OUT'), 0)

Mobile.closeApplication()

