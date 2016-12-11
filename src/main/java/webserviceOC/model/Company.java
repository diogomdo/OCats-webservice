package webserviceOC.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.AssertFalse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="company")
public class Company {

	 @Id
	 @Column(name="company_id")
	 private long companyId;
	 
	 @Column(name="name")
	 private String companyName;
	 
	 @Column(name="date_created")
	 private Date date;
	 
}
