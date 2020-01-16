package com.api.getservices.retrieve.api.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface ServiceRequestStatusRepository extends JpaRepository<ServiceRequestStatus, Long> {

}
