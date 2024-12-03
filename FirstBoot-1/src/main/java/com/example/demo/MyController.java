package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String getHello(Model model) {
		
		
		String nome = "Carlo";
		
		ArrayList <String> lista = new ArrayList<>();
		
		lista.add("giallo");
		lista.add("verde");
		lista.add("rosa");
		lista.add("azzurro");
		
		model.addAttribute("nome", nome);
		model.addAttribute("lista", lista);
		
		
		
		return "hello";
	}
	
	@GetMapping("/contatti")
	public String getHello1() {
		
		return "contatti";
	}

}
