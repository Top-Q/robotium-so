package tests;

import jsystem.extensions.analyzers.text.FindText;
import jsystem.framework.TestProperties;

import org.junit.Test;

public class RobotiumAssertions extends AbstractRobotTests {

	private String expectedText;

	private int index;

	@Test
	@TestProperties(name = "Assertion: Find text with index ${index} and assert contains ${text}", paramsInclude = {
			"index", "expectedText" })
	public void assertTextByIndex() throws Exception {
		final String actualText = robot.getText(index);
		analyzer.setTestAgainstObject(actualText);
		analyzer.analyze(new FindText(expectedText));
	}

	public String getExpectedText() {
		return expectedText;
	}

	public void setExpectedText(String expectedText) {
		this.expectedText = expectedText;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
