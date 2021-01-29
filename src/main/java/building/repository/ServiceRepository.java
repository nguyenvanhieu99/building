package building.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import building.model.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {

}
