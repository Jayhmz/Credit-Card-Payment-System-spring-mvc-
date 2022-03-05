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

//		amount.setAmount(digit);

		Currency symbol = Currency.getInstance(locale.UK);

		System.out.println(symbol.toString());

		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale.UK);

		System.out.println(currencyFormatter.format(digit));

		amount.setSymbol(currencyFormatter.format(digit));

		return amount;
	}

}
