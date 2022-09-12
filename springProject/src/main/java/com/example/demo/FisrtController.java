package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class FisrtController {
	@RequestMapping("/first")
	public String first()
	{
		return "Spring method Without Parameters";
	}
	@GetMapping("/second/{fname}/{lname}")
	public String second(@PathVariable("fname") String fname,@PathVariable("lname") String lname)
	{
		return "My name is "+fname+" "+lname;
	}
	@GetMapping("/third")
	public String third()
	{
		return "GetMapping using PostMan";
	}
	@PostMapping("/fourth")
	public String fourth(@RequestParam String str)
	{
		return "Welcome to Postman "+str;	
	}
	@PostMapping("/reverse")
	public String getreverse(@RequestParam String str)
	{
		return new StringBuilder(str).reverse().toString();		
	}
	
}
