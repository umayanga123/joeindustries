package org.ucsc.banking.core.util;

import org.ucsc.banking.core.model.AccountType;

public class AccountTypePrettyPrinter {
	
	public static String printAccountType(AccountType accountType) {
		return "The account type is "  + accountType.getAccountTypeName();
	}

}
