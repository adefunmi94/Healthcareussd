package com.healthcareproject.ussd.repository;


import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcareproject.ussd.model.HealthCareUser;

public  interface HealthCareUserRepo extends JpaRepository<HealthCareUser, Integer> {

}
