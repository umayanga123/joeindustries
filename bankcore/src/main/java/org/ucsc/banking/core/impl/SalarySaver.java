package org.ucsc.banking.core.impl;

import org.ucsc.banking.core.model.AccountType;

public class SalarySaver implements AccountType {
	
	private static SalarySaver savings = new SalarySaver();
	
	public static SalarySaver getInstance() {
		return savings;
	}

	public int getAccountType() {
		return 0;
	}

	public String getAccountTypeName() {
		return null;
	}
	

}
