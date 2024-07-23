package com.hm.wallet.service;

import java.util.List;

//import java.util.List;

import com.hm.wallet.entity.Wallet;
import com.hm.wallet.exceptions.WalletException;

public interface WalletService {
	
	Wallet registerNewUserWallet(Wallet newWallet) throws WalletException;
	
	Wallet getUserWalletByEmailId(String walletEmailID) throws WalletException;

	Double depositFundsToWalletByEmailId(String walletEmailId,Double amount) throws WalletException;
	
	Double withdrawFundsFromWalletByEmailId(String walletEmailId,Double amount) throws WalletException;
	
	Boolean fundTransfer(String fromWalletEmailId, String toWalletEmailId,Double amount)throws WalletException;
	
	List<Wallet> getAllWallets()throws WalletException;
	
//	Wallet loginToUserWallet(String email, String password)throws WalletException;
	
	Boolean changeUserWalletPassword(String walletEmailId, String oldPassword, String newPassword)throws WalletException;
	
	Boolean deleteUserByEMailId(String walletEmailId) throws WalletException;
}
