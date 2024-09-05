package cybersoftnet.emlakevve.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import cybersoftnet.emlakevve.entities.concretes.*;

public interface AdvertDao extends JpaRepository<Advert,Integer> {
}
