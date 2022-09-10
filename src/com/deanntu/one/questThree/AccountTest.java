package com.deanntu.one.questThree;

public class AccountTest {
	
	public static void main(String[] args) {
		
		String line="601;Bank Account;23560";
		
		String[] tokens=line.split(";");
		
		Account account=new Account();
		account.setAccountId(Long.parseLong(tokens[0]));
		account.setAccountName(tokens[1]);
		account.setAmountLocal(Double.parseDouble(tokens[2]));
		
		account.print();
		
		StringBuilder builder=new StringBuilder();
		String string= builder.append(account.getAccountId()).append(";")
							  .append(account.getAccountName()).append(";")
							  .append(account.getAmountLocal())
							  .toString();
		
		System.out.printf("\n%s",string);
	}

}