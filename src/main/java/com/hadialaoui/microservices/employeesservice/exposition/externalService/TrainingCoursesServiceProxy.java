package com.hadialaoui.microservices.employeesservice.exposition.externalService;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.hadialaoui.microservices.employeesservice.models.TrainingCours;



//@FeignClient(name="training-courses-service", url="localhost:8200")
@FeignClient(name="training-courses-service")
@RibbonClient(name="training-courses-service")
public interface TrainingCoursesServiceProxy {
	
	@GetMapping(value="/trainingCourses")
	public List<TrainingCours> getAllTrainingCours();
	@GetMapping(value="/trainingCourses/port")
	public String getPort();
}
