package org.sms.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.sms.core.domain.BaseDomain;

@Entity
@Table(name = "ind_class")
public class IndClass extends BaseDomain{
	/**
	 * 
	 */
	private static final long serialVersionUID = 254638938689012989L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "iCC", nullable = false, length = 15)
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]")
	@Length(max = 15)
	private String iCC;

	@Column(name = "learning_time", nullable = false)
	@NotBlank
	private Date learningTime;

	@Column(name = "tStart", nullable = false)
	@NotBlank
	private Date tStart;

	@Column(name = "tEnd", nullable = false)
	@NotBlank
	private Date tEnd;

	@Column(name = "pcc", nullable = false, length = 15)
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]")
	@Length(max = 15)
	private String priorityClassCode;

	public Date gettStart() {
		return tStart;
	}

	public void settStart(Date tStart) {
		this.tStart = tStart;
	}

	public Date gettEnd() {
		return tEnd;
	}

	public void settEnd(Date tEnd) {
		this.tEnd = tEnd;
	}

	public String getPriorityClassCode() {
		return priorityClassCode;
	}

	public void setPriorityClassCode(String priorityClassCode) {
		this.priorityClassCode = priorityClassCode;
	}

	public String getiCC() {
		return iCC;
	}

	public void setiCC(String iCC) {
		this.iCC = iCC;
	}

	public Date getLearningTime() {
		return learningTime;
	}

	public void setLearningTime(Date learningTime) {
		this.learningTime = learningTime;
	}

}
