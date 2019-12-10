package com.spring.chainofresponsibility.withdrawl;

public class TwoHundredRupeesWithdrawal extends RupeeWithdrawal implements AmountWithdrawal {

	private RupeeWithdrawal oneHundredRupeeWithdrawal;
	
	public TwoHundredRupeesWithdrawal() {
		super();
	}

	
	public void setOneHundredRupeeWithdrawal(RupeeWithdrawal oneHundredRupeeWithdrawal) {
		this.oneHundredRupeeWithdrawal = oneHundredRupeeWithdrawal;
	}
	
	public void startAmountWithdrawal(Integer p_totalNoteCount, Integer p_remainingAmount) {
		System.out.println(getAllowedLimit() + " :: " + p_totalNoteCount);
		System.out.println("Remaining Amount " + " :: " + p_remainingAmount);
	}

	@Override
	public void doAmountCalculation(Integer p_remainingAmount) {		
		Integer p_totalAllowedAmount = getAllowedLimit();

		if (null != p_totalAllowedAmount && null != p_remainingAmount) {
			Integer l_totalNoteCount = p_remainingAmount / p_totalAllowedAmount;
			Integer l_remainingAmount = p_remainingAmount % p_totalAllowedAmount;
			startAmountWithdrawal(l_totalNoteCount, l_remainingAmount);

			if (null != l_remainingAmount && l_remainingAmount > 0) {
				oneHundredRupeeWithdrawal.doAmountCalculation(l_remainingAmount);
			}

		}

	}


}
