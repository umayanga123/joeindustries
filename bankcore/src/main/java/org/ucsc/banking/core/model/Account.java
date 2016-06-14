package org.ucsc.banking.core.model;

public interface Account {
	
	String getName();
	
	AccountType getAccountType();
	
	double getBalance();
	
}
