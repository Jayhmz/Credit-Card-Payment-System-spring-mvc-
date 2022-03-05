package com.ophem.bpapp.formatter;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.ophem.bpapp.model.Amount;

public class AmountFormatter implements Formatter<Amount> {

	private Style symbol;

	@Override
	public String print(Amount object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Amount parse(String currency, Locale locale) throws ParseException {

		String[] split = currency.split(" ");
		
		BigDecimal digit = new BigDecimal(split[0]);
		
		Amount amount = new Amount();

		amount.setAmount(digit);
		
		System.out.println(split[1]);
		String currencysymbol = split[1].toUpperCase().toString();

		Currency symbol = Currency.getInstance(currencysymbol);

		System.out.println(symbol.getSymbol());

		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale(currencysymbol));
//
		System.out.println(currencyFormatter.getCurrency().getSymbol());

		amount.setSymbol(currencyFormatter.getCurrency().getSymbol());

		return amount;
	}

}
