package com.ophem.bpapp;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BillAppInitializr extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] arr = {BillAppConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String[] arr = {"/"};
		return arr;
	}

}
