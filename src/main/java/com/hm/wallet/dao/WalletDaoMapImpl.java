package com.hm.wallet.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hm.wallet.entity.Wallet;

public class WalletDaoMapImpl implements WalletDao {

	private Map<String, Wallet> walletMap = new HashMap<String, Wallet>();

	@Override
	public Wallet addWallet(Wallet newWallet) {
		walletMap.put(newWallet.getEmail(), newWallet);
		return walletMap.get(newWallet.getEmail());
	}

	@Override
	public Wallet getWalletByEmailId(String walletEmailId) {
		
		return this.walletMap.get(walletEmailId);
	}

	@Override
	public Wallet updateWallet(Wallet wallet) {
		this.walletMap.replace(wallet.getEmail(), wallet);
		
		return this.walletMap.get(wallet.getEmail());
	}

	@Override
	public Wallet deleteWalletByEmailId(String walletEmailID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Wallet> getWallets() {
		
		return this.walletMap.values();
	}

}
