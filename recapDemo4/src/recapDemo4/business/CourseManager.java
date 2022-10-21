package recapDemo4.business;

import recapDemo4.dataAccess.ICourseDao;
import recapDemo4.core.logging.ILogger;
import recapDemo4.dataAccess.HibernateCourseDao;
import recapDemo4.dataAccess.JdbcCourseDao;
import recapDemo4.entities.Course;

public class CourseManager {
	
	private ICourseDao courseDao;
	private Course[] courses;
	private ILogger[] loggers;
		

	public CourseManager(ICourseDao courseDao, Course[] courses, ILogger[] loggers) {
		this.courseDao = courseDao;
		this.courses = courses;
		this.loggers = loggers;
	}


	public void add(Course course) throws Exception{
		
		for (Course c : courses) {
			if(course.getCourseName() == c.getCourseName()) {
				throw new Exception("Kurs İsmi Tekrar Edemez...");
			}
		}
		
		if (course.getCoursePrice() < 0) {
			throw new Exception("Kurs Fiyatı 0 'dan küçük olamaz...");
		}else {
			courseDao.add(course);
			for (ILogger logger : loggers) {
				logger.log(course.getCourseName());
			}
		}
	
		
	}

}
