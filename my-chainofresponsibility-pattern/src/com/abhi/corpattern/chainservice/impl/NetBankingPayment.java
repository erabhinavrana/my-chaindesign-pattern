/**
 * 
 */
package com.abhi.corpattern.chainservice.impl;

import com.abhi.corpattern.chainservice.Payment;

/**
 * @author Abhinav
 *
 */
public class NetBankingPayment extends Payment {

	/**
	 * @param type
	 */
	public NetBankingPayment(int type) {
		this.paymentType = type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.abhi.corpattern.chainservice.Payment#executePayment()
	 */
	@Override
	protected void debitAmount() {
		System.out.println("Payment has been done using Net Banking");
	}

}
