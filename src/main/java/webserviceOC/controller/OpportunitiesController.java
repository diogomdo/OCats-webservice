package webserviceOC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
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
	public List<Opportunities> getAll(){
		return repo.findAll();
	}
	
	/*
	 * This will sort the response by modified date
	 * Just on findAll() as a parameter
	 */
	
	public Sort sortByModifiedDateASC(){
		return new Sort(Sort.Direction.DESC, "date_modified");
	}
	
	/*
	 *or mapping to a different request call method on interface
	 *that extends JPARespository
	 */
	
	@RequestMapping(method = RequestMethod.GET, value = "/allDesc")
	public List<Opportunities> findAllDesc(){
		return repo.findAllByOrderByDateModifiedDesc();
	}
	
	/*
	 * This method will search a opportunity by adding id on the link.
	 */
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public List<Opportunities> findOpportunity (@PathVariable Long id){
		return repo.findById(id);
	}


}
