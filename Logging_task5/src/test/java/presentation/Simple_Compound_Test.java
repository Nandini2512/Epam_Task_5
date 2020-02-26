package presentation;
import static org.junit.Assert.*;
import org.junit.Test;


public class Simple_Compound_Test {
Simple_Compound obj=new Simple_Compound();
	
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		
		assertEquals(85,obj.Compound_Interest_Action(250,6,5));
	assertEquals(103,obj.Compound_Interest_Action(1000,5,2));
		assertEquals(75,obj.Simple_Interest_Action(250,6,5));
		assertEquals(100,obj.Simple_Interest_Action(1000,5,2));
	}

}
