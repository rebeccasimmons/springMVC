package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/welcome")
	public String welcome(@RequestParam(name="user", required=false, defaultValue="people") String user, Model model) {
		model.addAttribute("user", user);
		return "welcome";
	}
}
