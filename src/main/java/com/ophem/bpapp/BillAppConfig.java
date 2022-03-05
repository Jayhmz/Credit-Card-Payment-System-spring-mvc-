package com.ophem.bpapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.ophem.bpapp.formatter.AmountFormatter;
import com.ophem.bpapp.formatter.CreditCardFormatter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.ophem"})
public class BillAppConfig implements WebMvcConfigurer{
	
	@Bean
	InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		
		registry.addFormatter(new CreditCardFormatter());
		registry.addFormatter(new AmountFormatter());
	}
	

}
