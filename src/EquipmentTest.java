public class EquipmentTest
{
	public void fullEquipmentConstructor() throws AssertException 
	{
		String name = "ThrowingKnife";
		int count = 12;
		double weight = 10.0;
		double price = 50.0;
		String description = "A throwing weapon";
		
		String testLine = "ThrowingKnife/12,10.0,50.0,A throwing weapon";
		Equipment eq1 = new Equipment(testLine);
		
		Assert.assertEquals(name, eq1.getName());
		Assert.assertEquals(count, eq1.getCount());
		Assert.assertEquals(weight, eq1.getTotalWeight());
		Assert.assertEquals(price, eq1.getTotalPrice());
		Assert.assertEquals(description, eq1.getDescription());
	}
	
	public void equalsEquipmentTest() throws AssertException 
	{
		String testLineOne = "ThrowingKnife/12,10.0,50.0,A throwing weapon";
		String testLineTwo = "Unkown/-1,-1.0,-1.0,NoDesc";
		Equipment eq1 = new Equipment(testLineOne);
		Equipment eq2 = new Equipment(testLineTwo);
		
		Assert.assertEquals(true, eq1.equals(new Equipment(testLineOne)));
		Assert.assertEquals(false, eq1.equals(eq2));
	}
	
	public void toStringTest() throws AssertException 
	{
		String name = "ThrowingKnife";
		int count = 12;
		double weight = 10.0;
		double price = 50.0;
		String description = "A throwing weapon";
		String toString = String.format("Name: %s, Number: %d, Weight: %.2f lbs, Price: $%.2f - %s",
                name, count, weight, price, description);
		
		String testLineOne = "ThrowingKnife/12,10.0,50.0,A throwing weapon";
		Equipment eq1 = new Equipment(testLineOne);
		
		Assert.assertEquals(toString, eq1.toString());
	}
}