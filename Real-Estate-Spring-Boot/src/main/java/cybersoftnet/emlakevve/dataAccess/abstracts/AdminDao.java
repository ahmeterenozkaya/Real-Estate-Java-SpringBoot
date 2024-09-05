package cybersoftnet.emlakevve.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import cybersoftnet.emlakevve.entities.concretes.Admin;
public interface AdminDao extends JpaRepository<Admin,Integer> {

}
