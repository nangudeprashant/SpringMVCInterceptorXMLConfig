package com.javaLive.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
public class TransactionInterceptor extends HandlerInterceptorAdapter {
	private static final Logger logger = LoggerFactory.getLogger(TransactionInterceptor.class); // SLF4J
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
		System.out.println("In the transaction interceptor's preHanlde() method, which is specific to this URL.");
		logger.info("In the transaction interceptor's preHanlde() method, which is specific to this URL.");
		return true;
	}
} 
