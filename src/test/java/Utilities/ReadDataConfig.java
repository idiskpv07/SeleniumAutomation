package Utilities;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.util.Properties;

public class ReadDataConfig {

	Properties prop;

	public ReadDataConfig() throws Exception {

		FileInputStream fis = new FileInputStream("./testData/config.properties");

		prop = new Properties();

		prop.load(fis);

		// prop.getProperty(null)

	}
	
	public String get_SampleAppURL() {

		return prop.getProperty("sample_appURL");

	}
	
	public String get_switchToURL() {

		return prop.getProperty("switchToURL");

	}
	
	public String get_payTM() {

		return prop.getProperty("payTM");

	}

	public String get_NOP_URL() {

		return prop.getProperty("appURL");

	}

	public String get_adminuser() {

		return prop.getProperty("adminUserName");

	}

	public String get_adminPass() {

		return prop.getProperty("adminPassword");

	}

}
