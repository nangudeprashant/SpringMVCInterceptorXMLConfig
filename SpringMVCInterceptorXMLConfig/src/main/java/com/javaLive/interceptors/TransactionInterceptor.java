package com.javaLive.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
public class TransactionInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
		System.out.println("In the transaction interceptor's preHanlde() method, which is specific to this URL.");
//		System.out.println("Got request to save data : name:"+request.getParameter("name"));
		return true;
	}
} 
