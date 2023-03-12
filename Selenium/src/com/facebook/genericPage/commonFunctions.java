package com.facebook.genericPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class commonFunctions extends MasterPage {

	public commonFunctions() throws Exception {
		super();
	}

	// click method
	public void click(String xpathkey) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).click();

	}

	// Enter Data
	public void enterData(String xpathkey, String testData) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(td.getProperty(testData));

	}

	// clear Data
	public void clearData(String xpathkey) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).clear();

	}

	// Mouse Hover
	public void moveToElement(String xpathkey) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(or.getProperty(xpathkey)))).build().perform();

	}

	// Click List of web element
	public void clickListElement(String xpathkey, String testData) {
		List<WebElement> radios = driver.findElements(By.xpath(or.getProperty(xpathkey)));
		for (int i = 0; i < radios.size(); i++) {
			if (radios.get(i).getText().equalsIgnoreCase(td.getProperty(testData))) {
				radios.get(i).click();
			}
		}
	}

	// select Dropdown values
	public void selectDropdownValue(String xpathkey, String testData1, String testData2) {
		WebElement ele = driver.findElement(By.xpath(or.getProperty(xpathkey)));
		Select webEle = new Select(ele);
		webEle.selectByVisibleText(td.getProperty(testData1));
		webEle.selectByValue(td.getProperty(testData2));
	}

}
