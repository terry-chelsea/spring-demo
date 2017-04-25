package com.fengyu.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SimpleController {
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	@ResponseBody
	public String helloWorld(@RequestParam(value="user",required=false, defaultValue="World") String userName) {
		return "Hello " + userName + " !";
	}
	
	@RequestMapping(value = "helloMap", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, String> helloMap(@RequestParam(value="user",required=false, defaultValue="World") String userName) {
		Map<String, String> ret = new HashMap<String, String>();
		ret.put("hello", userName);
		return ret;
	}

}
