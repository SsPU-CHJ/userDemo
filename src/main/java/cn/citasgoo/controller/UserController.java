package cn.citasgoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.citasgoo.pojo.User;
import cn.citasgoo.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/reg", method = { RequestMethod.GET })
	private String reg() {
		return "reg";
	}

	@RequestMapping(value = "/reg", method = { RequestMethod.POST })
	private void reg(User user) {
		userService.insert(user);
		System.out.println("×¢²á³É¹¦");
	}

}
