/**
 * 
 */
package com.webservice.healthcheck.services;

import org.springframework.stereotype.Service;

import com.webservice.healthcheck.model.MyWebService;

/**
 * @author kuldeep
 * 
 */
@Service
public class ServiceStatusCheck {

	/**
	 * 
	 * @param name
	 * @return
	 */
	public MyWebService getServiceStatusByName(String name) {
		MyWebService wbService = new MyWebService();
		wbService.setActive(true);
		wbService.setServiceName(name);
		return wbService;
	}
}
