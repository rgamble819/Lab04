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
}