package com.spring.chainofresponsibility.withdrawl;

public class BankApplication {

	private RupeeWithdrawal rupeeWithdrawal;

	private Integer amountWithdrawal;
	
	public RupeeWithdrawal getRupeeWithdrawal() {
		return rupeeWithdrawal;
	}

	public void setRupeeWithdrawal(RupeeWithdrawal rupeeWithdrawal) {
		this.rupeeWithdrawal = rupeeWithdrawal;
	}

	public void doAmountWithdrawal(final Integer p_totalAmount) {
		rupeeWithdrawal.doAmountCalculation(p_totalAmount);
	}

	public Integer getAmountWithdrawal() {
		return amountWithdrawal;
	}

	public void setAmountWithdrawal(Integer amountWithdrawal) {
		this.amountWithdrawal = amountWithdrawal;
	}

}
