package org.unbiquitous.uos.core.driverManager;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteDriverManager {
	public static Test suite() { 
        TestSuite suite = new TestSuite(TestSuiteDriverManager.class.getName());

//        suite.addTestSuite(TestSendMessageLoopback.class);
        return suite; 
	}
}
