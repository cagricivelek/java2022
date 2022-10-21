package recapDemo4.business;

import recapDemo4.core.logging.ILogger;
import recapDemo4.dataAccess.IInstructorDao;
import recapDemo4.entities.Instructor;

public class InstructorManager {
	
	private IInstructorDao instructorDao;
	private ILogger[] loggers;
	
	
	public InstructorManager(IInstructorDao instructorDao, ILogger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}



	public void add(Instructor instructor) {
		
		instructorDao.add(instructor);
		
		for (ILogger logger : loggers) {
			logger.log(instructor.getInstructorName());
		}
		
	}

}
