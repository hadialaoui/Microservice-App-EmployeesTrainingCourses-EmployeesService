package com.hadialaoui.microservices.employeesservice.exposition.externalService;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.hadialaoui.microservices.employeesservice.models.TrainingCours;



@FeignClient(name="training-courses-service", url="localhost:8200")
public interface TrainingCoursesServiceProxy {
	
	@GetMapping(value="/trainingCourses")
	public List<TrainingCours> getAllTrainingCours();
}
