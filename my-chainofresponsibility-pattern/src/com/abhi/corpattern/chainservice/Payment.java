/**
 * 
 */
package com.abhi.corpattern.chainservice;

/**
 * @author Abhinav
 *
 */
public abstract class Payment {

	protected int paymentType;

	protected Payment payment;

	/**
	 * @param nextPayment
	 */
	public void setPaymentType(Payment nextPayment) {
		this.payment = nextPayment;
	}

	/**
	 * @param paymentType
	 */
	public void executePayment(int paymentType) {

		if (this.paymentType == paymentType) {
			debitAmount();
		}

		if (payment != null) {
			payment.executePayment(paymentType);
		}
	}

	/**
	 * 
	 */
	abstract protected void debitAmount();

}
