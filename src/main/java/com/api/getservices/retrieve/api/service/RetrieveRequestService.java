/**
 * 
 */
package com.api.getservices.retrieve.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.api.getservices.retrieve.api.domain.RetrieveServiceResponse;
import com.api.getservices.retrieve.api.persistance.ServiceRequests;
import com.api.getservices.retrieve.api.persistance.ServiceRequestsRepository;

/**
 * @author PRASADBolla
 *
 */
@Service
public class RetrieveRequestService {

	@Autowired
	private ServiceRequestsRepository serviceRequestsRepository;

	public RetrieveServiceResponse retrieveRequest(String serviceRequestId) {

		try {

			ServiceRequests serviceRequests = serviceRequestsRepository.getOne(Long.parseLong(serviceRequestId));
			RetrieveServiceResponse retrieveServiceResponse= new RetrieveServiceResponse();
			retrieveServiceResponse.setServiceRequestId(serviceRequestId);
		
			
			retrieveServiceResponse.setRequestData(serviceRequests.getRequestdata());
			retrieveServiceResponse.setRequestDate(serviceRequests.getRequestdate());
			retrieveServiceResponse.setRequestExpiry(serviceRequests.getRequestexpiry());
			retrieveServiceResponse.setScheduleDateTime(serviceRequests.getScheduledatetime());
			retrieveServiceResponse.setSchedulePriority(serviceRequests.getSchedulepriority());
			retrieveServiceResponse.setScheduleType(serviceRequests.getScheduletype());
			retrieveServiceResponse.setServiceId(serviceRequests.getServiceid().toString());
			
			retrieveServiceResponse.setServiceScenarioId(serviceRequests.getServicerequestid().toString());
			retrieveServiceResponse.setStatusId(serviceRequests.getStatusid().toString());
			retrieveServiceResponse.setUserId(serviceRequests.getUserid().toString());
			
			// return serviceRequests;
			return retrieveServiceResponse;

		} catch (EntityNotFoundException e) {

			e.printStackTrace();

			throw new ResponseStatusException(HttpStatus.NOT_FOUND,
					"ServiceRequests not found with ID " + serviceRequestId);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
					" Error Finding ServiceRequests with ID " + serviceRequestId);
		}

	}
	
	public List<RetrieveServiceResponse> findAllRequests() {

		try {

			List<ServiceRequests> serviceRequests = serviceRequestsRepository.findAll();
			
			List<RetrieveServiceResponse> list= new ArrayList<RetrieveServiceResponse>();
			
			if (serviceRequests != null && !serviceRequests.isEmpty()) {
				list.addAll(serviceRequests.stream().map(ele -> {

					RetrieveServiceResponse retrieveServiceResponse = new RetrieveServiceResponse();
					retrieveServiceResponse.setServiceRequestId(ele.getServicerequestid().toString());

					retrieveServiceResponse.setRequestData(ele.getRequestdata());
					retrieveServiceResponse.setRequestDate(ele.getRequestdate());
					retrieveServiceResponse.setRequestExpiry(ele.getRequestexpiry());
					retrieveServiceResponse.setScheduleDateTime(ele.getScheduledatetime());
					retrieveServiceResponse.setSchedulePriority(ele.getSchedulepriority());
					retrieveServiceResponse.setScheduleType(ele.getScheduletype());
					retrieveServiceResponse.setServiceId(ele.getServiceid().toString());

					retrieveServiceResponse.setServiceScenarioId(ele.getServicerequestid().toString());
					retrieveServiceResponse.setStatusId(ele.getStatusid().toString());
					retrieveServiceResponse.setUserId(ele.getUserid().toString());

					// return serviceRequests;
					return retrieveServiceResponse;
				}).collect(Collectors.toList()));

			}
			
			return list;

		} catch (Exception e) {
			e.printStackTrace();
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
					" Error Finding ServiceRequests with ID " );
		}

	}
}
