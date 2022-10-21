package recapDemo4.dataAccess;

import recapDemo4.entities.Course;

public class HibernateCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		
		System.out.println("Hibernate ile Veritabanına Kurs eklendi : " + course.getCourseName());
		
	}

}
