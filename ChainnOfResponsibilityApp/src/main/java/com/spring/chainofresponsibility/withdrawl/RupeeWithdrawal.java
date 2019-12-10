package com.spring.chainofresponsibility.withdrawl;

public abstract class RupeeWithdrawal {
	private Integer allowedLimit;

	public Integer getAllowedLimit() {
		return allowedLimit;
	}

	public void setAllowedLimit(Integer allowedLimit) {
		this.allowedLimit = allowedLimit;
	}
	
	public abstract void doAmountCalculation( Integer p_remainingAmount);
}
