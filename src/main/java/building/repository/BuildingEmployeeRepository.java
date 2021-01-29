package building.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import building.model.BuildingEmployee;

@Repository
public interface BuildingEmployeeRepository extends JpaRepository<BuildingEmployee, Long>{

}
