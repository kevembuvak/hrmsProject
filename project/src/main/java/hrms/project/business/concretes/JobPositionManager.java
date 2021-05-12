package hrms.project.business.concretes;

import hrms.project.business.abstracts.JobPositionService;
import hrms.project.dataAccess.abstracts.JobPositionDao;
import hrms.project.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // ---> servis görevi görecek demek
public class JobPositionManager implements JobPositionService {

    private JobPositionDao dao;

    @Autowired
    public JobPositionManager(JobPositionDao dao) {
        this.dao = dao;
    }

    @Override
    public List<JobPosition> getAll() {
        return dao.findAll();
    }
}
