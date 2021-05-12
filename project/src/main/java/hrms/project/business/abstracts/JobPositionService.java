package hrms.project.business.abstracts;

import hrms.project.entities.concretes.JobPosition;

import java.util.List;

public interface JobPositionService {
    List<JobPosition> getAll();
}
