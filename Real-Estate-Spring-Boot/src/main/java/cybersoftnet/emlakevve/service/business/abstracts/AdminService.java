package cybersoftnet.emlakevve.service.business.abstracts;

import cybersoftnet.emlakevve.core.utilities.results.DataResult;
import cybersoftnet.emlakevve.core.utilities.results.Result;
import cybersoftnet.emlakevve.entities.concretes.Admin;

import java.util.List;

public interface AdminService {
    DataResult<List<Admin>> getAll();
    Result add(Admin admin);

}
