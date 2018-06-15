package com.zhuzhuxia.learning.service;
import org.springframework.stereotype.Service;
import com.zhuzhuxia.learning.model.Course;
@Service
public interface CourseService {
	
	
	Course getCoursebyId(Integer courseId);
	

	
	

}
