/**
 * 
 */
package com.webservice.healthcheck;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author kuldeep
 * 
 */
@Controller
public class LoginController {

	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = { "/", "", "/login_page" }, method = RequestMethod.GET)
	public String goToHome() {
		return "login_page";
	}
}
