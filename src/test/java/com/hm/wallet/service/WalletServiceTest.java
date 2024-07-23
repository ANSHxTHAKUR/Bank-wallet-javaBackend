package com.hm.wallet.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.hm.wallet.entity.Wallet;
import com.hm.wallet.exceptions.WalletException;

@TestInstance(value = Lifecycle.PER_CLASS)
class WalletServiceTest {

//	// Double withdrawFundsFromWalletByEmailId(String walletEmailId,Double amount)
//	// throws WalletException;
//	private WalletService walletService;// = new WalletServiceImpl();
//
//	@BeforeAll
//	void initAll() {
//		this.walletService = new WalletServiceImpl();
//	}
//	@BeforeEach
//	void init() {
//		Wallet newWallet = new Wallet(1, "Dell", "dell@gmail.com", 500.0, "dell@123");
//		Wallet newWalletTwo = new Wallet(2, "Raghu", "raghu@gmail.com", 500.0, "Raghu@123");
//		walletService.registerNewUserWallet(newWallet);
//		walletService.registerNewUserWallet(newWalletTwo);
//	}
//
//	@Test
//	@DisplayName("Check if existing user is fetched")
//	void testValidUserExists() { // +ve test case
//
//		Wallet wallet = walletService.getUserWalletByEmailId("dell@gmail.com");
//		assertNotNull(wallet);
//		assertEquals("dell@gmail.com", wallet.getEmail());
//
//	}
//
//	@Test
//	@DisplayName("Check for invalid user")
//	void testInvalidUserExists() { // -ve test case
//
//		Wallet wallet = walletService.getUserWalletByEmailId("user@gmail.com");
//		assertNull(wallet);
//
//	}
//
//	@Test
//	@DisplayName("Check if invalid user email throws exception")
//	void testInvalidUserThrowsException() { // -ve test case
//
//		assertThrows(WalletException.class, () -> walletService.getUserWalletByEmailId("user@gmail.com"));
//
//	}
//
//	@Test
//	@DisplayName("Test withdraw with valid email & valid amount")
//	void testFundWithdrawForExistingUser() {
//		try {
//			assumeTrue(this.walletService!=null);
//			
//			assertEquals(500.0, walletService.getUserWalletByEmailId("dell@gmail.com").getBalance());
//			
//			assertEquals(100.0, walletService.withdrawFundsFromWalletByEmailId("dell@gmail.com", 400.0));
//			
//			assertEquals(100.0, walletService.getUserWalletByEmailId("dell@gmail.com").getBalance());
//			
//		} catch (WalletException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
