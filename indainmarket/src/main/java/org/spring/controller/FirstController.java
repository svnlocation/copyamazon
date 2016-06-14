package org.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.spring.model.Information;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class FirstController {

	@RequestMapping(value="/showInfo", method = RequestMethod.GET)
	public ModelAndView showInfo() throws JsonProcessingException{
		
		List<Information> list = new ArrayList<Information>();
		
		Information info1 = new Information();
		info1.setMessage("Item1 Page1");
		
		Information info2 = new Information();
		info2.setMessage("Item2 Page");
		
		Information info3 = new Information();
		info3.setMessage("Item3 Page");
		
		Information info4 = new Information();
		info4.setMessage("Item4 Page");
		
		list.add(info1);
		list.add(info2);
		list.add(info3);
		list.add(info4);
		ObjectMapper om = new ObjectMapper();
		om.writeValueAsString(list);
		
		return new ModelAndView("info", "itemList",om.writeValueAsString(list) );
	}

	
}
