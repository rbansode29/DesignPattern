package com.spring.chainofresponsibility.withdrawl;

public interface AmountWithdrawal {
	public void startAmountWithdrawal(final Integer p_totalNoteCount ,final  Integer p_remainingAmount);
}
