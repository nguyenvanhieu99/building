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

import building.repository.BuildingEmployeeRepository;
import building.model.BuildingEmployee;

@RestController
@RequestMapping(path = "/building_employee", produces = "application/json")
@CrossOrigin(origins = "*")

public class BuildingEmployeeController {

	@Autowired
	private BuildingEmployeeRepository repo;
	
	
	@GetMapping
	public List<BuildingEmployee> getAll(){
		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public BuildingEmployee getById(@PathVariable("id") long id){
		return repo.getOne(id);
	}
	
	@PostMapping(consumes = "application/json")
	public BuildingEmployee post(@RequestBody BuildingEmployee be) {
		return repo.save(be);
	}
	
	@PutMapping()
	public BuildingEmployee put(@RequestBody BuildingEmployee be) {
		return repo.save(be);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") long id) {
		repo.deleteById(id);
	}
	
	
	
}
