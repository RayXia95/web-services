package com.revature.soap;

import javax.jws.WebService;

@WebService(endpointInterface = "com.revature.soap.HeroGreeting", serviceName="HeroGreetingService")
public class HeroGreetingAlpha implements HeroGreeting {

	@Override
	public String getMessage(String message) {
		return "Peter: " + message;
	}

}
