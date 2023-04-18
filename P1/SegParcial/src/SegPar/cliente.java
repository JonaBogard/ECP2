package SegPar;

public class cliente {
	
	String id;
	String nombre;
	String direccion;
	String telefono;
	String email;
	Connect dp = null;

	public cliente() {
		dp = new Connect();
	}
	public boolean insertarCliente() {
		if (dp.insertarCliente(this)) {
			return true;
		}else {
			return false;
		}
		
	}

	public boolean cargarCliente() {
		if (dp.cargarCliente(this)) {
			return true;
		}else {
			return false;
		}	
	}

	public boolean eliminarCliente() {
		if (dp.eliminarCliente(this.getId())) {
			return true;
		}else {
			return false;
		}
	}

	public boolean actualizarCliente() {
		if (dp.actualizarCliente(this)) {
			return true;
		}else {
			return false;
		}
	}
	
	public cliente(String id, String nombre, String direccion, String telefono, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
