/**
 * 
 */
package com.api.getservices.retrieve.api.domain;

import java.util.Date;

/**
 * @author PRASADBolla
 *
 */
public class RetrieveServiceResponse {
	public String serviceRequestId;
	public String serviceId;
	public String serviceScenarioId;
	public String userId;
	public String requestData;
	public Date requestDate;
	public Date requestExpiry;
	public String statusId;
	public int scheduleType;

	public Date scheduleDateTime;
	public int schedulePriority;
	/**
	 * @return the serviceRequestId
	 */
	public String getServiceRequestId() {
		return serviceRequestId;
	}
	/**
	 * @param serviceRequestId the serviceRequestId to set
	 */
	public void setServiceRequestId(String serviceRequestId) {
		this.serviceRequestId = serviceRequestId;
	}
	/**
	 * @return the serviceId
	 */
	public String getServiceId() {
		return serviceId;
	}
	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	/**
	 * @return the serviceScenarioId
	 */
	public String getServiceScenarioId() {
		return serviceScenarioId;
	}
	/**
	 * @param serviceScenarioId the serviceScenarioId to set
	 */
	public void setServiceScenarioId(String serviceScenarioId) {
		this.serviceScenarioId = serviceScenarioId;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the requestData
	 */
	public String getRequestData() {
		return requestData;
	}
	/**
	 * @param requestData the requestData to set
	 */
	public void setRequestData(String requestData) {
		this.requestData = requestData;
	}
	/**
	 * @return the requestDate
	 */
	public Date getRequestDate() {
		return requestDate;
	}
	/**
	 * @param requestDate the requestDate to set
	 */
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	/**
	 * @return the requestExpiry
	 */
	public Date getRequestExpiry() {
		return requestExpiry;
	}
	/**
	 * @param requestExpiry the requestExpiry to set
	 */
	public void setRequestExpiry(Date requestExpiry) {
		this.requestExpiry = requestExpiry;
	}
	/**
	 * @return the statusId
	 */
	public String getStatusId() {
		return statusId;
	}
	/**
	 * @param statusId the statusId to set
	 */
	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	/**
	 * @return the scheduleDateTime
	 */
	public Date getScheduleDateTime() {
		return scheduleDateTime;
	}
	/**
	 * @param scheduleDateTime the scheduleDateTime to set
	 */
	public void setScheduleDateTime(Date scheduleDateTime) {
		this.scheduleDateTime = scheduleDateTime;
	}
	/**
	 * @return the schedulePriority
	 */
	public int getSchedulePriority() {
		return schedulePriority;
	}
	/**
	 * @param schedulePriority the schedulePriority to set
	 */
	public void setSchedulePriority(int schedulePriority) {
		this.schedulePriority = schedulePriority;
	}
	public int getScheduleType() {
		return scheduleType;
	}
	public void setScheduleType(int scheduleType) {
		this.scheduleType = scheduleType;
	}
}
