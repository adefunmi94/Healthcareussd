package com.healthcareproject.ussd.repository;


import org.springframework.data.repository.CrudRepository;

import com.healthcareproject.ussd.model.HealthCareUser;

public  interface HealthCareUserRepo extends CrudRepository<HealthCareUser, Long> {

	

}
