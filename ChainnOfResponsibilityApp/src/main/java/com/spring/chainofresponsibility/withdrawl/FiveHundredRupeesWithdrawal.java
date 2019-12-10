package com.spring.chainofresponsibility.withdrawl;

public class FiveHundredRupeesWithdrawal extends RupeeWithdrawal implements AmountWithdrawal {

	private RupeeWithdrawal twoHundredRupeeWithdrawal;

	public FiveHundredRupeesWithdrawal() {
		super();
	}
	
	public void setTwoHundredRupeeWithdrawal(RupeeWithdrawal twoHundredRupeeWithdrawal) {
		this.twoHundredRupeeWithdrawal = twoHundredRupeeWithdrawal;
	}

	public void startAmountWithdrawal(Integer p_totalNoteCount, Integer p_remainingAmount) {
		System.out.println(getAllowedLimit() + " :: " + p_totalNoteCount);
		System.out.println("Remaining Amount " + " :: " + p_remainingAmount);
	}

	@Override
	public void doAmountCalculation(final Integer p_amountWithdrewal) {
		Integer p_totalAllowedAmount = getAllowedLimit();

		if (null != p_totalAllowedAmount && null != p_amountWithdrewal) {
			Integer l_totalNoteCount = p_amountWithdrewal / p_totalAllowedAmount;
			Integer l_remainingAmount = p_amountWithdrewal % p_totalAllowedAmount;
			
			startAmountWithdrawal(l_totalNoteCount, l_remainingAmount);

			if (null != l_remainingAmount && l_remainingAmount > 0) {
				twoHundredRupeeWithdrawal.doAmountCalculation(l_remainingAmount);
			}

		}

	}

}
