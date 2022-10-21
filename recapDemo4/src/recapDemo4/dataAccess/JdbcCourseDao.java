package recapDemo4.dataAccess;

import recapDemo4.entities.Course;

public class JdbcCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		
		System.out.println("Jdbc ile Veritabanına Kurs eklendi : " + course.getCourseName());
		
	}

}
