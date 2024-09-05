package cybersoftnet.emlakevve.service.business.concretes;

import cybersoftnet.emlakevve.core.utilities.results.DataResult;
import cybersoftnet.emlakevve.core.utilities.results.Result;
import cybersoftnet.emlakevve.core.utilities.results.SuccessDataResult;
import cybersoftnet.emlakevve.core.utilities.results.SuccessResult;
import cybersoftnet.emlakevve.dataAccess.abstracts.AdminDao;
import cybersoftnet.emlakevve.entities.concretes.Admin;
import cybersoftnet.emlakevve.service.business.abstracts.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminManager implements AdminService {

    private AdminDao adminDao;

    @Autowired
    public AdminManager(AdminDao adminDao) {
        super();
        this.adminDao = adminDao;
    }

    @Override
    public DataResult<List<Admin>> getAll() {
        //todo Erro data result da döndürebiliriz
        return new SuccessDataResult<List<Admin>>
                (this.adminDao.findAll(),"Data Listelendi.");
    }

    @Override
    public Result add(Admin admin) {
        this.adminDao.save(admin);
        return new SuccessResult("Admin eklendi");
    }
}
