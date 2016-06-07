package com.bharatbazar.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class ShowInfoController {
	
	@RequestMapping("/route")
	public ModelAndView loadRoutePage(HttpServletRequest request,
			HttpServletResponse response) throws JsonProcessingException  {
		System.out.println("inside controller");
		List<String> testList = new ArrayList<>();
		testList.add("r1");
		testList.add("r2");
		ObjectMapper mapper = new ObjectMapper();		
		System.out.println(mapper.writeValueAsString(testList));
		return new ModelAndView("showInfo", "testList", mapper.writeValueAsString(testList));
	}


}
