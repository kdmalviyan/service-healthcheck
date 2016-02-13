/**
 * 
 */
package com.webservice.healthcheck.model;

import java.util.List;

/**
 * @author kuldeep
 * 
 */
public class WebServiceHealthChecker {
	private List<String> serviceList;

	public List<String> getServiceList() {
		return serviceList;
	}

	public void setServiceList(List<String> serviceList) {
		this.serviceList = serviceList;
	}
}
