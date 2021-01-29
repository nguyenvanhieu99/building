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

import building.model.Company;
import building.repository.CompanyRepository;

@RestController
@RequestMapping(path = "/company", produces = "application/json")
@CrossOrigin(origins = "*")

public class CompanyController {
	@Autowired
	private CompanyRepository repo;
	
	@GetMapping()
	public List<Company> getAll(){
		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public Company getById(@PathVariable("id") long id) {
		return repo.getOne(id);
	}
	
	@PostMapping(consumes = "application/json")
	public Company post(@RequestBody Company c) {
		return repo.save(c);
	}
	
	@PutMapping()
	public Company put(@RequestBody Company c) {
		return repo.save(c);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") long id) {
		repo.deleteById(id);
	}
	
	
}
