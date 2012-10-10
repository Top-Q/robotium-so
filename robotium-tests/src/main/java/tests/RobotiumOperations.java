package tests;

import jsystem.framework.TestProperties;

import org.jsystemtest.mobile.common_mobile.client.enums.HardwareButtons;
import org.junit.Test;

public class RobotiumOperations extends AbstractRobotTests {

	private int index;

	private String text;

	private HardwareButtons button;

	private int key;

	/**
	 * Launch the application on device
	 * 
	 * @throws Exception
	 */
	@Test
	@TestProperties(name = "Operation: Launch application")
	public void launch() throws Exception {
		robot.launch();
	}

	/**
	 * Click on application menu item by the specified text
	 * 
	 * @throws Exception
	 */
	@Test
	@TestProperties(name = "Operation: Find menu item with text ${text} and click", paramsInclude = { "text" })
	public void clickOnMenuItemByText() throws Exception {
		robot.clickOnMenuItem(text);
	}

	/**
	 * Click on application view with the specified index
	 * 
	 * @throws Exception
	 */
	@Test
	@TestProperties(name = "Operation: Find view with index ${index} and click", paramsInclude = { "index" })
	public void clickOnViewByIndex() throws Exception {
		robot.clickOnView(index);
	}

	@Test
	@TestProperties(name = "Operation: Find view with index ${index} and enter text ${text} ", paramsInclude = {
			"index", "text" })
	public void enterTextByIndex() throws Exception {
		robot.enterText(index, text);
	}

	@Test
	@TestProperties(name = "Operation: Find item with index ${index} in list and click", paramsInclude = { "index" })
	public void clickInListByIndex() throws Exception {
		robot.clickInList(index);
	}

	@Test
	@TestProperties(name = "Operation: Find button with index ${index} and click", paramsInclude = { "index" })
	public void clickOnButtonByIndex() throws Exception {
		robot.clickOnButton(index);
	}

	@Test
	@TestProperties(name = "Operation: Find button with text ${text} and click", paramsInclude = { "text" })
	public void clickOnButtonByText() throws Exception {
		robot.clickOnButtonWithText(text);
	}

	@Test
	@TestProperties(name = "Operation: Find text field with index ${index} and clear", paramsInclude = { "index" })
	public void clearEditText() throws Exception {
		robot.clearEditText(index);
	}

	@Test
	@TestProperties(name = "Operation: Find component with text ${text} and click", paramsInclude = { "text" })
	public void clickByText() throws Exception {
		robot.clickOnText(text);
	}

	@Test
	@TestProperties(name = "Operation: Click on hardware button ${button}", paramsInclude = { "button" })
	public void clickOnHardwareButton() throws Exception {
		robot.clickOnHardwereButton(button);
	}

	@Test
	@TestProperties(name = "Operation: Send key ${key}", paramsInclude = { "key" })
	public void sendKey() throws Exception {
		robot.sendKey(key);
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public HardwareButtons getButton() {
		return button;
	}

	public void setButton(HardwareButtons button) {
		this.button = button;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

}
