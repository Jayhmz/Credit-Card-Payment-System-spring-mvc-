package com.ophem.bpapp.model;

import java.math.BigDecimal;

public class Amount {

	private BigDecimal amount;
	private String symbol;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return getSymbol()+getAmount();
	}
	

}
