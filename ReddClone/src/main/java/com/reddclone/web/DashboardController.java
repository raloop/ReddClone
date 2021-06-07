package com.reddclone.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.reddclone.domain.Product;
import com.reddclone.domain.User;
import com.reddclone.repositories.ProductRepository;

@Controller
public class DashboardController {

	@Autowired
	private ProductRepository productRepo;
	
	@GetMapping("/")
	public String rootView() {
		return "index";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(@AuthenticationPrincipal User user, ModelMap model) {
		List<Product> products = productRepo.findByUser(user); 
		model.put("products", products);
		
		return "dashboard";
	}
}
