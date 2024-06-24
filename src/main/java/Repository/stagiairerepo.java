package Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.stagiaire;


@Repository
public interface stagiairerepo extends CrudRepository<stagiaire,Long> {
    List<stagiaire> findByTuteurId(Long tuteurId);
    stagiaire findByEmail(String email);
}
