package starter.petstore;

public class Pet {
	private String name;
    private String status;
    private Long id;
    
	public Pet(String name, String status) {
		super();
		this.name = name;
		this.status = status;
	}
	
	public Pet(String name, String status, Long id) {
		super();
		this.name = name;
		this.status = status;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public String getStatus() {
		return status;
	}
	public Long getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
