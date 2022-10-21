package recapDemo4;


import recapDemo4.business.CategoryManager;
import recapDemo4.business.CourseManager;
import recapDemo4.business.InstructorManager;
import recapDemo4.core.logging.DatabaseLogger;
import recapDemo4.core.logging.FileLogger;
import recapDemo4.core.logging.ILogger;
import recapDemo4.core.logging.MailLogger;
import recapDemo4.dataAccess.HibernateCategoryDao;
import recapDemo4.dataAccess.HibernateCourseDao;
import recapDemo4.dataAccess.HibernateInstructorDao;
import recapDemo4.dataAccess.JdbcCourseDao;
import recapDemo4.entities.Category;
import recapDemo4.entities.Course;
import recapDemo4.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		ILogger[] loggers = new ILogger[] {new FileLogger(), new DatabaseLogger(), new MailLogger()};
		
		// --------------------------------------------------------------------------------------
		
		Course course1 = new Course();
		course1.setCourseId(1);
		course1.setCourseName("Java 2022");
		course1.setCoursePrice(100);
		
		Course course2 = new Course();
		course2.setCourseId(2);
		course2.setCourseName("C# 2022");
		course2.setCoursePrice(200);
		
		Course course3 = new Course();
		course3.setCourseId(3);
		course3.setCourseName("Phyton");
		course3.setCoursePrice(300);
		
		Course course4 = new Course();
		course4.setCourseId(4);
		course4.setCourseName("Javascript");
		course4.setCoursePrice(500);
		
		Course[] courses = new Course[] {course1, course2, course3};
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), courses, loggers);
		courseManager.add(course4);
		
		
		// --------------------------------------------------------------------------------------
		
		Category category1 = new Category();
		category1.setCategoryId(1);
		category1.setCategeoryName("Backend");
		
		Category category2 = new Category();
		category2.setCategoryId(2);
		category2.setCategeoryName("Frontend");
		
		Category category3 = new Category();
		category3.setCategoryId(3);
		category3.setCategeoryName("Web");
		
		Category[] categories = new Category[] {category1,category2};
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), categories, loggers);
		categoryManager.add(category3);
		
		
		// --------------------------------------------------------------------------------------
		
		Instructor instructor1 = new Instructor();
		instructor1.setInstructorId(1);
		instructor1.setInstructorName("Çağrı");
		instructor1.setInstructorLastName("Civelek");
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor1);
		
		// --------------------------------------------------------------------------------------
		
		

	}

}
