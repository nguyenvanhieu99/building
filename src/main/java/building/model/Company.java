package building.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "company")
public class Company{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	@Column(name ="tax_number")
	private String taxNumber;
	
	private double budget;
	
	private String field;
	
	@Column(name = "employee_quantity")
	private int employeeQuantity;
	
	private String address;
	
	private String phone;
	
	private double area;
	
	
}
