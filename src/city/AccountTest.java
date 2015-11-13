package city;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	protected double fst;
	protected double debit;
	protected double profit;
	protected Account account;
	protected Account accountBlank;
	
	
	
	@Before
	public void before() {
		fst = 45.50;
		debit = 1.50;
		profit = 5.40;
		account = new Account(fst);
		accountBlank = new Account();
	}
	
	@Test
	public void newAccountTest(){
		assertNotNull(accountBlank);
		assertTrue(accountBlank.balanced() == 0);
	}

	@Test
	public void accountBasicDebitTest(){
		assertTrue(account.balanced() == fst);
		account.debit(debit);
		assertEquals((fst - debit),account.balanced(),0.01);
	}
	
	@Test
	public void accountBasicProfitTest(){
		assertTrue(account.balanced() == fst);
		account.credit(profit);
		assertEquals((fst + profit),account.balanced(),0.01);
	}
	
}
