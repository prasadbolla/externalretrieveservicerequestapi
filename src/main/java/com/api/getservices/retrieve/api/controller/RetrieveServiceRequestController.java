/**
 * 
 */
package com.api.getservices.retrieve.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.api.getservices.retrieve.api.domain.RetrieveServiceResponse;
import com.api.getservices.retrieve.api.service.RetrieveRequestService;


@RestController
public class RetrieveServiceRequestController {
	@Autowired
	RetrieveRequestService retrieveRequestService;

	@GetMapping(value = "/retrieveRequests/request/{requestId}")
	public ResponseEntity<RetrieveServiceResponse> retrieve(
			@PathVariable String requestId, @RequestHeader("authorizationCode") String authorizationCode) {
		return ResponseEntity.ok(retrieveRequestService
				.retrieveRequest(requestId));
	}
	
	@GetMapping(value = "/retrieveRequests")
	public ResponseEntity<List<RetrieveServiceResponse>> findAll(@RequestHeader("authorizationCode") String authorizationCode) {
		return ResponseEntity.ok(retrieveRequestService
				.findAllRequests());
	}
}
