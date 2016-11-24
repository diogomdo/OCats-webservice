package webserviceOC.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// The tag 	@RestController joins the follow two tags @ResponseBody and @Controller
@RestController
public class MainController {
	
	@RequestMapping("/")
	public String index(){
		return "Home Test";
	}
}
