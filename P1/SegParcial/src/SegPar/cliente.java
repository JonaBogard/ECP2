package SegPar;

public class cliente {
	
	String id;
	String nombre;
	String direccion;
	String teltefono;
	String email;
	Connect dp = null;

	public cliente() {
		dp = new Connect();
	}
	
	public cliente(String id, String nombre, String direccion, String teltefono, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.teltefono = teltefono;
		this.email = email;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTeltefono() {
		return teltefono;
	}
	public void setTeltefono(String teltefono) {
		this.teltefono = teltefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
		

		
	}
