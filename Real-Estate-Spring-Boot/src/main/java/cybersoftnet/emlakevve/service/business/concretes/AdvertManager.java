package cybersoftnet.emlakevve.service.business.concretes;

import cybersoftnet.emlakevve.core.utilities.results.DataResult;
import cybersoftnet.emlakevve.core.utilities.results.SuccessDataResult;
import cybersoftnet.emlakevve.dataAccess.abstracts.AdvertDao;
import cybersoftnet.emlakevve.entities.concretes.Advert;
import cybersoftnet.emlakevve.service.business.abstracts.AdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertManager implements AdvertService {
    private AdvertDao advertDao;

    @Autowired
    public AdvertManager(AdvertDao advertDao) {
        this.advertDao = advertDao;

    }
    @Override
    public DataResult<List<Advert>> getAll() {
        //todo Erro data resğult da döndürebiliriz
        return new SuccessDataResult<List<Advert>>
                (this.advertDao.findAll(),"İlan Listelendi.");
    }
}
