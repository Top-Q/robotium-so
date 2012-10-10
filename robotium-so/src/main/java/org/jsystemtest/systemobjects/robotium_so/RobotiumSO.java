package org.jsystemtest.systemobjects.robotium_so;

import java.util.Properties;

import org.jsystemtest.mobile.robotium_client.impl.RobotiumClientImpl;

import com.android.ddmlib.InstallException;

import jsystem.framework.system.SystemObjectImpl;

public class RobotiumSO extends SystemObjectImpl {

	public RobotiumClientImpl robotium;

	private String deviceSerial = "32306B07F6D000EC";

	private String apkLocation = "C:\\Users\\itai_a\\git\\mobile-automation\\robotium-server\\bin\\robotium-server.apk";

	private String host = "localhost";

	private String port = "4321";

	private boolean deployServer = false;

	private boolean launchServer = true;

	public void init() throws InstallException, Exception {
		super.init();
		final Properties configProperties = new Properties();
		configProperties.setProperty("DeviceSerail", deviceSerial);
		configProperties.setProperty("ApkLocation", apkLocation);
		configProperties.setProperty("Host", host);
		configProperties.setProperty("Port", port);
		robotium = new RobotiumClientImpl(configProperties, deployServer, launchServer);
	}

	public String getDeviceSerial() {
		return deviceSerial;
	}

	public void setDeviceSerial(String deviceSerial) {
		this.deviceSerial = deviceSerial;
	}

	public String getApkLocation() {
		return apkLocation;
	}

	public void setApkLocation(String apkLocation) {
		this.apkLocation = apkLocation;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public boolean isDeployServer() {
		return deployServer;
	}

	public void setDeployServer(boolean deployServer) {
		this.deployServer = deployServer;
	}

	public boolean isLaunchServer() {
		return launchServer;
	}

	public void setLaunchServer(boolean launchServer) {
		this.launchServer = launchServer;
	}

}
