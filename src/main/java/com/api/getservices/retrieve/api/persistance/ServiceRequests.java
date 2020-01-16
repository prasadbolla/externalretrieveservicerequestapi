package com.api.getservices.retrieve.api.persistance;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "SERVICEREQUESTS")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class ServiceRequests implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long servicerequestid;
	
	private Long serviceid;
	private Long userid;
	private Long servicescenarioid;
	private String requestdata;
	private Timestamp requestdate;
	private Timestamp requestexpiry;
	private Integer statusid;
	private Integer scheduletype;
	private Timestamp scheduledatetime;
	private Integer schedulepriority;
	public Long getServicerequestid() {
		return servicerequestid;
	}
	public void setServicerequestid(Long servicerequestid) {
		this.servicerequestid = servicerequestid;
	}
	public Long getServiceid() {
		return serviceid;
	}
	public void setServiceid(Long serviceid) {
		this.serviceid = serviceid;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public Long getServicescenarioid() {
		return servicescenarioid;
	}
	public void setServicescenarioid(Long servicescenarioid) {
		this.servicescenarioid = servicescenarioid;
	}
	public String getRequestdata() {
		return requestdata;
	}
	public void setRequestdata(String requestdata) {
		this.requestdata = requestdata;
	}
	public Timestamp getRequestdate() {
		return requestdate;
	}
	public void setRequestdate(Timestamp requestdate) {
		this.requestdate = requestdate;
	}
	public Timestamp getRequestexpiry() {
		return requestexpiry;
	}
	public void setRequestexpiry(Timestamp requestexpiry) {
		this.requestexpiry = requestexpiry;
	}
	public Integer getStatusid() {
		return statusid;
	}
	public void setStatusid(Integer statusid) {
		this.statusid = statusid;
	}
	public Integer getScheduletype() {
		return scheduletype;
	}
	public void setScheduletype(Integer scheduletype) {
		this.scheduletype = scheduletype;
	}
	public Timestamp getScheduledatetime() {
		return scheduledatetime;
	}
	public void setScheduledatetime(Timestamp scheduledatetime) {
		this.scheduledatetime = scheduledatetime;
	}
	public Integer getSchedulepriority() {
		return schedulepriority;
	}
	public void setSchedulepriority(Integer schedulepriority) {
		this.schedulepriority = schedulepriority;
	}
	@Override
	public String toString() {
		return "ServiceRequests [servicerequestid=" + servicerequestid + ", serviceid=" + serviceid + ", userid="
				+ userid + ", servicescenarioid=" + servicescenarioid + ", requestdata=" + requestdata
				+ ", requestdate=" + requestdate + ", requestexpiry=" + requestexpiry + ", statusid=" + statusid
				+ ", scheduletype=" + scheduletype + ", scheduledatetime=" + scheduledatetime + ", schedulepriority="
				+ schedulepriority + "]";
	}

}
