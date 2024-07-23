package com.hm.wallet.dao;

import java.sql.SQLException;
import java.util.Collection;
//import java.util.List;

import com.hm.wallet.entity.Wallet;

public interface WalletDao {
	//CRUD
	Wallet addWallet(Wallet newWallet) throws SQLException;
	Wallet getWalletByEmailId(String walletEmailId) throws SQLException ;
	Wallet updateWallet(Wallet wallet) throws SQLException;
	Wallet deleteWalletByEmailId(String walletEmailID) throws SQLException;
	Collection<Wallet> getWallets() throws SQLException;
}
