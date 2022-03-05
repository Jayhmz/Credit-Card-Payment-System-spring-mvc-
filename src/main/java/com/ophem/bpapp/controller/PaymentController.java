package com.ophem.bpapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ophem.bpapp.model.BillDTO;

@Controller
public class PaymentController {
	
	@GetMapping("/")
	public String paymentPage(@ModelAttribute("details") BillDTO dto) {
		return "payment";
	}

	@PostMapping("/pay")
	public String processPaymentPage(@ModelAttribute("details") BillDTO dto) {
		return "order";
	}
}
