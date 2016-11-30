package webserviceOC.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


//@RepositoryRestResource(collectionResourceRel="opportunities", path = "opportunities")
//with this tag, spring will do the mapping, for this case to /opportunities without 
//needing a controller
@Repository
public interface OpportunitiesDAO extends JpaRepository<Opportunities, Long>{
	
	@Query(value="SELECT joborder.joborder_id, joborder.description, company.name, joborder.title, joborder.city, "
			+ "joborder.state, joborder.openings, joborder.date_modified FROM joborder LEFT OUTER JOIN company ON joborder.company_id = company.company_id "
			+ "where joborder_id=?1", nativeQuery = true)
	public List<Opportunities> findOpportunityDetail(Long id);
	public List<Opportunities> findById(Long id);
	public List<Opportunities> findAllByOrderByDateModifiedDesc();
}
