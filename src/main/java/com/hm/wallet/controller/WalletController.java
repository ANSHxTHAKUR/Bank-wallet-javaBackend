package com.hm.wallet.controller;

import com.hm.wallet.entity.Wallet;
import com.hm.wallet.exceptions.WalletException;
import com.hm.wallet.service.WalletService;
import com.hm.wallet.service.WalletServiceImpl;

public class WalletController {

	public static void main(String[] args) {

		WalletService walletService = new WalletServiceImpl();

		// 1--> REGISTER NEW WALLET

//		 Wallet newWalletTwo = new Wallet(0, "prince", "prince@gmail.com", 1400.0,
//		 "prince@123");
//		Wallet newWalletTwo = new Wallet(0, "Raghu", "raghu@gmail.com", 500.0, "Raghu@123");
//		Wallet newWalletTwo = new Wallet(0, "Ansh", "Ansh@gmail.com", 1000.0, "Ansh@123");
//		Wallet newWalletTwo = new Wallet(0, "dell", "dell@gmail.com", 100.0, "dell@123");

//     1---> REGISTER NEW WALLET
		
//		Wallet registeredWallet;
//		try {
//			registeredWallet = walletService.registerNewUserWallet(newWalletTwo);
//			System.out.println("Wallet info:" + registeredWallet);
//		} catch (WalletException e) {
//			System.out.println(e.getMessage());
//		}

		// --> END OF REGISTER NEW WALLET
		
		

		// 2--> GET USER BY EMAIL ID

//		Wallet foundWallet;
//		try {
//
//			foundWallet = walletService.getUserWalletByEmailId("dell@gmail.com");
//			System.out.println("Wallet user found with dell@gmail.com: " + foundWallet);
//
//		} catch (WalletException e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
//		
		
		// --> END OF GET USER WALLET BY EMAILID
		
		
		
		// 3--> Deposit depositFundsToWalletByEmailId

//		Double currentBalance;
//		
//		try {
//			currentBalance = walletService.depositFundsToWalletByEmailId("prince@gmail.com",5000.0);
//			System.out.println("After deposit the current balance in wallet is "+ currentBalance +"in "+ "price accounts");
//		} catch (WalletException e) {
//			System.out.println(e.getMessage());
//		}
		
		
		
		
		
		
		// --> End of depositFundsToWalletEmailId
		
		
      // --> 4 Withdrawal of Funds
		
//		Double currentBalance;
//		try {
//			currentBalance = walletService.withdrawFundsFromWalletByEmailId("Ansh@gmail.com", 1000.0);
//			System.out.println("Balance in Ansh@gmail.com wallet:" + currentBalance + " after withdrawal");
//		} catch (WalletException e) {
//
//			System.out.println(e.getMessage());
//		}

		//---> ENDS OF WITHDRAWAL OF FUNDS
		
		
	
	// 5--> Funds transfer 
	
//	try {
//		
//		if(walletService.fundTransfer("Ansh@gmail.com", "deepak@gmail.com", 1000.0))
//		System.out.println("Fund transfer success.");
//	} catch (WalletException e) {
//		System.out.println(e.getMessage());
//	}
	
	//   ---> ENDS OF FUND TRANSFER
	
		
		
	
	
		
		// 6--> GET ALL WALLETS
		
		

//		try {
//			System.out.println("All Wallets:" + walletService.getAllWallets());
//		} catch (WalletException e) {
//			System.out.println(e.getMessage());
//
//		}
		
	// 	-->END OF GET ALL WALLETS 
		
		
		
   // 	7--> // CHANGE PASSWORD OF A WALLET
		
//		try {
//			System.out.println("Change User pwd:" + walletService.changeUserWalletPassword("dell@gmail.com", "dell@123","new@123"));
//		} catch (WalletException e) {
//			System.out.println(e.getMessage());
//		}
		
		
		// ---> END OF CHANGE PASSWORD OF A WALLET

//
//		try {
//			System.out.println("User login:" + walletService.loginToUserWallet("dell@gmail.com", "dell@123"));
//		} catch (WalletException e) {
//			System.out.println(e.getMessage());
//		}
//		
		//		
//		try {
//			System.out.println("User login:" + walletService.loginToUserWallet("dell@gmail.com", "new@123"));
//		} catch (WalletException e) {
//			System.out.println(e.getMessage());
//		}
		
		
		// 8---> DELETE A USER BY EMAIL ID
//		try {
//			if(walletService.deleteUserByEMailId("dell@gmail.com")) System.out.println("User Deleted");
//		} catch (WalletException e) {
//			System.out.println(e.getMessage());
//		}
//		
		//---> END OF DELETE

	}
}
