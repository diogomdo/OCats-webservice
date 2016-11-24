package webserviceOC.model;

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
	
	private Opportunities (){}
	
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
}
