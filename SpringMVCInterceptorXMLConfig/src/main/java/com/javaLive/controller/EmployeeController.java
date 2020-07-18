package com.javaLive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author javalive.com 
 * 
 * 		   Just like we have Struts2 Interceptors, we can create
 *         our own Spring interceptor by either implementing
 *         org.springframework.web.servlet.HandlerInterceptor interface or by
 *         overriding abstract class
 *         org.springframework.web.servlet.handler.HandlerInterceptorAdapter
 *         that provides the base implementation of HandlerInterceptor
 *         interface.
 * 
 *         Spring Interceptor – HandlerInterceptor Spring HandlerInterceptor
 *         declares three methods based on where we want to intercept the HTTP
 *         request.
 * 
 *         boolean preHandle(HttpServletRequest request, HttpServletResponse
 *         response, Object handler): This method is used to intercept the
 *         request before it’s handed over to the handler method. This method
 *         should return ‘true’ to let Spring know to process the request
 *         through another spring interceptor or to send it to handler method if
 *         there are no further spring interceptors. If this method returns
 *         ‘false’ Spring framework assumes that request has been handled by the
 *         spring interceptor itself and no further processing is needed. We
 *         should use response object to send response to the client request in
 *         this case.
 * 
 *         Object handler is the chosen handler object to handle the request.
 *         This method can throw Exception also, in that case Spring MVC
 *         Exception Handling should be useful to send error page as response.
 * 
 *         void postHandle(HttpServletRequest request, HttpServletResponse
 *         response, Object handler, ModelAndView modelAndView): This
 *         HandlerInterceptor interceptor method is called when HandlerAdapter
 *         has invoked the handler but DispatcherServlet is yet to render the
 *         view. This method can be used to add additional attribute to the
 *         ModelAndView object to be used in the view pages. We can use this
 *         spring interceptor method to determine the time taken by handler
 *         method to process the client request. 
 *         
 *         void afterCompletion(HttpServletRequest request, HttpServletResponse
 *         response, Object handler, Exception ex): This is a HandlerInterceptor
 *         callback method that is called once the handler is executed and view
 *         is rendered. 
 *         
 *         If there are multiple spring interceptors configured,
 *         preHandle() method is executed in the order of configuration whereas
 *         postHandle() and afterCompletion() methods are invoked in the reverse
 *         order.
 *
 */
@Controller
@RequestMapping("employee-module/addNew")
public class EmployeeController {
	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model model) {
		System.out.println("In the controller.......");
		System.out.println("Welcome Friends!");
		model.addAttribute("msg", "Welcome Friends!");
		return "result";
	}

}