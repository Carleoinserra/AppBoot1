package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	
	ArrayList<User> listaU = new ArrayList<>();
	
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
	
	@GetMapping("/form")
	public String getForm1() {
		
		return "form";
	}
	@PostMapping("/submit")
	public String submit(@RequestParam("nome") String nome, @RequestParam("cognome") String cognome,
			
			@RequestParam("url") String url,
			
			Model model) {
		
		
		//System.out.println(nome);
		
		User d1 = new User();
		d1.setNome(nome);
		d1.setCognome(cognome);
		d1.setUrl(url);
		
		System.out.println(d1.getUrl());
		
		listaU.add(d1);
		
		
		
		model.addAttribute("nome",nome);
		
		
		
		
		
		
		return "result";
	}
	
	@GetMapping("/mostra")
	public String getUser(Model model) {
		
		model.addAttribute("lista", listaU);
		
		return "mostra";
	}
	
	 

}
