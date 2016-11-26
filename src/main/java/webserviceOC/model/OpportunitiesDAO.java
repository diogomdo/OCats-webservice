package webserviceOC.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


//@RepositoryRestResource(collectionResourceRel="opportunities", path = "opportunities")
//with this tag, spring will do the mapping, for this case to /opportunities without 
//needing a controller
@Repository
public interface OpportunitiesDAO extends CrudRepository<Opportunities, Long>{

}
