package com.reports.ReportsApp.repository;

import java.util.List;
import com.reports.ReportsApp.entity.CitizenPlan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CitizenPlanRepo extends JpaRepository<CitizenPlan, Integer> {
	
	   @Query("select distinct(planName) from CitizenPlan")
	   public List<String> getPlanNames();
	   @Query("select distinct(planStatus) from CitizenPlan")
	   public List<String> getPlanStatus();

   
}