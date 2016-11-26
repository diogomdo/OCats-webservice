package webserviceOC.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import webserviceOC.model.Opportunities;
import webserviceOC.model.OpportunitiesDAO;

@RestController
@RequestMapping("/opportunities")
public class OpportunitiesController {
	
	private OpportunitiesDAO repo;
	
	@Autowired
	public OpportunitiesController (OpportunitiesDAO repo){
		this.repo = repo;
	};
	
	@RequestMapping(method=RequestMethod.GET)
	public Iterable getAll(){
		return repo.findAll();
	}

	

}
