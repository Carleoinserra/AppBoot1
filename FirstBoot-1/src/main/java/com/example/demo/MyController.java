package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String getHello(Model model) {
		
		
		String nome = "Carlo";
		
		model.addAttribute("nome", nome);
		
		
		
		return "hello";
	}
	
	@GetMapping("/contatti")
	public String getHello1() {
		
		return "contatti";
	}

}
