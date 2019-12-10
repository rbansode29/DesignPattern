package com.spring.chainofresponsibility.withdrawl;

public class OneHundredRupeesWithdrawal extends RupeeWithdrawal implements AmountWithdrawal {

	
	private RupeeWithdrawal fiftyRupeeWithdrawal;
	
	public OneHundredRupeesWithdrawal() {
		super();		
	}

	public void setFiftyRupeeWithdrawal(RupeeWithdrawal fiftyRupeeWithdrawal) {
		this.fiftyRupeeWithdrawal = fiftyRupeeWithdrawal;
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
				fiftyRupeeWithdrawal.doAmountCalculation(l_remainingAmount);
			}

		}

	}




	

}
