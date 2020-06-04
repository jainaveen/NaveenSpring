package guru.springframework.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repositories.AuthorRepository;

@Controller
public class AuthorController {
	
	private final AuthorRepository authorRepository;

	public AuthorController(AuthorRepository rep) {
		this.authorRepository  = rep;
	}
	
	@RequestMapping("/authors")
	public String getAuthors(Model model){
		
		model.addAttribute("authors",this.authorRepository.findAll());
		return "authors/list";
	}
}
