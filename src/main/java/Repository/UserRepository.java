package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.user;


@Repository
public interface UserRepository extends CrudRepository <user , Long> {


}
