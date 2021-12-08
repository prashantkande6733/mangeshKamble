package com.utility;

import com.base.BaseClass;

public class DriverUtility extends BaseClass {

	public void switchofFrameById(String id) {
		driver.switchTo().frame(id);
	}
	public void switchofFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}
	 public void switchofFrameByElement(String element) {
		driver.switchTo().frame(element);
	}
	 public void switchToWindow(String id) {
			driver.switchTo().window(id);
}
}