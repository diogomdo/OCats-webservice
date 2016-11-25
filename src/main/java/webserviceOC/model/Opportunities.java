package webserviceOC.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name="joborder")
public class Opportunities {
	
	@Id
	@Column(name="joborder_id")
	private long joborder_id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="openings")
	private String openings;
	
	@Column(name="date_modified")
	private Date date_modified;
	
	
	public Opportunities (){}
	
	public long getJoborder_id() {
		return joborder_id;
	}
	public void setJoborder_id(long joborder_id) {
		this.joborder_id = joborder_id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getOpenings() {
		return openings;
	}

	public void setOpenings(String openings) {
		this.openings = openings;
	}

	public Date getDate_modified() {
		return date_modified;
	}

	public void setDate_modified(Date date_modified) {
		this.date_modified = date_modified;
	}
}
