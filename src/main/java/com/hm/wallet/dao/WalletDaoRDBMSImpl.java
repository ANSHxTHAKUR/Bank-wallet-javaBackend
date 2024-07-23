package com.hm.wallet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.hm.wallet.entity.Wallet;
import com.hm.wallet.util.DbUtil;

public class WalletDaoRDBMSImpl implements WalletDao {

	private Connection connection;

	public WalletDaoRDBMSImpl() {
		super();
		this.connection = DbUtil.getDbMySqlConnection();
	}

	@Override
	public Wallet addWallet(Wallet newWallet) throws SQLException {
		String sql = "INSERT INTO wallet(name,email,balance,password) values(?,?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, newWallet.getName());
			preparedStatement.setString(2, newWallet.getEmail());
			preparedStatement.setDouble(3, newWallet.getBalance());
			preparedStatement.setString(4, newWallet.getPassword());
			if (preparedStatement.executeUpdate() > 0) {
				ResultSet autoKeys = preparedStatement.getGeneratedKeys();
				if (autoKeys.next()) {
					newWallet.setId(autoKeys.getInt(1));
					return newWallet;
				}

			}
		} catch (SQLException e) {

			throw e;
		}
		return null;
	}

	@Override
	public Wallet getWalletByEmailId(String walletEmailId) throws SQLException {
		Wallet wallet = new Wallet();
		String getByEmail = "select * from wallet where email=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(getByEmail);
			preparedStatement.setString(1, walletEmailId);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
			wallet.setId(resultSet.getInt(1));
			wallet.setName(resultSet.getString(2));
			wallet.setEmail(resultSet.getString(3));
			wallet.setBalance(resultSet.getDouble(4));
			wallet.setPassword(resultSet.getString(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw e;
		}
		return wallet;

	}

	@Override
	public Wallet updateWallet(Wallet wallet) throws SQLException {
		
		
		String sql = "update wallet set balance=?,password=? where email=?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setDouble(1, wallet.getBalance());
			preparedStatement.setString(2, wallet.getPassword());
			preparedStatement.setString(3, wallet.getEmail());
			
			preparedStatement.executeUpdate();
				
			
		} catch (SQLException e) {
			throw e;
		}
		
		return wallet;
	}

	@Override
	public Wallet deleteWalletByEmailId(String walletEmailID) throws SQLException {
		
		String sql = "DELETE from wallet where email=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, walletEmailID);
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw e;
		}
		
		
		return null;
	}

	@Override
	public Collection<Wallet> getWallets() throws SQLException {
		
		List<Wallet> walletList = new ArrayList<>();
		
		String sql ="select * from wallet";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				Wallet wallet = new Wallet();
				
				wallet.setId(rs.getInt(1));
				wallet.setName(rs.getString(2));
				wallet.setEmail(rs.getString(3));
				wallet.setBalance(rs.getDouble(4));
				wallet.setPassword(rs.getString(5));
				
				walletList.add(wallet);
			}
			
		} catch (SQLException e) {
			
			throw e;
		}
		
		
		return walletList;
	}

}
