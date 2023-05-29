package com.rajesh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiService {
@GetMapping("/")
List<String> all(){
	List<String> countryList=new ArrayList<String>();
	countryList.add("India");
	countryList.add("USA");
	countryList.add("Singapore");
	countryList.add("Malaysia");
	return countryList;
}
}
