package in.sanket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//this annotation tell spring boot that handle web request
public class UserController {
	@GetMapping("/login") // map the url /login to the loginPage() method
	public String loginPage() {
		// This returns the name of the Thymeleaf template (login.html)

		return "login";

		// Spring Boot will look for a Thymeleaf template file named login.html inside
		// the src/main/resources/templates directory.
		
	//index page ->find /login in controller->then return tymeleaf template login page
	}

	@GetMapping("/signup")
	public String signUpPage() {
		return "signup";
	}

	@GetMapping("/unloock")
	public String unlockPage() {
		return "unlock";
	}

	@GetMapping("/forgot")
	public String forgotPwdPage() {
		return "forgotPwd";
	}

}
