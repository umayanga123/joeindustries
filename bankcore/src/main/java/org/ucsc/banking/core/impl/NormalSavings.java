package org.ucsc.banking.core.impl;

import org.ucsc.banking.core.model.AccountType;

public class NormalSavings implements AccountType {
	
	private static NormalSavings savings = new NormalSavings();
	
	public static NormalSavings getInstance() {
		return savings;
	}

	public int getAccountType() {
		return 0;
	}

	public String getAccountTypeName() {
		return "NormalSavings";
	}
	
}
