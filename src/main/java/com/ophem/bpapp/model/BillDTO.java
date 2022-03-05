package com.ophem.bpapp.model;

public class BillDTO {

	private CardNumber cardNo;
	private Amount amount;

	public CardNumber getCardNo() {
		return cardNo;
	}

	public void setCardNo(CardNumber cardNo) {
		this.cardNo = cardNo;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return getCardNo()+" has been used to pay for your goods worth "+getAmount()+". Thank you...";
	}

	
}
