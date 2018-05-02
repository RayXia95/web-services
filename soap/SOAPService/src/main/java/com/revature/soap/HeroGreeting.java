package com.revature.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * This is my contract endpoint
 */
@WebService
public interface HeroGreeting {
	
	/**
	 * These are my endpoint methods
	 */
	@WebMethod
	public String getMessage(String message);
}
