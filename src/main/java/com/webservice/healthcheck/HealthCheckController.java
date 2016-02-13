package com.webservice.healthcheck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webservice.healthcheck.model.MyWebService;
import com.webservice.healthcheck.services.ServiceStatusCheck;

/**
 * 
 * @author kuldeep
 * 
 */
@Controller
public class HealthCheckController {

	@Autowired
	private ServiceStatusCheck serviceStatusCheck;

	/**
	 * Replace this with actual service to handle ajax call
	 * 
	 * @param serviceName
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "checkServiceStatus", method = RequestMethod.GET)
	public String getWebServiceHealthStatus(String serviceName,
			ModelMap modelMap) {
		MyWebService myWebService = serviceStatusCheck
				.getServiceStatusByName(serviceName);
		modelMap.put("service", myWebService);
		return "health_check_satus";
	}
}
