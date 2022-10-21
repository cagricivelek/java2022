package recapDemo4.dataAccess;

import recapDemo4.entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		
		System.out.println("Jdbc ile Veritabanına Eğitmen eklendi : " + instructor.getInstructorName());
		
	}

}
