package recapDemo4.dataAccess;

import recapDemo4.entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		
		System.out.println("Hibernate ile Veritabanına Eğitmen eklendi : " + instructor.getInstructorName());
		
	}

}
