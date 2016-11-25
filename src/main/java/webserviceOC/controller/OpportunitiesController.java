package webserviceOC.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import webserviceOC.model.Opportunities;

@RestController
@RequestMapping("/opportunities")
public class OpportunitiesController {
	
//	@Autowired
	private Opportunities opportunities;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Opportunities> getAll(){
		return new ArrayList<Opportunities>();
	}

//	private Opportunities opportunities(){
//		return opportunities;
//	};

}
