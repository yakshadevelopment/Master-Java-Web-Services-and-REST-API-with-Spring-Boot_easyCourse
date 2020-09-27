package yaksha.jpa.easy_course;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service 
@Transactional
@Component
public class CourseService {
	@Autowired
    CourseRepository repository;
   
	
	
	public List<Course> findAll() {
		return repository.findAll();
	}
	
	public  void save(Course course) {
		repository.save(course);
	}
	
	public Course findById(long id) {
		try {
		return repository.findById(id).get();
		}catch(Exception e)
		{
			return null;
		}
	}
	
	public void delete(long id) {
		repository.deleteById(id);
	}


}
