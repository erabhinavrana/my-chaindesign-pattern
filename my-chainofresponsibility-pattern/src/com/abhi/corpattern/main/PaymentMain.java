/**
 * 
 */
package com.abhi.corpattern.main;

import com.abhi.corpattern.chainservice.Payment;
import com.abhi.corpattern.chainservice.impl.CreditCardPayment;
import com.abhi.corpattern.chainservice.impl.DebitCardPayment;
import com.abhi.corpattern.chainservice.impl.NetBankingPayment;
import com.abhi.corpattern.constant.PaymentConstant;

/**
 * @author Abhinav
 *
 */
public class PaymentMain {

	/**
	 * @return
	 */
	public static Payment getChainOfPaymentType() {
		Payment creditcardpayment = new CreditCardPayment(
				PaymentConstant.CREDIT_CARD);
		Payment debitcardpayment = new DebitCardPayment(
				PaymentConstant.DEBIT_CARD);
		Payment netbankingpayment = new NetBankingPayment(
				PaymentConstant.NET_BANKING);

		creditcardpayment.setPaymentType(debitcardpayment);
		debitcardpayment.setPaymentType(netbankingpayment);

		return creditcardpayment;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Payment payment = getChainOfPaymentType();

		payment.executePayment(PaymentConstant.DEBIT_CARD);
		payment.executePayment(PaymentConstant.NET_BANKING);

	}

}
