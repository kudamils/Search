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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mamikos.com/cari')

WebUI.click(findTestObject('Page_Mamikos - Cari Kost di sekitar sini Ca_9db89e/button_Saya Mengerti'))

WebUI.delay(500)

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari Kost di sekitar sini Ca_9db89e/i_Filter Lanjutan_fa fa-chevron-down'))

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari Kost di sekitar sini Ca_9db89e/label_AC'))

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari Kost di sekitar sini Ca_9db89e/label_Internet'))

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari Kost di sekitar sini Ca_9db89e/div_Fasilitas ACTVAlmari PakaianInternetKam_a444aa'))

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari Kost di sekitar sini Ca_9db89e/label_Hewan Peliharaan'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Mamikos - Cari Kost di sekitar sini Ca_9db89e/span_ aktif'), 
    0)

WebUI.verifyTextPresent('Aktif', false)

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari Kost di sekitar sini Ca_9db89e/span_ aktif'))

