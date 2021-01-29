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

import building.model.Service;
import building.repository.ServiceRepository;

@RestController
@RequestMapping(path = "/service", produces = "application/json")
@CrossOrigin(origins = "*")

public class ServiceController {
	@Autowired
	private ServiceRepository repo;
	
	@GetMapping
	public List<Service> getAll() {
		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public Service getById(@PathVariable("id") long id) {
		return repo.getOne(id);
	}
	
	@PostMapping(consumes = "application/json")
	public Service post(@RequestBody Service ce) {
		return repo.save(ce);
	}
	
	@PutMapping()
	public Service put(@RequestBody Service ce) {
		return repo.save(ce);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") long id) {
		repo.deleteById(id);
	}
	
}
