package building.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import building.model.CompanyEmployee;

@Repository
public interface CompanyEmployeeRepository extends JpaRepository<CompanyEmployee, Long> {

}
