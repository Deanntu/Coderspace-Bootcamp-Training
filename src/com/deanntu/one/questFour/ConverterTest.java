package com.deanntu.one.questFour;

import com.deanntu.one.questThree.Account;

public class ConverterTest {

	public static void main(String[] args) {
		
		String line="601;Bank Account;23560";
		Account account= new Account();
		AccountConverter converter= new AccountConverter();

		account=converter.parse(line);
		account.print();
		
		String string=converter.format(account);
		System.out.printf("\n%s",string);
	}
}
