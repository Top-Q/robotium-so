package tests;

import junit.framework.SystemTestCase4;

import org.jsystemtest.mobile.robotium_client.impl.RobotiumClientImpl;
import org.jsystemtest.systemobjects.robotium_so.RobotiumSO;
import org.junit.Before;

public abstract class AbstractRobotTests extends SystemTestCase4 {
	protected RobotiumClientImpl robot;

	@Before
	public void getSystemObjects() throws Exception {
		RobotiumSO client = (RobotiumSO) system.getSystemObject("client");
		robot = client.robotium;
	}
}
