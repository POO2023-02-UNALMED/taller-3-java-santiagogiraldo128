package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import taller3.televisores.Control;
import taller3.televisores.Marca;
import taller3.televisores.TV;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestConstructores {
	
	@Test
   	public void testConstructorMarca(){
		
		Marca marca = new Marca("Semsung");
		
		assertTrue(true, "Hay un problema con el constructor de Marca");
    }
	
	@Test
   	public void testConstructorTV(){
		
		Marca marca = new Marca("Xiomi");
	   
		TV tv = new TV(marca, true);
		
		assertTrue(true, "Hay un problema con el constructor de TV");
    }
	
	@Test
   	public void testConstructorControl(){
		
		Control control = new Control();
		
		assertTrue(true, "Hay un problema con el constructor por defecto de Control");
    }

}
