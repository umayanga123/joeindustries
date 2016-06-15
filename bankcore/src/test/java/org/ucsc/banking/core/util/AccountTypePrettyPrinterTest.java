package org.ucsc.banking.core.util;

import org.ucsc.banking.core.impl.NormalSavings;
import org.ucsc.banking.core.impl.SalarySaver;

import junit.framework.*;

public class AccountTypePrettyPrinterTest extends TestCase {

	// test method to add two values
	public void testPrintAccountType() {
		AccountTypePrettyPrinter.printAccountType(NormalSavings.getInstance());
		AccountTypePrettyPrinter.printAccountType(SalarySaver.getInstance());
		AccountTypePrettyPrinter.printAccountType(KidSavings.getInstance());
	}

}
