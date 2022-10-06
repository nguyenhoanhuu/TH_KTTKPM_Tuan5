package com.se.springbootdemocrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.springbootdemocrud.dao.ChungNhanService;

@RestController
@RequestMapping("")
public class ChungNhanController {
	@Autowired
	private ChungNhanService chungNhanService;

	@GetMapping("/chungnhan")
	public List<String> findByBoeing() {
		return chungNhanService.findByBoeing();
	}

	
}
