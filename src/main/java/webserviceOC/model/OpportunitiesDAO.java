package webserviceOC.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


//@RepositoryRestResource(collectionResourceRel="opportunities", path = "opportunities")
//with this tag, spring will do the mapping, for this case to /opportunities without 
//needing a controller
@Repository
public interface OpportunitiesDAO extends JpaRepository<Opportunities, Long>{
	
//	@Query(value="SELECT joborder.joborder_id, joborder.description, company.name, joborder.title, joborder.city, "
//			+ "joborder.state, joborder.openings, joborder.date_modified FROM joborder INNER JOIN company ON joborder.company_id = company.company_id "
//			+ "where joborder_id=?1", nativeQuery = true)
//	@Query("FROM joborder AS a WHERE c.a.company.company_id	= ?1")
	@Query("SELECT j.id, a.companyName "
			+ " FROM Opportunities j INNER JOIN j.company a where  j.id = :v")
	public List<Opportunities> findOpportunityDetail(@Param("v")Long id);
		
	public List<Opportunities> findById(Long id);
	public List<Opportunities> findAllByOrderByDateModifiedDesc();
}
