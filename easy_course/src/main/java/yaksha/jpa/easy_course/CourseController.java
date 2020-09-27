package yaksha.jpa.easy_course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CourseController {
 @Autowired
 CourseService service;
 
 
 @GetMapping(path="/course/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Course showCourse(@PathVariable int id)
	{
		Course course=service.findById(id);
		if(course==null)
			throw new CourseNotFoundException("Course Id not exsists");
			return course;
	}
	@PostMapping(path="/add-course",consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public String addUpdateCourse(@RequestBody Course course)
	{
		service.save(course);
		return "Course Added/Modified Successfully";
	}

	@GetMapping(path="/courses-json", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Course> showCourseJson()
	{
		 return service.findAll();
		
	}
	
	@GetMapping(path="/courses-xml", produces = MediaType.APPLICATION_XML_VALUE)
	public List<Course> showCourseXml()
	{
		 return service.findAll();
		
	}
	@GetMapping(path="/delete-course/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteCourse(@PathVariable int id)
	{
		Course course=service.findById(id);
		if(course==null)
			throw new CourseNotFoundException("Course Id not exsists");
		else{
			service.delete(id);
			return "Course removed successfully";
		}
			
	}

	
	
}
