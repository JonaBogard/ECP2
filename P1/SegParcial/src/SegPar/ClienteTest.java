package SegPar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClienteTest {

	/*
	@Test
	void testInsertarCliente() {
		cliente c=new cliente();
		c.setId("1");
		c.setNombre("Jaz");
		c.setDireccion("New York");
		c.setTelefono("5589687451");
		c.setEmail("jaz@gmail.com");
		//assertEquals(c.insertarCliente(), true);
		assertTrue(c.insertarCliente());
	}
	*/

	@Test
	void testCargarCliente() {
		cliente c=new cliente();
		c.setId("100");
		assertEquals(c.cargarCliente(), true);
	}
	/*
	@Test
	void testEliminarCliente() {
		cliente c=new cliente();
		c.setId("2");
		assertEquals(c.eliminarCliente(), true);
	}

	@Test
	void testActualizarCliente() {
		cliente c=new cliente();
		c.setId("69");
		c.setNombre("Jaz");
		c.setDireccion("Paris");
		c.setTelefono("3389658741");
		c.setEmail("jaz54@gmail.com");
		assertEquals(c.actualizarCliente(), true);
	}
*/
}
