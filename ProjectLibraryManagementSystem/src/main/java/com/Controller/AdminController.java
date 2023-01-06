package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Book;
import com.repositorydao.BookRepo;

@Controller
public class AdminController {

	@Autowired
	BookRepo repo;

	@RequestMapping(value = "/")
	public String home() {

		return "index.jsp";
	}

	@PostMapping(value = "addBook") // for this use localhost:8081
	public String addBook(@ModelAttribute Book b) {
		repo.save(b);

		return "result.jsp";
	}
}
