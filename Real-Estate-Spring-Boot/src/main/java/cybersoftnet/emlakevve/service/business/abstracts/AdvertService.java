package cybersoftnet.emlakevve.service.business.abstracts;

import cybersoftnet.emlakevve.core.utilities.results.DataResult;
import cybersoftnet.emlakevve.entities.concretes.Advert;

import java.util.List;

public interface AdvertService {
   DataResult<List<Advert>> getAll();
}
