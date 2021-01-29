package building.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import building.model.CompanyEmployee;
import building.repository.CompanyEmployeeRepository;

@RestController
@RequestMapping(path = "/company_employee", produces = "application/json")
@CrossOrigin(origins = "*")
public class CompanyEmployeeController {
	@Autowired
	private CompanyEmployeeRepository repo;
	
	@GetMapping
	public List<CompanyEmployee> getAll() {
		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public CompanyEmployee getById(@PathVariable("id") long id) {
		return repo.getOne(id);
	}
	
	@PostMapping(consumes = "application/json")
	public CompanyEmployee post(@RequestBody CompanyEmployee ce) {
		return repo.save(ce);
	}
	
	@PutMapping()
	public CompanyEmployee put(@RequestBody CompanyEmployee ce) {
		return repo.save(ce);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") long id) {
		repo.deleteById(id);
	}
	
}
