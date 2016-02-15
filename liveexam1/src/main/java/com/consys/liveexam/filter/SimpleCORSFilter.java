package com.consys.liveexam.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


public class SimpleCORSFilter implements Filter {

	private Logger logger = LoggerFactory.getLogger(SimpleCORSFilter.class);
	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		
		logger.info("Started doFilter");
		System.out.println("************Started doFilter*************");
		System.out.println("Content Type : "+req.getAttribute("Content-Type"));
		HttpServletResponse response = (HttpServletResponse) res;
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
		response.setHeader("Access-Control-Max-Age", "3600");
		response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
		response.setHeader("Content-Type", "application/json");
		response.setHeader("Accept", "application/json");
		//'Accept': 'application/json', 
		
		//);
		chain.doFilter(req, res);
		System.out.println("************Completed doFilter*************");
		logger.info("Completed doFilter");
	}

	public void init(FilterConfig filterConfig) {}

	public void destroy() {}

}
