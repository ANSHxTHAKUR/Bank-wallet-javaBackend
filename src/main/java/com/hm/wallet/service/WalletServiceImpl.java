package com.hm.wallet.service;

import java.sql.SQLException;
//import java.util.ArrayList;

import java.util.List;

import com.hm.wallet.dao.WalletDao;
import com.hm.wallet.dao.WalletDaoRDBMSImpl;

import com.hm.wallet.entity.Wallet;
import com.hm.wallet.exceptions.WalletException;

public class WalletServiceImpl implements WalletService {

	// private WalletDao walletDao = new WalletDaoMapImpl(); // Map
	private WalletDao walletDao = new WalletDaoRDBMSImpl(); // RDBMS

	@Override
	public Wallet registerNewUserWallet(Wallet newWallet) throws WalletException {
		// check if user email already exists

		Wallet wallet = null;

		try {
			wallet = this.walletDao.addWallet(newWallet);
		} catch (SQLException e) {

			throw new WalletException(e.getMessage());
		}
		return wallet;
	}

	@Override
	public Wallet getUserWalletByEmailId(String walletEmailID) throws WalletException {
		Wallet wallet = null;

		try {
			wallet = this.walletDao.getWalletByEmailId(walletEmailID);
		} catch (SQLException e) {

			throw new WalletException(e.getMessage());
		}
		return wallet;
	}

	@Override
	public Double withdrawFundsFromWalletByEmailId(String walletEmailId, Double amount) throws WalletException {

		Wallet foundUserWallet;
		try {
			foundUserWallet = this.walletDao.getWalletByEmailId(walletEmailId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new WalletException(e.getMessage());
		}
		if (foundUserWallet == null)
			throw new WalletException("User Wallet not found for email:" + walletEmailId);

		Double balance = foundUserWallet.getBalance();
		if (amount > balance)
			throw new WalletException("Current balance is low:" + balance);

		foundUserWallet.setBalance(balance - amount);
		Wallet updatedWallet;
		try {
			updatedWallet = this.walletDao.updateWallet(foundUserWallet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new WalletException("User Wallet not found for email:" + walletEmailId);
		}
		return updatedWallet.getBalance();
	}

	@Override
	public Double depositFundsToWalletByEmailId(String walletEmailId, Double amount) throws WalletException {

		Wallet foundWallet = null;

		try {
			foundWallet = this.walletDao.getWalletByEmailId(walletEmailId);
		} catch (SQLException e) {

			throw new WalletException(e.getMessage());
		}

		if (foundWallet == null) {
			throw new WalletException("Wallet not found for :" + walletEmailId);
		}

		Double balance = foundWallet.getBalance();
		foundWallet.setBalance(balance + amount);

		try {
			foundWallet = this.walletDao.updateWallet(foundWallet);
		} catch (SQLException e) {

			throw new WalletException(e.getMessage());
		}

		return foundWallet.getBalance();
	}

	@Override
	public Boolean fundTransfer(String fromWalletEmailId, String toWalletEmailId, Double amount)
			throws WalletException {
		Wallet fromWallet = null;
		try {
			fromWallet = this.walletDao.getWalletByEmailId(fromWalletEmailId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new WalletException(e.getMessage());
		}
		if (fromWallet == null)
			throw new WalletException("From user not found.:" + fromWalletEmailId);
		Double fromBalance = fromWallet.getBalance();
		if (amount > fromBalance)
			throw new WalletException("Low balance:" + fromBalance);

		Wallet toWallet = null;
		;
		try {
			toWallet = this.walletDao.getWalletByEmailId(toWalletEmailId);
		} catch (SQLException e) {
			throw new WalletException(e.getMessage());
		}
		if (toWallet == null)
			throw new WalletException("To user not found.:" + toWalletEmailId);

		fromWallet.setBalance(fromBalance - amount);
		Double toBalance = toWallet.getBalance();
		toWallet.setBalance(toBalance + amount);

		try {
			this.walletDao.updateWallet(fromWallet);
		} catch (SQLException e) {
			throw new WalletException(e.getMessage());
		}
		try {
			this.walletDao.updateWallet(toWallet);
		} catch (SQLException e) {
			throw new WalletException(e.getMessage());
		}

		return true;
	}
//
	@Override
	public List<Wallet> getAllWallets() throws WalletException {

		List<Wallet> userWallets = null;
		
		try {
			userWallets = (List<Wallet>) this.walletDao.getWallets();
		} catch (SQLException e) {
			throw new WalletException(e.getMessage());
		}
		if (userWallets.size() == 0)
			throw new WalletException("No wallet users found");

		return userWallets;
	}
//
//	@Override
//	public Wallet loginToUserWallet(String email, String password) throws WalletException {
//
//		Wallet foundWallet = this.walletDao.getWalletByEmailId(email);
//		if (foundWallet == null)
//			throw new WalletException("User name / pwd incorrect.");
//		if (!foundWallet.getPassword().equals(password))
//			throw new WalletException("User name / pwd incorrect.");
//
//		return new Wallet(foundWallet.getId(), foundWallet.getName(), foundWallet.getEmail(), foundWallet.getBalance(),
//				null);
//	}
//
	@Override
	public Boolean changeUserWalletPassword(String walletEmailId, String oldPassword, String newPassword)
			throws WalletException {
		Wallet foundWallet;
		try {
			foundWallet = this.walletDao.getWalletByEmailId(walletEmailId);
		} catch (SQLException e) {
			throw new WalletException(e.getMessage());
		}
		if (foundWallet == null)
			throw new WalletException("User not found");
		
		
		if (!foundWallet.getPassword().equals(oldPassword))
			throw new WalletException("Old Password do not match.");
		
		
		foundWallet.setPassword(newPassword);
		try {
			this.walletDao.updateWallet(foundWallet);
		} catch (SQLException e) {
			throw new WalletException(e.getMessage());
		}

		return true;
	}

	@Override
	public Boolean deleteUserByEMailId(String walletEmailId) throws WalletException {
		
		Wallet foundWallet;
		boolean flag = false;
		
		try {
			foundWallet = this.walletDao.getWalletByEmailId(walletEmailId);
			
		} catch (SQLException e) {
			throw new WalletException(e.getMessage());
		}
		
		if(foundWallet==null) throw new WalletException("User not found");
		try {
			this.walletDao.deleteWalletByEmailId(walletEmailId);
		    flag = true;
		} catch (SQLException e) {
			throw new WalletException(e.getMessage());
		}
		return flag;
	}

}
