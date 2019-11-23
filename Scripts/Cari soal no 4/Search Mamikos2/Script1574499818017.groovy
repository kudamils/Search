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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mamikos.com/cari')

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari Kost di sekitar sini Ca_9db89e/button_Saya Mengerti'))

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari Kost di sekitar sini Ca_9db89e/label_Tipe Kost'))

while (true) {
}

if (true) {
    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mamikos - Cari Kost di sekitar sini Ca_9db89e/select_Semua Khusus Putri Khusus Putra Putr_52106c'), 
        '2', true)

    WebUI.verifyTextNotPresent('Putra', false)

    WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari Kost di sekitar sini Ca_9db89e/a_Lihat lebih banyak lagi'))
} else if (true) {
    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mamikos - Cari Kost di sekitar sini Ca_9db89e/select_Semua Khusus Putri Khusus Putra Putr_52106c'), 
        '1', true)

    WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari Kost di sekitar sini Ca_9db89e/a_Lihat lebih banyak lagi'))

    WebUI.verifyTextNotPresent('Putri', false)
} else {
    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mamikos - Cari Kost di sekitar sini Ca_9db89e/select_Semua Khusus Putri Khusus Putra Putr_52106c'), 
        '0', true)

    WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari Kost di sekitar sini Ca_9db89e/div_Campur'))

    WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari Kost di sekitar sini Ca_9db89e/a_Lihat lebih banyak lagi'))
}
