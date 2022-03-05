package com.ophem.bpapp.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.ophem.bpapp.model.CardNumber;

public class CreditCardFormatter implements Formatter<CardNumber>{

	@Override
	public String print(CardNumber object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CardNumber parse(String cNum, Locale locale) throws ParseException {
		
		String[] split = cNum.split("-");
		
		CardNumber cardNumber = new CardNumber();
		
		if(cNum.indexOf("-") == -1) {
			cardNumber.setFirst(cNum.substring(0, 4));
			cardNumber.setSecond(cNum.substring(4, 8));
			cardNumber.setThird(cNum.substring(8, 12));
			cardNumber.setFourth(cNum.substring(12, 16));
		}
		
		
//		cardNumber.setFirst(split[0]);
//		cardNumber.setSecond(split[1]);
//		cardNumber.setThird(split[2]);
//		cardNumber.setFourth(split[3]);
		
		return cardNumber;
	}
	
}
