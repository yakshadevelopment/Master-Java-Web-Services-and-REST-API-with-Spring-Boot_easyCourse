package yaksha.jpa.easy_course;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Integer monthDuration;
	private Double fee;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(Long id, String name, Integer monthDuration, Double fee) {
		super();
		this.id = id;
		this.name = name;
		this.monthDuration = monthDuration;
		this.fee = fee;
	}
	public Course(String name, Integer monthDuration, Double fee) {
		super();
		this.name = name;
		this.monthDuration = monthDuration;
		this.fee = fee;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMonthDuration() {
		return monthDuration;
	}
	public void setMonthDuration(Integer monthDuration) {
		this.monthDuration = monthDuration;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	
}
