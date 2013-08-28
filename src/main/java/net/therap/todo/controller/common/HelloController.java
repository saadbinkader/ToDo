package net.therap.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "common/home";
	}

    @RequestMapping(value="/user", method=RequestMethod.GET)
    public String listSpittlesForSpitter(
        @RequestParam("user") String username, Model model) {
        model.addAttribute("message", username);
        return "common/home";
    }
}