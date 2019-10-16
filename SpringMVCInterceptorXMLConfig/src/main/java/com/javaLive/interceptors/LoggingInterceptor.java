package com.javaLive.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
public class LoggingInterceptor implements HandlerInterceptor  {
	private static final Logger logger = LoggerFactory.getLogger(LoggingInterceptor.class); // SLF4J
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
		System.out.println("In the logging interceptor which is common to all URLs.");
		System.out.println("---Before Method Execution. i.e. in the preHandle() method of LoggingInterceptor---");
		logger.info("In the logging interceptor which is common to all URLs.");
		return true;
	}
	public void postHandle(	HttpServletRequest request, HttpServletResponse response,
			Object handler, ModelAndView modelAndView) throws Exception {
		System.out.println("---method executed i.e. in the postHandle() method of LoggingInterceptor---");
	}
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
			Object handler, Exception ex) throws Exception {
		System.out.println("---Request Completed i.e. in the afterCompletion() method of LoggingInterceptor---");
	}
} 